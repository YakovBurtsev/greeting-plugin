package org.example

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {

    private final Property<String> greeter
    private final Property<String> message

    GreetingTask() {
        greeter = project.objects.property(String.class)
        message = project.objects.property(String.class)
    }

    @Input
    Property<String> getGreeter() {
        return greeter
    }

    @Input
    Property<String> getMessage() {
        return message
    }

    @TaskAction
    def greet() {
        println("${message.get()} from ${greeter.get()}")
    }
}
