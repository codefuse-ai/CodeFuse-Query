package com.alipay.codequery.project;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.kotlin.cli.common.CLIConfigurationKeys;
import org.jetbrains.kotlin.cli.common.messages.MessageCollector;
import org.jetbrains.kotlin.config.CommonConfigurationKeys;
import org.jetbrains.kotlin.config.CompilerConfiguration;
import org.jetbrains.kotlin.config.JVMConfigurationKeys;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProjectUtil {

    public static List<String> getClassPaths(List<String> classpath) {
        List<String> paths = new ArrayList<>();
        if (classpath != null && !classpath.isEmpty()) {
            if (classpath.size() == 1) {
                String classpathString = classpath.get(0);
                if (classpathString != null && classpathString.length() > 0) {
                    paths = Arrays.asList(classpathString.split(File.pathSeparator));
                }
            } else {
                paths = classpath;
            }
        }
        paths.removeIf(el -> el.endsWith(".pom"));
        return paths;
    }

    public static CompilerConfiguration buildCompileConfig(String javaHome) {
        CompilerConfiguration compileConfig = new CompilerConfiguration();
        if(StringUtils.isBlank(javaHome)) {
            compileConfig.put(JVMConfigurationKeys.NO_JDK, true);
        } else {
            compileConfig.put(JVMConfigurationKeys.NO_JDK, false);
            File jdkDir = new File(javaHome);
            if(!jdkDir.exists()) {
                throw new RuntimeException("wrong jdkHome: " + javaHome);
            }
            compileConfig.put(JVMConfigurationKeys.JDK_HOME, jdkDir);
        }

        // configuration.put(JVMConfigurationKeys.CONTENT_ROOTS, new ArrayList<>(500));
        compileConfig.put(JVMConfigurationKeys.ADDITIONAL_JAVA_MODULES, Collections.emptyList());

        compileConfig.put(CLIConfigurationKeys.MESSAGE_COLLECTOR_KEY, MessageCollector.Companion.getNONE());
        compileConfig.put(CommonConfigurationKeys.MODULE_NAME, "psi");
        // configuration.put(JVMConfigurationKeys.USE_JAVAC, true);
        compileConfig.put(JVMConfigurationKeys.USE_SINGLE_MODULE, true);
        // configuration.put(JVMConfigurationKeys.USE_PSI_CLASS_FILES_READING, false);

        return compileConfig;
    }
}
