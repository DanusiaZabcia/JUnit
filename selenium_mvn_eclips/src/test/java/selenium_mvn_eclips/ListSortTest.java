package selenium_mvn_eclips;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;

public class ListSortTest {

	@Test

	public void isSortingBWorksAsSortMethod() {

		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = mix.nextInt(20);
			list.add(a);
		}
		ListSort newlist = new ListSort(list);

		Collections.sort(list);

		assertEquals(list, newlist.bubbleSort());
		//ssertTrue( list.retainAll( newlist.bubbleSort()));

	}

	@Test
	public void isSortingBWorksWith0() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = 0;
			list.add(a);
		}
		ListSort newlist = new ListSort(list);
		newlist.bubbleSort();
	}

	@Test
	public void isSortingBWorksWithSize200() {
		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 200; i++) {
			Integer a = mix.nextInt(20);
			list.add(a);
		}
		ListSort newlist = new ListSort(list);
		assertEquals(list, newlist.bubbleSort());
		//assertTrue( list.retainAll( newlist.bubbleSort()));
		
		
	}

	@Test(expected = java.lang.Error.class)
	public void doSortingBWillFall() {
		ArrayList<String> list = new ArrayList<String>();

		ListSort newlist = new ListSort(list);

	}

	@Test

	public void isSortingChWorksAsSortMethod() {

		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = mix.nextInt(200);
			list.add(a);
		}
		ListSort newlist = new ListSort(list);

		Collections.sort(list);

		assertEquals(list, newlist.sortByChoice());
		//assertTrue( list.retainAll( newlist.sortByChoice()));

	}
	
	@Test

	public void isSortingChDecentWorksAsSortMethod() {

		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = mix.nextInt(200);
			list.add(a);
		}
		ListSort newlist = new ListSort(list);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2= list;

		//assertFalse(list.containsAll(newlist.sortByChoiceDecent())&&newlist.sortByChoiceDecent().containsAll(list));
		//assertTrue( list.retainAll( newlist.sortByChoiceDecent()));
		assertThat(newlist.sortByChoiceDecent(),
				IsIterableContainingInOrder.contains(list2.toArray()));
	}
}
