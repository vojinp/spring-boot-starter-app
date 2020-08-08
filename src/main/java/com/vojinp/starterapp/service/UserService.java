package com.vojinp.starterapp.service;


import com.vojinp.starterapp.service.dto.AuthenticateRequest;
import com.vojinp.starterapp.service.dto.AuthenticateResponse;
import com.vojinp.starterapp.service.dto.RegisterUserRequest;

public interface UserService {

    /**
     * Authenticating the user
     *
     * @param authenticateRequest username and password information
     * @return token and token type
     */
    AuthenticateResponse authenticateUser(AuthenticateRequest authenticateRequest);

    /**
     * Registering new user
     *
     * @param user information of the new user
     */
    void registerUser(RegisterUserRequest user);
}
