package org.example

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {

    void apply(Project project) {

        def extension = project.extensions.create('greeting', GreetingPluginExtension, project)

        project.getTasks().register('hello', GreetingTask.class, new Action<GreetingTask>() {

            void execute(GreetingTask greetingTask) {
                greetingTask.getGreeter().set(extension.getGreeter())
                greetingTask.getMessage().set(extension.getMessage())
            }
        });
    }
}
