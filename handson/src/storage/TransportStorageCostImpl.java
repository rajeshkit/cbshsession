package storage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.Transport;

public class TransportStorageCostImpl implements TransportStorage,Comparator<Transport>{

	@Override
	public List<Transport> sortTransport(List<Transport> transportList) {
		// TODO Auto-generated method stub
		Collections.sort(transportList,new TransportStorageCostImpl());
		return transportList;
	}

	@Override
	public int compare(Transport o1, Transport o2) {
		if(o1.getCost()>o2.getCost()) {
			return 1;
		}
		if(o1.getCost()<o2.getCost()) {
			return -1;
		}
		return 0;
	}

}
