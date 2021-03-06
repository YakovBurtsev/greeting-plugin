package com.yaburtsev.sample

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertTrue

class GreetingPluginTest {

    @Test
    void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.yaburtsev.sample.greeting'

        assertTrue(project.tasks.greet instanceof GreetingTask)
    }

}