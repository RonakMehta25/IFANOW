package IFANOW.EventApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import IFANOW.EventApp.entity.EventInput;
import IFANOW.EventApp.entity.Events;
import IFANOW.EventApp.service.EventServiceImpl;

@RestController
public class EventRestController {

	EventServiceImpl eventServiceImpl;
	
	@Autowired
	public EventRestController(EventServiceImpl theEventServiceImpl)
	{
		eventServiceImpl=theEventServiceImpl;
	}
	
	@PostMapping("/rest/events")
	public EventInput createEvent(@RequestBody EventInput event)
	{
		eventServiceImpl.createEvent(event);
		return event;
	}
}
