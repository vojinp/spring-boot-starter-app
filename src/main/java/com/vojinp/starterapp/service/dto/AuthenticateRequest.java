package com.vojinp.starterapp.service.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Username and password for login")
public class AuthenticateRequest {

    @NotBlank(message = "AuthenticateRequest.username cannot be null or empty.")
    @ApiModelProperty(notes = "Username for login")
    private String username;

    @NotBlank(message = "AuthenticateRequest.password cannot be null or empty.")
    @ApiModelProperty(notes = "Passowrd for login")
    private String password;
}
