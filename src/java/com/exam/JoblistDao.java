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
public class JoblistDao {
   public void doSav(Joblist j){
   Session ss = NewHibernateUtil.getSessionFactory().openSession();
   ss.getTransaction().begin();
   ss.save(j);
   ss.getTransaction().commit();
   
   ss.close();
   
   
   
   }
   public void doUp(Joblist j){
   Session ss = NewHibernateUtil.getSessionFactory().openSession();
   ss.getTransaction().begin();
   ss.update(j);
   ss.getTransaction().commit();
   
   ss.close();
   
   
   
   }
     public void doDel(Joblist j){
   Session ss = NewHibernateUtil.getSessionFactory().openSession();
   ss.getTransaction().begin();
   ss.delete(j);
   ss.getTransaction().commit();
   
   ss.close();
   
   
   
   }
     public List doSh(){
         List<Joblist>list = new ArrayList<>();
     Session ss = NewHibernateUtil.getSessionFactory().getCurrentSession();
     Joblist mm = new Joblist();
     Query q= ss.createQuery("from Joblist");
     list=q.list();
     return list;
     }
    
    }
 
    

