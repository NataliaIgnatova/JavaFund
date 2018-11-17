package com.mycompany.homework10;

public class DiscountRate {
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(String type){
		if(type.equals("premium")){
			return serviceDiscountPremium;
		}else{
			if(type.equals("gold")){
				return serviceDiscountGold;
			}else{
				if(type.equals("silver")){
					return serviceDiscountSilver;
				}
			}
		}
		return -1;
	}
	
	public static double getProductDiscountRate(String type){
		if(type.equals("premium")){
			return productDiscountPremium;
		}else{
			if(type.equals("gold")){
				return productDiscountGold;
			}else{
				if(type.equals("silver")){
					return productDiscountSilver;
				}
			}
		}
		return -1;
	}
}
