package com.vojinp.starterapp.persistence.repository;

import com.vojinp.starterapp.persistence.domain.Example;
import com.vojinp.starterapp.persistence.domain.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long> {
}
