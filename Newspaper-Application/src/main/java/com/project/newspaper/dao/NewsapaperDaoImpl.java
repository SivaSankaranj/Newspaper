package com.project.newspaper.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.newspaper.entity.Newspaper;

@Component
public class NewsapaperDaoImpl implements NewspaperDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public NewsapaperDaoImpl() {
		System.out.println("object is created:"+this.getClass().getName());
	}

	@Override
	public boolean saveNewspaperEntity(Newspaper newspaper) {
		System.out.println("Invoked save Newspaper Entity method()");
		Session session=null;
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(newspaper);
			session.getTransaction().commit();
			System.out.println("Newspaper details has been saved successfully");
			return true;
		} catch (HibernateException e) {
		System.out.println(e.getMessage());	
			
		}finally {
			if(session!=null) {
				System.out.println("session is cloed");
			}
			else {
				System.out.println("session is not closed");
			}
		}
		return false;
	}

}
