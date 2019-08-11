package com.sdacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {


    private static final SessionFactory sesionFactory=new Configuration()
            .configure().buildSessionFactory();
    public static SessionFactory getSesionFactory() {
        return sesionFactory;
    }

    private static final Session session=sesionFactory.openSession();

    public static Session getSession() {
        return session;
    }
}
