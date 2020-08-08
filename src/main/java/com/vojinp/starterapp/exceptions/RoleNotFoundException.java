package com.vojinp.starterapp.exceptions;


import com.vojinp.starterapp.constants.ErrorMessages;

public class RoleNotFoundException extends RuntimeException {

    public RoleNotFoundException(String name) {
        super(String.format(ErrorMessages.ROLE_NOT_FOUND, name));
    }
}
