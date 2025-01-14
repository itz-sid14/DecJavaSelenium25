package CollectionInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDifferenceExample {

	public static void main(String[] args) {

		List<Float> alist = new ArrayList<>();

		List<Float> llist = new LinkedList<>();

		long starttime = System.currentTimeMillis();

		for(int i=0; i<=100000;i++)
		{
			alist.add(12.56f);
			alist.add(25.85f);
			alist.add(72.59f);
			alist.add(93.76f);
			alist.add(23.13f);
			alist.add(14.96f);

			alist.remove(1);

		}

		long endtime = System.currentTimeMillis();
		System.out.println(alist.size());

		System.out.println("Total time = " + (endtime - starttime));


		System.out.println("======== Below Is the Linked list example ========");

		long LLstarttime = System.currentTimeMillis();

		for(int i=0; i<=100000;i++)
		{
			llist.add(12.56f);
			llist.add(25.85f);
			llist.add(72.59f);
			llist.add(93.76f);
			llist.add(23.13f);
			llist.add(14.96f);

			llist.remove(1);

		}

		long LLendtime = System.currentTimeMillis();
		
		System.out.println(llist.size());

		System.out.println("Total time = " + (LLendtime - LLstarttime));

	}

}
