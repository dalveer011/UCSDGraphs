package roadgraph;

public class Road {
	private String roadType;
	private String roadName;
	private double roadLength;
	
	public Road(String roadtype,String roadname,double roadlength) {
		this.roadLength = roadlength;
		this.roadName = roadname;
		this.roadType = roadtype;
	}
}
