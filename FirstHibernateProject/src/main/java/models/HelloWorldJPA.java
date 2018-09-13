package main.java.models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.transaction.UserTransaction;
import javax.persistence.spi.PersistenceProvider;

public class HelloWorldJPA {
//org.jpwh.model.helloworld.Message
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");
       /*
        EntityManager em = emf.createEntityManager();
        
        Message message = new Message();
        message.setText("Hello World!");
        em.persist(message);
      
        em.close();*/
    }

}
