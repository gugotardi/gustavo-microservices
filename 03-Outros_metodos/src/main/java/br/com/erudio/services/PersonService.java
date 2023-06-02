package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class        PersonService {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person){
        return person;
    }

    public Person update(Person person){
        return person;
    }

    public void delete(String id){

    }

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Gustavo");
        person.setSecondName("Gotardi");
        person.setAddress("São Carlos - São Paulo - Brasil");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i< 7; i++) {
            Person person = mockPerson(i);
            persons.add(person);

        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person Name" + i);
        person.setSecondName("Last Name" + i);
        person.setAddress("Some address in Brasil" + i);
        person.setGender("Male" + i);
        return person;
    }
}
