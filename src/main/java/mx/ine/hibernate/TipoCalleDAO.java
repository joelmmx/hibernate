package mx.ine.hibernate;

import java.util.List;

import org.hibernate.Session;
//import org.hibernate.Transaction;

public class TipoCalleDAO {
	public List<TipoCalle> getCalles(){
		//Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			session.beginTransaction();
			//Get calles
			List<TipoCalle> result = session.createQuery("select a from TipoCalle a",TipoCalle.class).getResultList();
			session.close();
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
