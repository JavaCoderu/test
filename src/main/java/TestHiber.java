import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import junit.framework.TestCase;

public class TestHiber extends TestCase{
    private EntityManagerFactory emf;
    @Override
    protected void setUp() throws Exception {
        emf = Persistence.createEntityManagerFactory( "Postres" );
    }

    @Override
    protected void tearDown() throws Exception {
        emf.close();
    }

    public void testBasicUsage() {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Person p = new Person();
        entityManager.persist(p);
        Car c = new Car();
        p.setCar(c);
        c.setPerson(p);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
