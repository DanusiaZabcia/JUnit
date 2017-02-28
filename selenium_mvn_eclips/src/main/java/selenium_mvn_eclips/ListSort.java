package selenium_mvn_eclips;

import java.util.ArrayList;

public class ListSort {

	private ArrayList<Integer> list;

	public ListSort(ArrayList<Integer> list) {

		this.list = list;
	}

	public ArrayList<Integer> bubbleSort() {
		if (list.size() > 0) {
			for (int x = 0; x < list.size()-1; x++) {
				for (int i = 0; i < list.size()-1; i++) {

					if (list.get(i).compareTo(list.get(i + 1)) > 0) {
						Integer temp;
						temp = list.get(i);
						list.set(i, list.get(i + 1));
						list.set(i + 1, temp);
					}
				}
			}
		}
		
		return list;

	}

	public ArrayList<Integer> sortByChoice() {

		if (list.size() > 0) {
			Integer temp, min;

			for (int i = 0; i <= list.size() - 1; i++) {
				min = i;
				for (int j = i + 1; j <= list.size() - 1; j++) {
					if (list.get(min).compareTo(list.get(j)) > 0) {
					//if (list.get(min) > list.get(j)) {
						temp = list.get(min);
						list.set(min, list.get(j));
						list.set(j, temp);
					}
				}
			}
		}
		
		return list;
	}
	public ArrayList<Integer> sortByChoiceDecent() {

		if (list.size() > 0) {
			Integer temp, min;

			for (int i = 0; i < list.size() - 1; i++) {
				min = i;
				for (int j = i + 1; j <= list.size() - 1; j++) {
					if (list.get(min) < list.get(j)) {
						temp = list.get(min);
						list.set(min, list.get(j));
						list.set(j, temp);
					}
				}
			}
		}
		
		return list;
	}
}
