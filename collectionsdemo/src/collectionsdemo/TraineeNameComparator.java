package collectionsdemo;

import java.util.Comparator;

public class TraineeNameComparator implements Comparator<Trainee> {

	@Override
	public int compare(Trainee o1, Trainee o2) {
		
		return o1.getTraineeName().compareTo(o2.getTraineeName());
	}

}
