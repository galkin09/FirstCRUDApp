package course.dao;

import course.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDao {
    private static int COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++COUNT, "Tom"));
        people.add(new Person(++COUNT, "Jack"));
        people.add(new Person(++COUNT, "Bob"));
        people.add(new Person(++COUNT, "Katy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToUpdate = show(id);
        personToUpdate.setName(updatedPerson.getName());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
