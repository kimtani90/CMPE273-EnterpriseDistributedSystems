/*Write a program to show order processing at a restaurant using a queue.*/
	

package javapractice;

import java.util.Queue;

public class RestaurantQueue {


	private int orderId;
	private String orderName;
	private boolean processed;
	
	public RestaurantQueue(){
		
	}
	public RestaurantQueue(int orderId, String orderName){
		
		this.orderId=orderId;
		this.orderName=orderName;
		this.processed=false;
		
	}
	
	public RestaurantQueue processOrder(Queue<RestaurantQueue> queue) {
		
		RestaurantQueue order = queue.poll();
		order.processed=true;
		
		return order;
		
		
	}
		
	
	
	
}
