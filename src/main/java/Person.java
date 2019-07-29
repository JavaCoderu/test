

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int age;
    private String name;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Car> cars;

    public Person() {
        cars = new ArrayList<>();
    }

    public void setCar(Car car){
        car.setPerson(this);
        cars.add(car);
    }

    public void removeAuto(Car car) {
        cars.remove(car);
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
        cars = new ArrayList<>();
    }
}
