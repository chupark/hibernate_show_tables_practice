package service_Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.UserInfo;
import service.UserInfoProvider;
import util.HibernateUtil;

public class UserInfoHibernateProviderImpl implements UserInfoProvider{

	@Override
	public void insertUser(UserInfo userInfo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(userInfo);
		
		tx.commit();
		session.close();
	}

	@Override
	public List<UserInfo> findAllUsers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		List <UserInfo> userInfo = session.createQuery("from UserInfo u order by u.name asc").list();
		
		tx.commit();
		session.close();
		
		return userInfo;
	}

	@Override
	public UserInfo findUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo updateUser(String userId, String updateName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
