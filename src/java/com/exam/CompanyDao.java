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
public class CompanyDao {
    public void doSav(Company cc){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        session.save(cc);
        session.getTransaction().commit();
        session.close();
    
    
    
    }
    
    public void doUp(Company cc){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        session.update(cc);
        session.getTransaction().commit();
        session.close();
    
    
    }
    public void doDel(Company cc){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        session.delete(cc);
        session.getTransaction().commit();
        session.close();
    
    
    }
    public List dosh(){
    
    List<Company>list=new ArrayList<>();
    CompanyDao dm =new CompanyDao();
    Session se = NewHibernateUtil.getSessionFactory().openSession();
    Query q= se.createQuery("from Company");
    list=q.list();
    return list;
    }
    }

