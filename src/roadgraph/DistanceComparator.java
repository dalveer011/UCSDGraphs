package roadgraph;

import java.util.Comparator;

public class DistanceComparator implements Comparator<Intersection> {

	@Override
	public int compare(Intersection arg0, Intersection arg1) {
		return (int) (arg0.getDistance() - arg1.getDistance());
	}

}
