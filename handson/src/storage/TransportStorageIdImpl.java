package storage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.Transport;

public class TransportStorageIdImpl implements TransportStorage,Comparator<Transport> {

	@Override
	public List<Transport> sortTransport(List<Transport> transportList) {
		// TODO Auto-generated method stub
		Collections.sort(transportList,new TransportStorageIdImpl());
		return transportList;
	}

	@Override
	public int compare(Transport o1, Transport o2) {
		// TODO Auto-generated method stub
		return o1.getTransportId()-o2.getTransportId();
	}
	
}
