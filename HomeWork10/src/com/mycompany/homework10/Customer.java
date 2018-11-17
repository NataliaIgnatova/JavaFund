package com.mycompany.homework10;

public class Customer {
	private String name;
	private boolean member = false;
	private String memberType;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}

	public boolean isMember() {
		return this.member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return this.memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	@Override 
	public String toString(){
		return "Name of customer is: "+this.name + " customer is member: "+this.member +" customer membertype is: "+this.memberType;
	}
}
