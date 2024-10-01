package com.yugabyte.ybapi.repository;

import com.yugabyte.ybapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

