package com.example.burntcd.service;

import com.example.burntcd.dao.PersonDoa;
import com.example.burntcd.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDoa personDoa;

    @Autowired
    public PersonService(@Qualifier("fakeDao") personDoa)  {
        this.personDoa = personDoa;
    }

    public int addPerson(Person person) {
        return personDoa.insertPerson(person);
    }
}
