package selenium_mvn_eclips;
import java.util.ArrayList;
import java.util.Random;

public class ListSort {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		Random mix = new Random();

		for (int i = 0; i < 30; i++) {
			Integer a = mix.nextInt(898);
			list.add(a);

		}

		if (list.size() > 0) {
			for (int x = 0; x < list.size() - 1; x++) {
				for (int i = 0; i < list.size() - 1; i++) {

					if (list.get(i).compareTo(list.get(i + 1)) > 0) {
						Integer temp;
						temp = list.get(i);
						list.set(i, list.get(i + 1));
						list.set(i + 1, temp);
					}
				}
			}
		}

		System.out.println( "Posortowane" + list);

	}

}
