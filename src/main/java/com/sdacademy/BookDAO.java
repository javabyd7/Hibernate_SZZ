package com.sdacademy;

import com.sdacademy.Entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDAO {
    public Book insertBook(Book book){
        Session session= HibernateUtils.getSession();
        Transaction transaction= session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
        return book;
    }
}
