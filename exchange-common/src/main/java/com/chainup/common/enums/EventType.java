package com.chainup.common.enums;

public enum EventType {
	sub("sub"),
	unsub("unsub"),
	req("req"),
	
	
    ;
	
    private final String name;
    private EventType(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public static EventType getInsByname(String name) {
        for (EventType lma: EventType.values()) {
            if (lma.getName().equals(name)) {
                return lma;
            }
        }
        return null;
    }

    public static EventType getIns(String name) {
        try {
            return EventType.valueOf(name);
        } catch (Exception ex) {
            return null;
        }
    }
}
