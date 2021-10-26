package com.manish.chain_of_responsibility.error_handler_example;

public class ErrorRaiser {
    private final ErrorHandler chainHead;

    public ErrorRaiser(ErrorHandler chainHead) {
        this.chainHead = chainHead;
    }

    public void raiseError(final Message message) {
        if (chainHead != null) {
            boolean isProcessed = chainHead.processMessage(message);
            if(!isProcessed) {
                System.out.println("Message can't processed.!");
            }
        }
    }
}
