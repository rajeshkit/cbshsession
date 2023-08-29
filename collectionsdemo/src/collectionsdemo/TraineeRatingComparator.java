package collectionsdemo;

import java.util.Comparator;

public class TraineeRatingComparator implements Comparator<Trainee> {

	@Override
	public int compare(Trainee o1, Trainee o2) {
		if(o1.getRating()>o2.getRating()) {
			return 1;
		}
		if(o1.getRating()<o2.getRating()) {
			return -1;
		}
		return 0;
	}

}
