package collectionsdemo;

public class Trainee  {
	private int traineeId;
	private String traineeName;
	private int rating;
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int traineeId, String traineeName, int rating) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.rating = rating;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "traineeId=" + traineeId + ", traineeName=" + traineeName + ", rating=" + rating +"\n";
	}
	
	
	
	
}
