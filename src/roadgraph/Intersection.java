package roadgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import geography.GeographicPoint;

/**
 * @author Dalveer
 *
 */
public class Intersection {
	
	private GeographicPoint cordinate;
	private HashMap<Intersection,Road> neighbours;
	
	public Intersection(GeographicPoint location) {
		this.cordinate = location;
		this.neighbours = new HashMap<Intersection,Road>();
	}
	public GeographicPoint getCordinate() {
		return cordinate;
	}
		
	public HashMap<Intersection,Road> getNeighbours() {
		return neighbours;
	}
	
	public boolean addRoad(Intersection endIntersection,Road connectingRoad) {
		neighbours.put(endIntersection,connectingRoad);
		System.out.print(neighbours.keySet());
		return true;
	}
	
	
	public List<Road> getOutgoingRoads(){
		List<Road> allOutgoingRoads = new ArrayList<Road>();
		for(Intersection item:this.neighbours.keySet()) {
			allOutgoingRoads.add(this.neighbours.get(item));
		}
		return allOutgoingRoads;
	}
}
