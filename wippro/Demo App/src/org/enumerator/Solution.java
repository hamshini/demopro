package org.enumerator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
UserInfo info=new UserInfo();
info.setName("hari");
        
        session.getTransaction().commit();
        session.close();
        sf.close();
	}

}
