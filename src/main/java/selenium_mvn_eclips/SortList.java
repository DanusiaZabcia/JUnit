package selenium_mvn_eclips;

import java.util.List;

public interface SortList<T extends Comparable<T>> {

	public List<T> sortAsc();

	public List<T> sortDesc();

}
