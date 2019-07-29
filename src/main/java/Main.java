import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        PersonService personService = new PersonService();
        Person person = new Person("Masha", 26);
        personService.savePerson(person);
        Car ferrari = new Car("Ferrari", "red");
        ferrari.setPerson(person);
        person.setCar(ferrari);
        Car ford = new Car("Ford", "black");
        ford.setPerson(person);
        person.setCar(ford);
        Person p2 = new Person("Cab", 34);
        personService.savePerson(p2);
        personService.updatePerson(person);
        person.setName("Sasha");
        personService.updatePerson(person);
        //System.out.println(personService.findAllPersons());
        //System.out.println(personService.findAllPersons());
    }
}

