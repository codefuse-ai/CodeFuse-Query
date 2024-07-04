import * as path from 'path';

import type { PackageJson } from 'type-fest';

import { FrameworkExtractorBase } from './type';

/**
 * Get enabled framework extractors
 *
 * @param frameworkExtractors
 * @param projectPath
 * @returns
 */
export async function getEnabledFrameworkExtractors(
  frameworkExtractors: FrameworkExtractorBase[],
  projectPath: string,
): Promise<FrameworkExtractorBase[]> {
  const packageJsonPath = path.join(projectPath, 'package.json');
  let packageJson: PackageJson | undefined;
  try {
    packageJson = await import(packageJsonPath);
  } catch (e) {
    console.log(`Could not find "package.json": ${packageJsonPath}.`);
    return [];
  }

  return frameworkExtractors.filter(extractor =>
    packageJson ? extractor.detectByPackageJson(packageJson) : false,
  );
}
