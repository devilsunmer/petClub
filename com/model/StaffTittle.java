package com.model;

public enum StaffTittle {
	SHYBABY("害羞小孩"),
	HAPPYBABY("活潑小孩"),
	MADBABY("易怒小孩");
	
	private final String coleName;
	
	StaffTittle(String coleName) {
        this.coleName = coleName;
    }
}
