package com.mycompany.exersice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] arr=new Circle[4];
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(6);
		ResizableCircle c3 = new ResizableCircle(7);
		ResizableCircle c4 = new ResizableCircle(4);
		c3.resizeArea(3);
		c4.resizePerimeter(6);
		System.out.println(c3.resizeArea(3));
		arr[0]=c1;
		arr[1]=c2;
		arr[2]=c3;
		arr[3]=c4;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].toString());
		}
		/*ResizableCircle c5 = (ResizableCircle) c1;
		System.out.println(c5.toString());
		*/
		
	}

}
