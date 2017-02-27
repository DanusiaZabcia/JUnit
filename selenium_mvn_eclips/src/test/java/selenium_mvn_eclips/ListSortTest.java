package selenium_mvn_eclips;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Test;

public class ListSortTest {

	@Test
	
	public void isSortingdWorks(){
		
		Random mix = new Random();
		
	for (int i = 0; i < 30; i++) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		Integer a = mix.nextInt(20);
		list.add(a);
		ListSort newlist= new ListSort(list);
	
		
		
		
		
		 Collections.sort(list);
		
		assertEquals( list, newlist.bubbleSort());
		
	}
	}

}
