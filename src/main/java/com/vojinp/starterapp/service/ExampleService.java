package com.vojinp.starterapp.service;

import com.vojinp.starterapp.service.dto.ExampleRequest;
import com.vojinp.starterapp.service.dto.ExampleResponse;
import java.util.List;

public interface ExampleService {

  ExampleResponse create(ExampleRequest exampleRequest);

  ExampleResponse change(Long id, ExampleRequest exampleRequest);

  ExampleResponse get(Long id);

  List<ExampleResponse> getAll();

  void delete(Long id);
}
