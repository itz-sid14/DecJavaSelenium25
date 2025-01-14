package CustomDataTypes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookData {
	
	public static void main(String[] args) {
		
		LocalDate dt = LocalDate.of(1950, 01, 26);
		
		BookExample be = new BookExample("Constitution","B.R. Ambedkar",dt, 350.00f);
		
		System.out.println(be);
		
		BookExample be2 = new BookExample("Kadambari","IDONTKNOW",LocalDate.of(2005, 8, 11), 200.00f);
		BookExample be3 = new BookExample("Champawat","IDK",LocalDate.of(2014, 9, 12), 1500.00f);
		BookExample be4 = new BookExample("Comic","Ravi Gupta",LocalDate.of(1999, 3, 15), 150.00f);

		List<BookExample> list = new ArrayList<>();
		
		list.add(be2);
		list.add(be3);
		list.add(be4);
		
		for (BookExample b: list)	
		{
			System.out.println(b);
		}
		
		float result = 0;
		
		for (BookExample b: list)	
		{
			result =result + b.getPrice();		
		}
		System.out.println(result);
		
		float HigestPrice =0;
		int indexofHPB = 0;
		int startIndex = 0;
		
		//String strof = "This is the Higest value";
		
		for(BookExample b: list)
		{
			if(b.getPrice()>=HigestPrice)
			{
				HigestPrice = b.getPrice();
				indexofHPB =startIndex;
			}
			startIndex++;
		}
		System.out.println(list.get(indexofHPB).getName()+ " "+ list.get(indexofHPB).getPrice());
		
	}

}
