package org.example

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property

import javax.inject.Inject

class GreetingExtension {

    public final Property<String> message
    public final Property<String> greeter

    @Inject
    GreetingExtension(ObjectFactory objectFactory) {
        message = objectFactory.property(String.class)
        greeter = objectFactory.property(String.class)
    }

    Property<String> getMessage() {
        return message
    }

    Property<String> getGreeter() {
        return greeter
    }
}
