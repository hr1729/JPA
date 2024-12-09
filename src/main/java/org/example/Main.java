package org.example;


import org.example.domain.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("org.example");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student hri = new Student("hri","a",new Date());
        em.persist(hri);

        em.getTransaction().commit();

    }
}
