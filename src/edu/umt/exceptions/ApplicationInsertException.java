package edu.umt.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: tb189431e
 * Date: 7/17/13
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationInsertException extends Exception{
    public ApplicationInsertException() {
        super();
    }

    public ApplicationInsertException(String message){
        super("The instance of this new application: " + message + " failed.");
    }
}
