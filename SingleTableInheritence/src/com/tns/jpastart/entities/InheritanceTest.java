package com.tns.jpastart.entities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class InheritanceTest {
    public static void main(String args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory( & quot; JPA - PU & quot;);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Employee employee = new Employee();
        employee.setName( & quot; jhon & quot;);
        employee.setSalary(5000);
        em.persist(employee);
        Manager manager = new Manager();
        manager.setName( & quot; gokul & quot;);
        manager.setSalary(9000);
        manager.setDepartmentName( & quot; sales & quot;);
        em.persist(manager);
        em.getTransaction().commit();
        System.out.println( & quot; addedd one employee and manger to database & quot;);
        em.close();
        factory.close();
    }
}