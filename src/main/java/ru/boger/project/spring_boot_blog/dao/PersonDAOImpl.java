package ru.boger.project.spring_boot_blog.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.boger.project.spring_boot_blog.entity.Person;

import javax.persistence.EntityManager;

@Repository
public class PersonDAOImpl implements PersonDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public void savePerson(Person person) {
        Session session = entityManager.unwrap(Session.class);
        session.save(person);
    }
}
