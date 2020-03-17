package org.example

import org.gradle.api.Project
import org.gradle.api.provider.Property

class GreetingPluginExtension {

    private final Property<String> message
    private final Property<String> greeter

    GreetingPluginExtension(Project project) {
        message = project.getObjects().property(String.class)
        greeter = project.getObjects().property(String.class)
    }

    Property<String> getMessage() {
        return message
    }

    Property<String> getGreeter() {
        return greeter
    }
}
