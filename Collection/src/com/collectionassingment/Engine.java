package com.collectionassingment;

public class Engine {
	private int engineNo;
	private String enginetype;
	
	
	public Engine(int engineNo, String enginetype) {
		super();
		this.engineNo = engineNo;
		this.enginetype = enginetype;
		
	}
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", enginetype=" + enginetype + "]";
	}
}

	


