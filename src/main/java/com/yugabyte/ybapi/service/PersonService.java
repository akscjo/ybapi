package com.yugabyte.ybapi.service;


import com.yugabyte.ybapi.model.Person;
import com.yugabyte.ybapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }
}

