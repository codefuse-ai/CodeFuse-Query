/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type { CorefTopLevel, TopLevel } from "../../../model/coref";
import type { SourceFile } from "../../../model/extended-ts";
import * as util from "../../util";

export function extractTopLevel(
  sourceFile: SourceFile,
  corefTopLevel: CorefTopLevel,
) {
  const { astNode } = util.ensureCorefAstNodeAndLocation(sourceFile);
  corefTopLevel.topLevels.push(astNode as TopLevel);

  sourceFile.statements.forEach((statement, index) => {
    corefTopLevel.topLevelStatements.push({
      statement_id: util.getCorefIdFromTsNodeInSameFile(statement),
      top_level_id: astNode.id,
      index,
    });
  });
}
