package com.vojinp.starterapp.exceptions;


import com.vojinp.starterapp.constants.ErrorMessages;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String username) {
        super(String.format(ErrorMessages.USER_ALREADY_EXISTS, username));
    }
}
