/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaDao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sector.tesisCarrera.TesisCarrera;

/**
 *
 * @author gichu
 */
public class TesisCarreraDaoHibernateImpl implements TesisCarreraDao{

    private final SessionFactory sessionFactory;
    public TesisCarreraDaoHibernateImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    
    
}

    @Override
    public TesisCarrera buscarTesisCarreraTesisDoc(String TesisDoctorado) {
       Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.select(root);
        query.where(builder.equal(root.get("Tesis de Doctorado"), TesisDoctorado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
    }

    @Override
    public TesisCarrera buscarTesisCarreraTesisPos(String TesisPosgrado) {
        Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.select(root);
        query.where(builder.equal(root.get("Tesis de Posgrado"), TesisPosgrado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
    }
        
    @Override
    public TesisCarrera buscarTesisCarreraTesisGrado(String TesisGrado) {
       Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.select(root);
        query.where(builder.equal(root.get("Tesis de Grado"), TesisGrado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
    }

    @Override
    public TesisCarrera insertarTesisCarreraTesisDoc(String TesisDoctorado) {
        Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.insert(root);
        query.where(builder.equal(root.get("Agregar nueva Tesis de Doctorado"), TesisDoctorado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
    }

    @Override
    public TesisCarrera insertarTesisCarreraTesisPos(String TesisPosgrado) {
        Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.insert(root);
        query.where(builder.equal(root.get("Agregar nueva Tesis de Posgrado"), TesisPosgrado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
    }

    @Override
    public TesisCarrera insertarTesisCarreraTesisGrado(String TesisGrado) {
        Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.insert(root);
        query.where(builder.equal(root.get("Agregar nueva Tesis de Grado"), TesisGrado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
    }
       

    @Override
    public TesisCarrera actualizarTesisCarreraTesisDoc(String TesisDoctorado) {
        Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.update(root);
        query.where(builder.equal(root.get("Actualizar Tesis de Doctorado"), TesisDoctorado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
     
    }

    @Override
    public TesisCarrera actualizarTesisCarreraTesisPos(String TesisPosgrado) {
        Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.update(root);
        query.where(builder.equal(root.get("Actualizar Tesis de Posgrado"), TesisPosgrado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
    }
        

    @Override
    public TesisCarrera actualizarTesisCarreraTesisGrado(String TesisGrado) {
        Session session = sessionFactory.openSession();
       CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TesisCarrera> query = builder.createQuery(TesisCarrera.class);
        Root<TesisCarrera> root = query.from(TesisCarrera.class);
        query.update(root);
        query.where(builder.equal(root.get("Actualizar Tesis de Grado"), TesisGrado));
        TesisCarrera tesisCarrera = session.createQuery(query);
        session.close();
        return tesisCarrera;
    }
}
