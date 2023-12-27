package com.treemap;

public class Customer implements Comparable<Customer>{
	private int cid;
	private String cname;
	private long mno;
	public Customer(int cid, String cname, long mno) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mno = mno;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mno=" + mno + "]";
	}
	@Override
	public int compareTo(Customer c) {
		
		return 0;
	}
	
	

}
