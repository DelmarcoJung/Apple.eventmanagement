package com.emc.Test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImplementation;

public class Implementation {

	public static void main(String[] args) {
		Organizer org = new Organizer();
		org.setId(110022);
		org.setName("Apple Inc");
		System.out.println(org.getId());
		System.out.println(org.getName());
		
		Event e = new Event(449944, "Apple Iphone 11s Launch", "Yearly lauch");
		System.out.println(e.getDescription()+" "+e.getId()+" "+e.getName());
		
		EventManager m = new EventManagerImplementation();
		System.out.println(m.create().getName());
		
		
		
		

	}

}
