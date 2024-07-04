

import { Position } from './position';

export interface ParseError {
  message: string;
  position: Position;
}
