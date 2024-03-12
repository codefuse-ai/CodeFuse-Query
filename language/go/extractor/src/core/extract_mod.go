package core

import (
	"fmt"
	"io"
	"log"
	"os"
	"path/filepath"
	"strings"

	"alipay.com/code_insight/coref-go-extractor/src/orm"
	"alipay.com/code_insight/coref-go-extractor/src/util"
	"golang.org/x/mod/modfile"
	"modernc.org/mathutil"
)

type commentGroupIdxAllocator struct {
	nextIdx int
}

func (cgIdxAlloc *commentGroupIdxAllocator) nextCgIdx() int {
	ret := cgIdxAlloc.nextIdx
	cgIdxAlloc.nextIdx++
	return ret
}

// extractGoMod processes a go.mod file and stores its information in the
func (ex *Extraction) extractGoMod(path string) error {
	normPath, err := filepath.EvalSymlinks(path)
	if err != nil {
		return fmt.Errorf("failed to evaluate symlinks for go.mod file %s: %w", path, err)
	}

	path = normPath
	absPath, err := filepath.Abs(path)
	if err != nil {
		return fmt.Errorf("failed to get absolute path for go.mod file %s: %w", path, err)
	}

	ex.Lock()
	if ex.SeenGoMods[absPath] {
		ex.Unlock()
		return nil
	}
	ex.SeenGoMods[absPath] = true
	ex.Unlock()

	p, err := NewProfile(absPath, nil, ex.Db, &ex.IDManager, ex.SrcRootDir)
	if err != nil {
		return fmt.Errorf("failed to create a new profile for go.mod file %s: %w", absPath, err)
	}

	ex.extractFileInfo(p, absPath)

	file, err := os.Open(absPath)
	if err != nil {
		return fmt.Errorf("failed to open go.mod file %s: %w", absPath, err)
	}
	defer file.Close()

	data, err := io.ReadAll(file)
	if err != nil {
		return fmt.Errorf("failed to read go.mod file %s: %w", absPath, err)
	}

	// Call Parse method to parse the go.mod file
	// The parsed result will be assigned to 'modfile'
	modfile, err := modfile.Parse(absPath, data, nil)
	if err != nil {
		return fmt.Errorf("failed to parse go.mod file %s: %w", absPath, err)
	}

	extractGoModFile(p, modfile)
	return nil
}

// extractGoModFile is responsible for breaking down the contents of a parsed go.mod
// file and storing its various components into the ORM database.
func extractGoModFile(p *Profile, modfile *modfile.File) {
	cgIdxAlloc := commentGroupIdxAllocator{0}

	for idx, stmt := range modfile.Syntax.Stmt {
		extractGoModExpr(p, stmt, p.Labeler.GetFileLabel(), idx, &cgIdxAlloc)
	}

	extractGoModComments(p, modfile.Syntax, p.Labeler.GetFileLabel(), &cgIdxAlloc)

	emitGoModInfo(p, modfile)
}

// emitGoModInfo stores information about a parsed go.mod file into the ORM
// database. It extracts the module path, version requirements, and the Go version
// specified in the go.mod file.
func emitGoModInfo(p *Profile, file *modfile.File) {
	if file != nil {
		modfileId := util.GetIDFromDigest(file.Syntax.Name, "ModFile")
		// Store the mod file information.
		p.StoreTable(&orm.ModFile{
			Oid:       modfileId,
			Path:      file.Syntax.Name,
			Name:      file.Module.Mod.String(),
			GoVersion: file.Go.Version,
		})

		// Read the content of the go.mod file only once.
		content, err := util.ReadFile(file.Syntax.Name)
		if err != nil {
			util.PrintTracebackAfterDetectedBadEntrance(1, err)
			content = []byte("") // Use an empty string if reading fails.
		}

		// Store the file data with the already read content.
		p.StoreTable(&orm.FileData{
			Oid:     util.GetIDFromDigest(file.Syntax.Name, "FileData"),
			FileId:  modfileId,
			Type:    orm.GoModFile,
			Content: string(content),
		})

		// Store each requirement.
		for _, req := range file.Require {
			p.StoreTable(&orm.ModRequire{
				Oid:     util.GetIDFromDigest(file.Syntax.Name, "ModRequire"),
				ModId:   modfileId,
				Require: req.Mod.String(),
			})
		}
	}
}

// extractGoModExpr extracts expressions from a go.mod file and stores them in the Profile's data structure.
// It recursively processes various types of expressions and associated comments.
func extractGoModExpr(p *Profile, expr modfile.Expr, parent Label, idx int, cgIdxAlloc *commentGroupIdxAllocator) {
	start, end := expr.Span()
	lbl := Label{util.GetIDFromDigest(fmt.Sprintf("%s#%v#%v", p.Path, start.Line, end.Line), "ModExpr")}
	var kind int

	switch specificExpr := expr.(type) {
	case *modfile.CommentBlock:
		kind = orm.ModCommentBlockType.Index()
	case *modfile.LParen:
		kind = orm.ModLParenType.Index()
	case *modfile.RParen:
		kind = orm.ModRParenType.Index()
	case *modfile.Line, *modfile.LineBlock:
		if line, ok := specificExpr.(*modfile.Line); ok {
			kind = orm.ModLineType.Index()
			storeModTokens(p, line.Token, lbl)
		} else if block, ok := specificExpr.(*modfile.LineBlock); ok {
			kind = orm.ModLineBlockType.Index()
			storeModTokens(p, block.Token, lbl)
			extractGoModExpr(p, &block.LParen, lbl, 0, cgIdxAlloc)
			for lineIdx, line := range block.Line {
				extractGoModExpr(p, line, lbl, lineIdx+1, cgIdxAlloc)
			}
			extractGoModExpr(p, &block.RParen, lbl, len(block.Line)+1, cgIdxAlloc)
		}
	default:
		log.Fatalf("unknown go.mod expression of type %T", expr)
	}

	p.StoreTable(&orm.ModExpr{
		Oid:    lbl.ID,
		Kind:   kind,
		Parent: parent.ID,
		Idx:    idx,
	})

	extractGoModComments(p, expr, lbl, cgIdxAlloc)
	extractLocation(p, lbl, start.Line, start.LineRune, end.Line, end.LineRune, 0, 0)
}

// storeModTokens stores tokens associated with a modfile.Line or modfile.LineBlock in the Profile's data structure.
func storeModTokens(p *Profile, tokens []string, lbl Label) {
	for tokIdx, tok := range tokens {
		p.StoreTable(&orm.ModToken{
			Oid:    util.GetIDFromDigest(fmt.Sprintf("#%v:%v", lbl.ID, tokIdx), "ModToken"),
			Token:  tok,
			Parent: lbl.ID,
			Idx:    tokIdx,
		})
	}
}

// extractGoModComments extracts comments associated with a go.mod expression and stores them in the Profile's data structure.
func extractGoModComments(p *Profile, expr modfile.Expr, exprlbl Label, cgIdxAlloc *commentGroupIdxAllocator) {
	comments := expr.Comment()

	if len(comments.Before) == 0 && len(comments.Suffix) == 0 && len(comments.After) == 0 {
		return
	}

	// extract a pseudo `@commentgroup` for each expr that contains their associated comments
	start, end := expr.Span()
	grouplbl := Label{util.GetIDFromDigest(fmt.Sprintf("%s#%v#%v", p.Path, start.Line, end.Line), "GoModExprComment")}
	p.StoreTable(&orm.CommentGroup{
		Oid:    grouplbl.ID,
		FileId: p.Labeler.GetFileLabel().ID,
		Parent: p.Labeler.GetFileLabel().ID,
		Idx:    cgIdxAlloc.nextCgIdx(),
	})

	p.StoreTable(&orm.DocComment{
		Oid:            util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, exprlbl.ID), "DocComment"),
		AssociateObj:   exprlbl.ID,
		CommentGroupId: grouplbl.ID,
	})

	var allComments []modfile.Comment
	allComments = append(allComments, comments.Before...)
	allComments = append(allComments, comments.Suffix...)
	allComments = append(allComments, comments.After...)

	var startLine, startCol, endLine, endCol = 0, 0, 0, 0
	var first = true
	idx := 0
	for _, comment := range allComments {
		commentToken := strings.TrimSuffix(strings.TrimSuffix(comment.Token, "\n"), "\r")
		extractGoModComment(p, comment, commentToken, grouplbl, idx)
		idx++
		commentEndCol := comment.Start.LineRune + (len(commentToken) - 1)
		if first {
			startLine, startCol, endLine, endCol = comment.Start.Line, comment.Start.LineRune, comment.Start.Line, commentEndCol
			first = false
		} else {
			startLine, startCol = lexMin(comment.Start.Line, comment.Start.LineRune, startLine, startCol)
			endLine, endCol = lexMax(comment.Start.Line, commentEndCol, endLine, endCol)
		}
	}

	extractLocation(p, grouplbl, startLine, startCol, endLine, endCol, 0, 0)
}

type GoModExprCommentWrapper struct {
	expr modfile.Expr
}

// lexMin returns the lexicographically smaller pair of integers.
// It first compares the first elements of the pairs; if equal, it then compares the second elements.
func lexMin(a1 int, a2 int, b1 int, b2 int) (int, int) {
	if a1 < b1 {
		return a1, a2
	} else if a1 > b1 {
		return b1, b2
	} else {
		return a1, mathutil.Min(a2, b2)
	}
}

// lexMax returns the lexicographically larger pair of integers.
// It first compares the first elements of the pairs; if equal, it then compares the second elements.
func lexMax(a1 int, a2 int, b1 int, b2 int) (int, int) {
	if a1 < b1 {
		return b1, b2
	} else if a1 > b1 {
		return a1, a2
	} else {
		return a1, mathutil.Max(a2, b2)
	}
}

func extractGoModComment(p *Profile, comment modfile.Comment, commentToken string, grouplbl Label, idx int) {
	lbl := Label{util.GetIDFromDigest(fmt.Sprintf("%s#%v#%v", p.Path, comment.Start.Line, comment.Token), "GoModComment")}

	p.StoreTable(&orm.Comment{
		Oid:         lbl.ID,
		FileId:      p.Labeler.GetFileLabel().ID,
		CommentType: orm.SlashSlashComment.Index(),
		Parent:      grouplbl.ID,
		Index:       int64(idx),
		DebugInfo:   commentToken,
	})

	extractLocation(p, lbl, comment.Start.Line, comment.Start.LineRune, comment.Start.Line, comment.Start.LineRune+(len(commentToken)-1), 0, 0)
}
