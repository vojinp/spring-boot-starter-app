package com.vojinp.starterapp.service.impl;

import com.vojinp.starterapp.exceptions.EntityNotFoundException;
import com.vojinp.starterapp.persistence.domain.Example;
import com.vojinp.starterapp.persistence.repository.ExampleRepository;
import com.vojinp.starterapp.service.ExampleService;
import com.vojinp.starterapp.service.dto.ExampleRequest;
import com.vojinp.starterapp.service.dto.ExampleResponse;
import com.vojinp.starterapp.service.mapper.ExampleMapper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExampleServiceImpl implements ExampleService {
    private final ExampleRepository exampleRepository;
    private final ExampleMapper exampleMapper;

    @Override
    public ExampleResponse create(ExampleRequest exampleRequest) {
        Example example = exampleMapper.toEntity(exampleRequest);

        return exampleMapper.toDto(exampleRepository.save(example));
    }

    @Override
    public ExampleResponse change(Long id, ExampleRequest exampleRequest) {
        findById(id);

        Example example = exampleMapper.toEntity(exampleRequest);
        example.setId(id);

        return exampleMapper.toDto(exampleRepository.save(example));
    }

    @Override
    public ExampleResponse get(Long id) {
        return exampleMapper.toDto(findById(id));
    }

    @Override
    public List<ExampleResponse> getAll() {
        return exampleRepository.findAll().stream()
                .map(exampleMapper::toDto)
                .collect(Collectors.toList());
    }

  @Override
  public void delete(Long id) {
      exampleRepository.deleteById(id);
  }

  private Example findById(Long id) {
        return exampleRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Example", id));
    }
}
