package com.manish.chain_of_responsibility.error_handler_example;

public class Message {

    public enum Priority {
        NORMAL, HIGH
    }

    private final String text;
    private final Priority priority;

    public Message(String text, Priority priority) {
        this.text = text;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public Priority getPriority() {
        return priority;
    }
}
