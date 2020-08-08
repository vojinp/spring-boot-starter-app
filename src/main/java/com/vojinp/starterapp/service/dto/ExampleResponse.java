package com.vojinp.starterapp.service.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Example response")
public class ExampleResponse {
  @ApiModelProperty(notes = "Id of the example")
  private Long id;
  @ApiModelProperty(notes = "Value of the example")
  private String value;
}
