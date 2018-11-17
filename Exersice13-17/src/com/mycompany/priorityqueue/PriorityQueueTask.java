package com.mycompany.priorityqueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator comparator = new PersonComparator();
		Queue<Person> queue = new PriorityQueue<>(comparator);
		Person firstPerson = new Person("ivan",19);
		Person secondPerson = new Person("mariq",29);
		Person thirdPerson = new Person("dragan",23);
		queue.add(firstPerson);
		queue.add(secondPerson);
		queue.add(thirdPerson);
		while(queue.peek()!=null){
			System.out.println(queue.poll());
		}

	}

}
