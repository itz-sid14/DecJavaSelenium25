package CollectionInJava;

import java.util.ArrayDeque;

public class DqueueInJava {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> AD = new ArrayDeque<>();
		
		AD.add(11);
		AD.add(12);
		AD.add(13);
		AD.add(14);
		AD.add(15);
		AD.add(16);
		AD.add(17);
		
		System.out.println(AD);
		
		AD.addFirst(10);
		AD.addLast(18);
		
		
		System.out.println(AD);
		
		AD.removeFirst();
		AD.removeLast();
		
		
		
		System.out.println(AD);
	}

}
