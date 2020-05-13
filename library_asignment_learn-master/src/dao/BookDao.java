
package dao;

import domain.Book;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class BookDao {
    
    public void register(Book book){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(book);
        s.getTransaction().commit();
        s.close();
    }
    
    
    public void update(Book book){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(book);
        s.getTransaction().commit();
        s.close();
    }
    
    public void delete(Book book){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(book);
        s.getTransaction().commit();
        s.close();
    }
    
    public Book findById(String id){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Book x = (Book) s.get(Book.class, id);
        s.close();
        return x;
    }
    
    public List<Book> findAll(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM Book a ");
        List<Book> list = q.list();
        s.close();
        return list;
    }
}
