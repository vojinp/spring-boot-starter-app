package com.vojinp.starterapp.exceptions;


import com.vojinp.starterapp.constants.ErrorMessages;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String entity, Long id) {
        super(String.format(ErrorMessages.ENTITY_WITH_ID_NOT_FOUND, entity, id));
    }
}
