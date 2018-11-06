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
	private double distance;
	
	public Intersection(GeographicPoint location) {
		this.cordinate = location;
		this.neighbours = new HashMap<Intersection,Road>();
		this.distance = Double.POSITIVE_INFINITY;
	}
	public GeographicPoint getCordinate() {
		return cordinate;
	}
		
	public HashMap<Intersection,Road> getNeighbours() {
		return neighbours;
	}
	
	public double distanceToAIntersectionForDijkstra(Intersection destination) {
		return this.getCordinate().distance(destination.getCordinate());
	}
	
	public double distanceToAIntersectionForAStar(Intersection destination,GeographicPoint goal) {
		return this.getCordinate().distance(destination.getCordinate()) + goal.distance(destination.getCordinate());
	}
	
	public boolean addRoad(Intersection endIntersection,Road connectingRoad) {
		neighbours.put(endIntersection,connectingRoad);
		return true;
	}
	
	
	public List<Road> getOutgoingRoads(){
		List<Road> allOutgoingRoads = new ArrayList<Road>();
		for(Intersection item:this.neighbours.keySet()) {
			allOutgoingRoads.add(this.neighbours.get(item));
		}
		return allOutgoingRoads;
	}
	public double getDistance() {
		return this.distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
}
