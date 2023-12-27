package com.treemap;

public class Order {
	private int orderid;
	private String pname;
	private double pirce;
	public Order(int orderid, String pname, double pirce) {
		super();
		this.orderid = orderid;
		this.pname = pname;
		this.pirce = pirce;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPirce() {
		return pirce;
	}
	public void setPirce(double pirce) {
		this.pirce = pirce;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", pname=" + pname + ", pirce=" + pirce + "]";
	}
	
	

}
