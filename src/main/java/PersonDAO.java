import javax.persistence.EntityManager;
import java.util.List;

public class PersonDAO {

        public Person findById(int id) {
            EntityManager e = UtillHiber.getEntityManagerFactory().createEntityManager();
            Person p = e.find(Person.class, id);
            e.close();
            return p;
        }

        public void save(Person person) {
            EntityManager em = UtillHiber.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
            em.close();
        }

        public void update(Person person) {
            EntityManager em = UtillHiber.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
            em.close();
        }

        public void delete(Person person) {
            EntityManager em = UtillHiber.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            em.remove(person);
            em.getTransaction().commit();
            em.close();
        }

        public Car findAutoById(int id) {
            EntityManager e = UtillHiber.getEntityManagerFactory().createEntityManager();
            Car p = e.find(Car.class, id);
            e.close();
            return p;
        }

        public List<Person> findAll() {
            EntityManager e = UtillHiber.getEntityManagerFactory().createEntityManager();
            List<Person> users = (List<Person>)  e.createQuery("From Person").getResultList();
            e.close();
            return users;
        }
    }
