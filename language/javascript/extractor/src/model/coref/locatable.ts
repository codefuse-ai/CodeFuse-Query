

import { BaseModel } from './base-model';
import { Location } from './location';

export interface Locatable extends BaseModel {
  location: Location;
}
