import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String color, model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_Id")
    private Person person;

    Car(){}

    Car(String model,String color){
        this.color = color;
        this.model = model;
    }
}
