package com.sdacademy;

import com.sdacademy.Entity.Author;
import com.sdacademy.Entity.Book;
import com.sdacademy.Entity.Category;
import com.sdacademy.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

         Session session=HibernateUtils.getSession();

        Author author=new Author();
        Book book=new Book();
        Category category=new Category();
        BookDAO bookDAO=new BookDAO();
        Transaction transaction=null;

        try {
            transaction = session.beginTransaction();
            session.save(author);
            session.save(book);
            session.save(category);
            transaction.commit();
            bookDAO.insertBook(book);
        }catch (Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            if(session!=null)
            session.close();
        }




    }
}
