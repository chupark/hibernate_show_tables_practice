package service_Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.TB_Board;
import domain.UserInfo;
import service.TB_BoardProvider;
import service.UserInfoProvider;
import util.HibernateUtil;

public class TB_BoardHibernateProviderImpl implements TB_BoardProvider{

	@Override
	public void insertData(TB_Board tB_Board) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(tB_Board);
		
		tx.commit();
		session.close();
		
	}

	@Override
	public List<TB_Board> findAllData() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		List <TB_Board> tB_Board = session.createQuery
				("FROM TB_Board u WHERE rownum <= 20 order by u.name asc").list();
		
		tx.commit();
		session.close();
		
		return tB_Board;
	}

	@Override
	public TB_Board findData(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TB_Board updateData(String num, String updateName) {
		// TODO Auto-generated method stub
		return null;
	}


}
