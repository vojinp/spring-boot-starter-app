package com.vojinp.starterapp.web.vm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorViewModel {
    private String message;
    private ErrorCode code;
}
