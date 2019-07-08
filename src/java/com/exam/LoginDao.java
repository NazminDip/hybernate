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
public class LoginDao {
     public void dosave(Login s){
          
          
          


    
        Session session= NewHibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(s);
        session.getTransaction().commit();
      
        
      }
               
                
 public void update(Login s){
    
     
    
        Session session= NewHibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.update(s);
        session.getTransaction().commit();
        session.close();
    } 
     
            
 public void delete(Login s){
    
     
    
        Session session= NewHibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(s);
        session.getTransaction().commit();
        session.close();
    } 
 
 
    public List show(){
    
    List<Login>list= new ArrayList<>();
     Session ss= NewHibernateUtil.getSessionFactory().openSession();
     Query q= ss.createQuery("From Login");
     list=q.list();
    return list;
    
    }
 public Login aStudent(String email, String password) {
        Login u = null;
        List<Login> list;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Login where email=:a and password=:b");
        q.setString("a", email);
        q.setString("b", password);
        list = q.list();
        try {
            if (list != null) {
               u = list.get(0);
            } else {
                u = null;
            }
        } catch (Exception e) {
            return u;
        }
        return u;
    }
    
}
