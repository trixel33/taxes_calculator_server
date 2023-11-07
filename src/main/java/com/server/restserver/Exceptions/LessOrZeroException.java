package com.server.restserver.Exceptions;

public class LessOrZeroException extends Exception{
    public String message (){
        return ("You've entered a value less than zero, or zero. Please re-enter correct value");
    }

}
