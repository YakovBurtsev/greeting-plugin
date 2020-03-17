package org.example

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {

    private final Property<String> greeter
    private final Property<String> message

    GreetingTask() {
        def greetingPluginExtension = getProject().getExtensions().getByType(GreetingPluginExtension)
        greeter = greetingPluginExtension.greeter
        message = greetingPluginExtension.message
    }

    @TaskAction
    def greet() {
        println("${message.get()} from ${greeter.get()}")
    }
}
