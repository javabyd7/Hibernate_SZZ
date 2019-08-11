package com.sdacademy;

import com.sdacademy.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        User user = new User("n","kowalsky",1000);
        Transaction transaction=null;
        transaction=session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();



    }
}
