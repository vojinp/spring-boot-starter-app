package com.vojinp.starterapp.web.controller;

import com.vojinp.starterapp.service.ExampleService;
import com.vojinp.starterapp.service.dto.ExampleRequest;
import com.vojinp.starterapp.service.dto.ExampleResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/examples")
@Api(value = "Example menagement system", description = "Operations to the examples")
@AllArgsConstructor
public class ExampleController {
    private final ExampleService exampleService;

    @PostMapping("")
    @ApiOperation(
            value = "Create new example",
            response = ExampleResponse.class,
            authorizations = {@Authorization(value = "jwtToken")})
    public ResponseEntity<ExampleResponse> create(ExampleRequest exampleRequest)
            throws URISyntaxException {
        ExampleResponse exampleResponse = exampleService.create(exampleRequest);

        return ResponseEntity.created(
                        new URI(String.format("/api/examples/%d", exampleResponse.getId())))
                .body(exampleResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation(
            value = "Change the example",
            response = ExampleResponse.class,
            authorizations = {@Authorization(value = "jwtToken")})
    public ResponseEntity<ExampleResponse> change(Long id, ExampleRequest exampleRequest) {
        ExampleResponse exampleResponse = exampleService.change(id, exampleRequest);

        return ResponseEntity.ok(exampleResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation(
        value = "Fetch the example",
        response = ExampleResponse.class,
        authorizations = {@Authorization(value = "jwtToken")})
    public ResponseEntity<ExampleResponse> get(Long id) {
        ExampleResponse exampleResponse = exampleService.get(id);

        return ResponseEntity.ok(exampleResponse);
    }

    @GetMapping("")
    @ApiOperation(
        value = "Fetch all examples",
        response = List.class,
        authorizations = {@Authorization(value = "jwtToken")})
    public ResponseEntity<List<ExampleResponse>> getAll() {
        List<ExampleResponse> exampleResponses = exampleService.getAll();

        return ResponseEntity.ok(exampleResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(
        value = "Delete the example",
        response = ExampleResponse.class,
        authorizations = {@Authorization(value = "jwtToken")})
    public ResponseEntity delete(Long id) {
        exampleService.delete(id);

        return ResponseEntity.ok().build();
    }
}
