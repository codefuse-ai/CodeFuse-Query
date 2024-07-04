

import * as ts from 'typescript';

import * as coref from '../coref';
import { NodeBase } from './node';

export interface ExpressionBase extends NodeBase {
  $corefModel?: coref.Expression;
}

export interface Expression extends ts.Expression, ExpressionBase {}

export interface CallExpression extends ts.CallExpression, ExpressionBase {}

export interface NewExpression extends ts.NewExpression, ExpressionBase {}

export interface TaggedTemplateExpression
  extends ts.TaggedTemplateExpression,
    ExpressionBase {}

export interface Decorator extends ts.Decorator, ExpressionBase {}

export interface JsxSelfClosingElement
  extends ts.JsxSelfClosingElement,
    ExpressionBase {}

export interface JsxOpeningElement
  extends ts.JsxOpeningElement,
    ExpressionBase {}

export type JsxOpeningLikeElement = JsxSelfClosingElement | JsxOpeningElement;

export type CallLikeExpression =
  | CallExpression
  | NewExpression
  | TaggedTemplateExpression
  | Decorator
  | JsxOpeningLikeElement;

export interface PropertyAccessExpression
  extends ts.PropertyAccessExpression,
    ExpressionBase {}

export interface ElementAccessExpression
  extends ts.ElementAccessExpression,
    ExpressionBase {}

export type AccessExpression =
  | PropertyAccessExpression
  | ElementAccessExpression;

export type MayInvokeExpression = CallLikeExpression | AccessExpression;
