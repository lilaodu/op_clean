package com.chainup.common.enums;

public enum EventRepType {
	rep("rep"),
	subed("subed"),
	unsubed("unsubed"),
	
    ;
	
    private final String name;
    private EventRepType(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public static EventRepType getInsByname(String name) {
        for (EventRepType lma: EventRepType.values()) {
            if (lma.getName().equals(name)) {
                return lma;
            }
        }
        return null;
    }

    public static EventRepType getIns(String name) {
        try {
            return EventRepType.valueOf(name);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public static void main(String[] args) {
		System.out.println(rep.name);
	}

}
