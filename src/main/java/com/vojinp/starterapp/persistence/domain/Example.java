package com.vojinp.starterapp.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "examples")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Example {
    @Id @GeneratedValue private Long id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String value;
}
