package CollectionInJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesInJava {

	public static void main(String[] args) {

		Queue<Integer> que= new PriorityQueue<>();

		que.add(0);
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		que.add(5);

		System.out.println(que);

		System.out.println(que.peek()); // It displays the first number from queue 

		System.out.println(que);

		System.out.println(que.poll()); // It displays and take out the first number every time 

		System.out.println(que);
		
		


	}

}
