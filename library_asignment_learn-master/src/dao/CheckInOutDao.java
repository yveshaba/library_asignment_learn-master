
package dao;

import domain.Book;
import domain.CheckInOut;
import domain.Client;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class CheckInOutDao {
     
    public void register(CheckInOut checkInOut){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(checkInOut);
        s.getTransaction().commit();
        s.close();
    }
    
    
    public void update(CheckInOut checkInOut){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(checkInOut);
        s.getTransaction().commit();
        s.close();
    }
    
    public void delete(CheckInOut checkInOut){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(checkInOut);
        s.getTransaction().commit();
        s.close();
    }
    
    public CheckInOut findById(String id){
        Session s = HibernateUtil.getSessionFactory().openSession();
        CheckInOut x = (CheckInOut) s.get(CheckInOut.class, id);
        s.close();
        return x;
    }
    
    public List<CheckInOut> findAll(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM CheckInOut a ");
        List<CheckInOut> list = q.list();
        s.close();
        return list;
    }
}
