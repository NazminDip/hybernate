/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Dipty
 */
public class NewregisterDao {
    public void dosave(Newregister s){
          
          
          


    
        Session session= NewHibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(s);
        session.getTransaction().commit();
        session.close();
    } 
            
    
                 
 public void update(Newregister s){
    
     
    
        Session session= NewHibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.update(s);
        session.getTransaction().commit();
        session.close();
    } 
 
                 
 public void delete(Newregister s){
    
     
    
        Session session= NewHibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.update(s);
        session.getTransaction().commit();
        session.close();
    } 
 
 
    
       public List show(){
    
    List<Newregister>list= new ArrayList<>();
     Session ss= NewHibernateUtil.getSessionFactory().openSession();
     Query q= ss.createQuery("From Newregister ");
     list=q.list();
    return list;
    
    }
    
    
    
}
