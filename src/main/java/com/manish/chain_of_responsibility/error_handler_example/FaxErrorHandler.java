package com.manish.chain_of_responsibility.error_handler_example;

public class FaxErrorHandler implements ErrorHandler {
    private ErrorHandler nextErrorHandler;

    @Override
    public boolean processMessage(final Message message) {
        if (message.getText().contains("fax")) {
            System.out.print("FaxErrorHandler Processed " + message.getPriority() + " priority");
            System.out.println(" message " + message.getText());
            return true;
        } else {
            if (nextErrorHandler != null)
               return nextErrorHandler.processMessage(message);
        }
        return false;
    }

    @Override
    public void setNextErrorHandler(final ErrorHandler errorHandler) {
        nextErrorHandler = errorHandler;
    }
}
