import { chairExtractor } from './chair';
import { FrameworkExtractorBase } from './type';
export { FrameworkCoref, FrameworkExtractorBase } from './type';
export { getEnabledFrameworkExtractors } from './util';

export const frameworkExtractors: FrameworkExtractorBase[] = [chairExtractor];
