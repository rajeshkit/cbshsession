package collectionsdemo;

import java.util.Comparator;

public class TraineeIdComparator implements Comparator<Trainee>{

	@Override
	public int compare(Trainee o1, Trainee o2) {
		if(o1.getTraineeId()>o2.getTraineeId()) {
			return 1;
		}
		if(o1.getTraineeId()<o2.getTraineeId()) {
			return -1;
		}
		return 0;
	}
	
	
}
