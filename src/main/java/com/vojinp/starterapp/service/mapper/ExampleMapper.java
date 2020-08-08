package com.vojinp.starterapp.service.mapper;

import com.vojinp.starterapp.persistence.domain.Example;
import com.vojinp.starterapp.service.dto.ExampleRequest;
import com.vojinp.starterapp.service.dto.ExampleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExampleMapper {
  ExampleResponse toDto(Example example);

  @Mapping(target = "id", ignore = true)
  Example toEntity(ExampleRequest exampleRequest);
}
