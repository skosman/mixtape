package com.example.burntcd.dao;

import com.example.burntcd.model.Person;

import java.util.UUID;

public interface PersonDoa {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
