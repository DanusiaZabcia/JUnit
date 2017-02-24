package selenium_mvn_eclips;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class ListSortTest {

	@Before
	
	public void lista(){
		
		Random mix = new Random();
		
	for (int i = 0; i < 30; i++) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		Integer a = mix.nextInt(898);
		list.add(a);
	}
	}
	
	@Test
	public void isSortIsGood() {
		
		fail("Not yet implemented");
	}

}
