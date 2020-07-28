package dao;

import entidades.Ciudades;
import entidades.Climas;
import entidades.Coordenadas;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Wolf
 */
public class CiudadesDao {

    static Session session = null;
    
   

    public Integer insertarCiudad(Ciudades ciudad) {
        System.out.println("aqui va" + ciudad.getCiudad());
        Session session = HibernateUtil.getSessionFactory().openSession();
        //Transaction trans = session.beginTransaction();
        session.beginTransaction();
        session.save(ciudad);
        session.getTransaction().commit();
        session.close();
        return ciudad.getIdCiudad();
    }
    
    public Ciudades buscarCiudad(Integer idCiudad) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //Transaction trans = session.beginTransaction();
        session.beginTransaction();
        Query q = session.createQuery("from c in class entidades.Ciudades where c.idCiudad =:idciudad");
        Ciudades ciudad = new Ciudades();
        q.setParameter("idciudad", idCiudad);
        q.setProperties(ciudad);
        List<Ciudades> ciudades = q .list();
        for (Ciudades ciudad1 : ciudades) {
         ciudad = ciudad1;
        }
        session.getTransaction().commit();
        session.close();
        return ciudad;
    }
    
    public void insertarCoordenada(Coordenadas coordenada) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //Transaction trans = session.beginTransaction();
        session.beginTransaction();
        session.save(coordenada);
        session.getTransaction().commit();
        session.close();
    }
    
    public void insertarClima(Climas clima) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //Transaction trans = session.beginTransaction();
        session.beginTransaction();
        session.save(clima);
        session.getTransaction().commit();
        session.close();
    }
    

}
