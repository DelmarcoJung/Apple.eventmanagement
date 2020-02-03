package com.emc.managers;

import com.emc.entities.Event;

public class EventManagerImplementation implements EventManager {

	@Override
	public Event create() {
		return new Event(446677, "Macbook Pro Launch", "VIPs Party");
		
	}

}
