package com.manish.chain_of_responsibility.error_handler_example;

public interface ErrorHandler {
    boolean processMessage(Message message);
    void setNextErrorHandler(ErrorHandler errorHandler);
}
