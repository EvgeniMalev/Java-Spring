package bg.softuni;

import bg.softuni.entities.Country;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("school-unit");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Country insert = new Country("Bulgaria");
        insert.setContinent("Europe");
        insert.setPopulation(7000000);
        entityManager.persist(insert);

        Country found = entityManager.find(Country.class, 1L);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Country with ID 1 not found.");
        }

        List<Country> countries = entityManager
                .createQuery("FROM Country", Country.class).getResultList();

        for (Country country : countries) {
            System.out.println(country);
        }

        if (!countries.isEmpty()) {
            Country last = countries.get(countries.size() - 1);
            entityManager.remove(last);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }
}
