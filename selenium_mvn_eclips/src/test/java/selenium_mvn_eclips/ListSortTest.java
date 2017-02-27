package selenium_mvn_eclips;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Test;

public class ListSortTest {

	@Test

	public void isSortingWorksAsSortMethod() {

		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = mix.nextInt(20);
			list.add(a);
		}
		ListSort newlist = new ListSort(list);

		Collections.sort(list);

		assertEquals(list, newlist.bubbleSort());

	}

	@Test
	public void isSortingWorksWith0() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = 0;
			list.add(a);
		}
		ListSort newlist = new ListSort(list);
		newlist.bubbleSort();
	}

	@Test
	public void isSortingWorksWithSize200() {
		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 200; i++) {
			Integer a = mix.nextInt(20);
			list.add(a);
		}
		ListSort newlist = new ListSort(list);
		assertEquals(list, newlist.bubbleSort());
	}

	@Test(expected = java.lang.Error.class)
	public void doSortingWillFall() {
		ArrayList<String> list = new ArrayList<String>();

		ListSort newlist = new ListSort(list);

	}

}
