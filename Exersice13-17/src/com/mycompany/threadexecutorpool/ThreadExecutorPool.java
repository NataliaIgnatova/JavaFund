package com.mycompany.threadexecutorpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> urls = new ArrayList<>();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for(String url:urls){
			executor.submit(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
				
			});
		}
	}

}
