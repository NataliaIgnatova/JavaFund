package com.mycompany.homework10;

import java.util.Date;

public class Visit {
	
	//private Customer customer;
	
	private String customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name,Date date){
		this.date=date;
		this.customer=name;
		//this.customer.setName(name);
	}
	
	public String getName(){
		//return this.customer.getName();
		return this.customer;
	}
	
	public double getServiceExpense(){
		return this.serviceExpense;
	}
	
	public void setServiceExpense(double serviceExp){
		this.serviceExpense=serviceExp;
	}
	
	public double getProductExpense(){
		return this.productExpense;
	}
	
	public void setProductExpense(double productExp){
		this.productExpense=productExp;
	}
	
	public double getTotalExpense(){
		return this.productExpense+this.serviceExpense;
	}
	
	public String toString(){
		/*return "Visit of customer: "+ customer.getName()+" customer memberType is: "+customer.getMemberType()+" date of visit: "+this.date+
				" serviceecpense: "+this.serviceExpense+" productexpense: "+this.productExpense;*/
		return "Visit of customer: "+ customer+" date of visit: "+this.date+
				" serviceecpense: "+this.serviceExpense+" productexpense: "+this.productExpense;
	}
}

