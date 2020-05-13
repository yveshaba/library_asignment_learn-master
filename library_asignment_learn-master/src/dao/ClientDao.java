
package dao;

import domain.Book;
import domain.Client;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClientDao {
     
    public void register(Client client){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(client);
        s.getTransaction().commit();
        s.close();
    }
    
    
    public void update(Client client){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(client);
        s.getTransaction().commit();
        s.close();
    }
    
    public void delete(Client client){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(client);
        s.getTransaction().commit();
        s.close();
    }
    
    public Client findById(String id){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Client x = (Client) s.get(Client.class, id);
        s.close();
        return x;
    }
    
    public List<Client> findAll(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM Client a ");
        List<Client> list = q.list();
        s.close();
        return list;
    }
}
