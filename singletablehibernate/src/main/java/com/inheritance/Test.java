package com.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Cosmetics c = new Cosmetics("India", 1000.20);
		Lipstick l = new Lipstick("USA", 24.25, "Maybelline");
		NailPaint n = new NailPaint("Thailand", 13.33, "Lakme");
		Kajal k = new Kajal("India", 122.24, "MAC");

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(c);
		session.save(l);
		session.save(n);
		session.save(k);

		tx.commit();
		session.close();

	}

}
