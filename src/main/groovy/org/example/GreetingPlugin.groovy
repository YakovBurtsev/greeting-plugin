package org.example

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {

    void apply(Project project) {

        project.extensions.create('greeting', GreetingPluginExtension, project)

        project.task('hello', type: GreetingTask)
    }
}
