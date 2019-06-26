/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaDao;

import org.libro.autor.Autor;


/**
 *
 * @author gichu
 */
public class AutorDaoHibernateImpl implements AutorDao{
    private final SessionFactory sessionFactory;
    public AutorDaoHibernateImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Autor buscarAutorNombre(String Nombre) {
        Session session = sessioFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Autor> query = builder.createQuery(Autor.class);
        Root<Autor> root = query.from(Autor.class);
        query.select(root);
        query.where(builder.equal(root.get("Nombre"), Nombre));
        Autor autor = session.createQuery(query);
        session.close();
        return autor;
      }

    @Override
    public Autor buscarAutorApellido(String Apellido) {
        Session session = sessioFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Autor> query = builder.createQuery(Autor.class);
        Root<Autor> root = query.from(Autor.class);
        query.select(root);
        query.where(builder.equal(root.get("Apellido"), Apellido));
        Autor autor = session.createQuery(query);
        session.close();
        return autor;
    }

    @Override
    public Autor buscarAutorNacionalidad(String Nacionalidad) {
        Session session = sessioFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Autor> query = builder.createQuery(Autor.class);
        Root<Autor> root = query.from(Autor.class);
        query.select(root);
        query.where(builder.equal(root.get("Nacionalidad"), Nacionalidad));
        Autor autor = session.createQuery(query);
        session.close();
        return autor;
    }

    @Override
    public Autor buscarAutorAsignaturaTema(String AsignaturaTema) {
        Session session = sessioFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Autor> query = builder.createQuery(Autor.class);
        Root<Autor> root = query.from(Autor.class);
        query.select(root);
        query.where(builder.equal(root.get("Asignatura Tema"), AsignaturaTema));
        Autor autor = session.createQuery(query);
        session.close();
        return autor;
    }

    @Override
    public Autor buscarAutorCantidadEjemplares(int CantidadEjemplares) {
       Session session = sessioFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Autor> query = builder.createQuery(Autor.class);
        Root<Autor> root = query.from(Autor.class);
        query.select(root);
        query.where(builder.equal(root.get("Cantidad Ejemplares"), CantidadEjemplares));
        Autor autor = session.createQuery(query);
        session.close();
        return autor;
    }

    @Override
    public Autor actualizarAutorAsignaturaTema(String AsignaturaTema) {
        Session session = sessioFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Autor> query = builder.createQuery(Autor.class);
        Root<Autor> root = query.from(Autor.class);
        query.update(root);
        query.where(builder.equal(root.get("Asignatura Tema"), AsignaturaTema));
        Autor autor = session.createQuery(query);
        session.close();
        return autor;
    }

    @Override
    public Autor actualizarAutorCantidadEjemplares(String CantidadEjemplares) {
         Session session = sessioFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery <Autor> query = builder.createQuery(Autor.class);
        Root <Autor> root = query.from(Autor.class);
        query.update(root);
        query.where(builder.equal(root.get("Cantidad Ejemplares"), CantidadEjemplares));
        Autor autor = session.createQuery(query);
        session.close();
        return autor;
    }
    
}
