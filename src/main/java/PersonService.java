import lombok.Data;

import java.util.List;

@Data
public class PersonService {
    private PersonDAO PersonDao = new PersonDAO();

    public Person findPerson(int id) {
        return PersonDao.findById(id);
    }

    public void savePerson(Person person) {
        PersonDao.save(person);
    }

    public void deletePerson(Person person) {
        PersonDao.delete(person);
    }

    public void updatePerson(Person person) {
        PersonDao.update(person);
    }

    public List<Person> findAllPersons() {
        return PersonDao.findAll();
    }

    public Car findAutoById(int id) {
        return PersonDao.findAutoById(id);
    }
}
