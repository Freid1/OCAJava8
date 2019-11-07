package ru.dilmar.test;

import ru.dilmar.user.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestH2Hibernate {
    public static void main(String[] args) {
        EntityManager manager= Persistence.createEntityManagerFactory("H2JPAHibernate").createEntityManager();
        manager.getTransaction().begin();
        manager.persist(new User("pety","54321","pety@mail.ru"));
        manager.getTransaction().commit();
        manager.close();
    }
}
