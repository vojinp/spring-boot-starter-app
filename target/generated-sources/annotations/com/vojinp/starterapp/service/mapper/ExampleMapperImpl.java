package com.vojinp.starterapp.service.mapper;

import com.vojinp.starterapp.persistence.domain.Example;
import com.vojinp.starterapp.service.dto.ExampleRequest;
import com.vojinp.starterapp.service.dto.ExampleResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-08T17:38:17+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 12 (Oracle Corporation)"
)
@Component
public class ExampleMapperImpl implements ExampleMapper {

    @Override
    public ExampleResponse toDto(Example example) {
        if ( example == null ) {
            return null;
        }

        ExampleResponse exampleResponse = new ExampleResponse();

        exampleResponse.setId( example.getId() );
        exampleResponse.setValue( example.getValue() );

        return exampleResponse;
    }

    @Override
    public Example toEntity(ExampleRequest exampleRequest) {
        if ( exampleRequest == null ) {
            return null;
        }

        Example example = new Example();

        example.setValue( exampleRequest.getValue() );

        return example;
    }
}
