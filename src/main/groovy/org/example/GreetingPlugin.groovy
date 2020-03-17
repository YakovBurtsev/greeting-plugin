package org.example

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {

    void apply(Project project) {
        def extension = project.extensions.create('greeting', GreetingPluginExtension)

        project.task('hello', type: GreetingTask) {
            greeting = "${extension.message} from ${extension.greeter}"
        }
    }
}
