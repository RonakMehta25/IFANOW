package IFANOW.EventApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import IFANOW.EventApp.entity.Events;
import IFANOW.EventApp.repository.EventsRespositoryImpl;

@Service
public class TriggerService {
	
	EventsRespositoryImpl eventsRespositoryImpl;
	
	@Autowired
	public TriggerService(EventsRespositoryImpl theEventsRespositoryImpl)
	{
		eventsRespositoryImpl=theEventsRespositoryImpl;
	}
	
	@Async
	public void checkForTriggerCondition(Events events)
	{
		if(events.getNoun().equals("bill") && events.getVerb().equals("pay")  && eventsRespositoryImpl.checkforFirstTimeUserPay(events))
		{
			//call for Trigger push notification on user first bill pay
			System.out.println("First Time User");
		}else if(events.getNoun().equals("bill") && events.getVerb().equals("pay") && eventsRespositoryImpl.checkforNumberOfTransaction(events))
		{
			//Alert user that 5 or more transactions are made on his account
		}
	}
	
}
