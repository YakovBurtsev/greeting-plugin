package com.yaburtsev.sample

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {

    void apply(Project project) {

        def extension = project.extensions.create('greeting', GreetingExtension)

        project.getTasks().register('greet', GreetingTask.class, new Action<GreetingTask>() {

            void execute(GreetingTask greetingTask) {
                greetingTask.greeter.set(extension.greeter)
                greetingTask.message.set(extension.message)
            }
        })
    }
}
