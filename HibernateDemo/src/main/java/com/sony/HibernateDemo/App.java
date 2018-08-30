package com.sony.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	StudentName stn=new StudentName();
    	stn.setFname("Arup");
    	stn.setMname("Kumar");
    	stn.setLname("Raha");
    	
        Students s1= new Students();
        s1.setSid(34);
        s1.setSname(stn);
        s1.setMarks(45.7);
        
               
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Students.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        SessionFactory sf=cfg.buildSessionFactory(reg);
        
        Session sn=sf.openSession();
        Transaction tx=sn.beginTransaction();
        sn.save(s1);
        tx.commit();
       
    }
}
