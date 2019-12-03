package com.macs.group6.daldiscussion.exceptions;
/*
@author Sharon Alva
*/
public class ServiceException extends Exception{

    public ServiceException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}