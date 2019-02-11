package com.example.hello1.Service;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.example.hello1.Model.Employee;


public class helloservice {
    public static void main( String[ ] args )
    {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink JPA");

        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        Employee employee = new Employee( 1202,"gopal",400000,"hgf");


        entitymanager.persist( employee );
        entitymanager.getTransaction( ).commit( );

        entitymanager.close( );
        emfactory.close( );
    }

}
