package selenium_mvn_eclips;

import java.util.ArrayList;


public class ListSort {

	ArrayList<Integer> list;
	

	public ListSort(ArrayList<Integer> list){
		
		this.list= list;
	}
	
public  ArrayList<Integer> bubbleSort (){
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
	
	return list;
	
}


}

