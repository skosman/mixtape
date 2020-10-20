package com.example.burntcd.dao;

import com.example.burntcd.model.Person;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDoa {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int intersetPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
