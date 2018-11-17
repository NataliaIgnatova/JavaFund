package com.mycompnay.taskOne;

public class CommonBox<E extends Number>{

	private E var;
	
	public CommonBox(){
		
	}
	
	public CommonBox(E var){
		this.var = var;
	}
	
	public void setVar(E var){
		this.var = var;
	}
	
	public E getVar(){
		return this.var;
	}
	
	
	public String toString(){
		return "\"" +var.getClass()+"\"";
	}
}
