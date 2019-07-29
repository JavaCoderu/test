import lombok.experimental.UtilityClass;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

@UtilityClass
public class UtillHiber {
    @PersistenceUnit
    protected static EntityManagerFactory emf;

    public static EntityManagerFactory  getEntityManagerFactory() {
        if (emf == null) {
            try {
                emf = Persistence.createEntityManagerFactory( "Postres" );
            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return emf;
    }
}
