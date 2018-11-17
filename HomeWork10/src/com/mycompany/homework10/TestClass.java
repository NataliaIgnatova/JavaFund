package com.mycompany.homework10;

import java.util.Date;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visit visit = new Visit("Ivan",new Date());
		Visit visit2 = new Visit("Dragan", new Date());
		visit.setProductExpense(200);
		visit.setServiceExpense(100);
		visit2.setProductExpense(2000);
		visit2.setServiceExpense(1000);
		Visit[] visits = new Visit[]{visit, visit2};
		double sum=0;
		for(Visit v:visits){
			sum +=v.getProductExpense()+v.getServiceExpense();
		}
		System.out.println(sum);
		
	}

}
