package IFANOW.EventApp.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import IFANOW.EventApp.entity.Events;

@Repository
public class EventsRespositoryImpl implements EventsRepository {

	private EntityManager entityManager;
	
	@Autowired
	public EventsRespositoryImpl(EntityManager theEntityManager)
	{
		entityManager=theEntityManager;
	}
	
	@Transactional
	@Override
	public Events createEvents(Events event) {
		
		//get the current Hibernate Session 
		Session session=entityManager.unwrap(Session.class);
		
		//create a query
		session.save(event);
		
		
		return null;
	}

	public boolean checkforFirstTimeUserPay(Events events) {
		
		Events e;
		
		try {
			e = (Events) entityManager.createQuery("from Events e where e.userid = :user_id")
					.setParameter("user_id", events.getUserid())
					.getSingleResult();
		} catch (NoResultException ex) {
			e = null;
		}
		
		return e==null;
	}

	public boolean checkforNumberOfTransaction(Events events) {
		
		Query query = entityManager.createNativeQuery("SELECT COUNT(*) FROM Events e WHERE e.userid = :user_id and e.value>amount");
		query.setParameter("user_id", events.getUserid());
		query.setParameter("amount", 10000);
		int count = ((Number) query.getSingleResult()).intValue();
		
		return count>=4;
	}

}
