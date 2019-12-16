package IFANOW.EventApp.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import IFANOW.EventApp.entity.EventInput;
import IFANOW.EventApp.entity.Events;
import IFANOW.EventApp.repository.EventsRespositoryImpl;

@Service
public class EventServiceImpl implements EventService {

	private EventsRespositoryImpl eventsRespositoryImpl;
	
	private TriggerService triggerService;
	
	@Autowired
	public EventServiceImpl(EventsRespositoryImpl theEventsRespositoryImpl,TriggerService theTriggerService)
	{
		eventsRespositoryImpl=theEventsRespositoryImpl;
		triggerService=theTriggerService;
	}
	
	
	@Override
	@Transactional
	public EventInput createEvent(EventInput eventInput) {
		
		Events events=new Events();
		
		events.setTransactionid(eventInput.getTransactionid());
		
		events.setUserid(eventInput.getUserid());
		
		events.setTimestamp(eventInput.getTimestamp());
		
		events.setLocation(eventInput.getLocation());
		
		events.setNoun(eventInput.getNoun());
		
		events.setVerb(eventInput.getVerb());
		
		events.setTimespent(eventInput.getProperties());
		
		
		
		if(eventInput.getText()!=null)
		{
			events.setText(eventInput.getText());
		}
		else
		{
			
			     JsonObject propertiesObject = new JsonParser().parse(eventInput.getProperties()).getAsJsonObject();
			    		 
			     events.setBank(propertiesObject.get("bank").getAsString());
			     events.setMerchantId(propertiesObject.get("merchantid").getAsString());
			     events.setValue(propertiesObject.get("value").getAsLong());
			     events.setMode(propertiesObject.get("mode").getAsString());
			     events.setDescription(propertiesObject.get("description").getAsString());
			     
			     triggerService.checkForTriggerCondition(events);
			
		}
		
		eventsRespositoryImpl.createEvents(events);
		
		return eventInput;
	}

}
