package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
//import javax.persistence.Query;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;

@Repository
@CrossOrigin(origins = UserDao.HTTP_LOCALHOST_5000)
public class UserDao {

    /**
	 *
	 */
    @PersistenceContext(unitName = "entityManagerFactory")
	private EntityManager emf;
	static final String HTTP_LOCALHOST_5000 = "http://localhost:5000";
	@PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<User> findUsers() {
    
        Query qry;
        Session session = entityManager.unwrap(Session.class);
       // List<User> users=null;
       /* String query = "select distinct name,address1 from  users ";
        qry = session.createSQLQuery(query);
        return qry.getResultList();*/
        Query<User>  query = session.createQuery("from com.example.demo.entity.User");
        List<User> users = query.list();
        //String query = "select id,name,address1,address2,city,username,password from Users ";
        //qry = session.createSQLQuery(query);
        //users=qry.getResultList();
        return users;
      
    }
    //public List<User> findAll();

    public  User findUser(int id){
        System.out.println("ctrl comes to findUser---dao-"+id);

        Query qry;
        Session session = entityManager.unwrap(Session.class);
        User user=null;
        String query = "select name,address1,address2,city,username,password from Users u where id=:id";
        qry = session.createSQLQuery(query);
        user=(User)qry.getSingleResult();
        return user;
    }

    public  void delUser(int id){
        
        //Query query = entityManager.createQuery("Delete  from Users c where c.id = :id");
        //query.setParameter("id", id);
        //int rows = query.executeUpdate();
    }

    public void saveUser(User user){
        entityManager.persist(user);
       
    }
}