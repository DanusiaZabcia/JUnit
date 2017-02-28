package selenium_mvn_eclips;

import java.util.ArrayList;
import java.util.Collections;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;
import static org.junit.Assert.*;
public class ListSortTest {

	@Test

	public void isSortingBWorksAsSortMethod() {

		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list.add(234);
		list.add(4343);
		list.add(43);
		list.add(0);
		list.add(455311);
		list.add(-3);
		list.add(8);
		
		list2.add(234);
		list2.add(4343);
		list2.add(43);
		list2.add(0);
		list2.add(455311);
		list2.add(-3);
		list2.add(8);
		
		
		
		ListSort newlist = new ListSort(list);

		Collections.sort(list2);
		System.out.println(list2);
		System.out.println(newlist.bubbleSort());
		assertThat(newlist.bubbleSort(),
				IsIterableContainingInOrder.contains(list2.toArray()));
		

	}

	/*@Test
	public void isSortingBWorksWith0() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = 0;
			list.add(a);
			list2.add(a);
		}
		ListSort newlist = new ListSort(list);
		Collections.sort(list2);
		assertEquals(list2, newlist.bubbleSort());
	}*/

	/*@Test
	public void isSortingBWorksWithSize200() {
		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 200; i++) {
			Integer a = mix.nextInt(20);
			list.add(a);
			list2.add(a);
			
		}
		ListSort newlist = new ListSort(list);
		assertEquals(list2, newlist.bubbleSort());
		//assertTrue( list.retainAll( newlist.bubbleSort()));
		
		
	}

	@Test(expected = java.lang.Error.class)
	public void doSortingBWillFall() {
		ArrayList<String> list = new ArrayList<String>();

		ListSort newlist = new ListSort(list);

	}*/

	/*@Test

	public void isSortingChWorksAsSortMethod() {

		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = mix.nextInt(200);
			list.add(a);
			list2.add(a);
		}
		ListSort newlist = new ListSort(list);

		Collections.sort(list2);

		//assertEquals(list2, newlist.sortByChoice());
		//assertTrue( list.retainAll( newlist.sortByChoice()));
		assertThat(newlist.sortByChoiceDecent(),
				IsIterableContainingInOrder.contains(list2.toArray()));

	}*/
	
	/*@Test

	public void isSortingChDecentWorksAsSortMethod() {

		Random mix = new Random();
		final ArrayList<Integer> list = new ArrayList<Integer>();
		 ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = mix.nextInt(200);
			list.add(a);
			
			list2.add(a);
		}
		ListSort newlist = new ListSort(list);
		

		//assertFalse(list.containsAll(newlist.sortByChoiceDecent())&&newlist.sortByChoiceDecent().containsAll(list));
		//assertTrue( list.retainAll( newlist.sortByChoiceDecent()));
		//System.out.println(list);
		System.out.println(newlist.sortByChoiceDecent());
		System.out.println(list2);
		assertThat(newlist.sortByChoiceDecent(),
				IsIterableContainingInOrder.contains(list2.toArray()));
	}*/
}
