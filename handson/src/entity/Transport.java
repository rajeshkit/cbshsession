package entity;

public class Transport {
	private int transportId;
	private String transportName;
	private float cost;
	public Transport() {
		// TODO Auto-generated constructor stub
	}
	public Transport(int transportId, String transportName, float cost) {
		super();
		this.transportId = transportId;
		this.transportName = transportName;
		this.cost = cost;
	}
	public int getTransportId() {
		return transportId;
	}
	public void setTransportId(int transportId) {
		this.transportId = transportId;
	}
	public String getTransportName() {
		return transportName;
	}
	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "transportId=" + transportId + ", transportName=" + transportName + ", cost=" + cost+",";
	}
	

}
