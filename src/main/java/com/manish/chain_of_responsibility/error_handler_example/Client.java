package com.manish.chain_of_responsibility.error_handler_example;

public class Client {
    public static void main(String[] args) {

        ErrorHandler emailErrorHandler = new EmailErrorHandler();
        ErrorHandler faxErrorHandler = new FaxErrorHandler();

        faxErrorHandler.setNextErrorHandler(emailErrorHandler);

        ErrorRaiser errorRaiser = new ErrorRaiser(faxErrorHandler);

        Message firstMessage = new Message("email id is not valid", Message.Priority.NORMAL);
        errorRaiser.raiseError(firstMessage);

        Message secondMessage = new Message("email can't be send now", Message.Priority.HIGH);
        errorRaiser.raiseError(secondMessage);

        Message thirdMessage = new Message("fax is currently unavailable", Message.Priority.NORMAL);
        errorRaiser.raiseError(thirdMessage);

        Message forthMessage = new Message("fax machine not working", Message.Priority.HIGH);
        errorRaiser.raiseError(forthMessage);

        Message fifthMessage = new Message("this should not process", Message.Priority.NORMAL);
        errorRaiser.raiseError(fifthMessage);
    }
}
