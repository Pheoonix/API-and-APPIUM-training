package com.project.javacollections;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		//queue - fifo : front 10 9 8 7 6 5 4 3 2 1 rear
		//PriorityQueue sorts the data
		//queue : front 1 2 3 4 5 6 7 8 9 10 rare //sorted queue the actual one
		//Peeking - Obtaining the head of queue
		//Polling - Remove the head of queue
		
		System.out.println("Queue Size is: "+queue.size());
		System.out.println("Head of the queue is: "+queue.peek()); //Head of queue : 1
		
		queue.poll(); //Removing the head
		System.out.println("Queue Size after poll is: "+queue.size());
		
		System.out.println("Head of the queue is: "+queue.peek()); //New head of queue : 2
		
	}

}
