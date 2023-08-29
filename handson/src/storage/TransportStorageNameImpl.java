package storage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.Transport;

public class TransportStorageNameImpl implements TransportStorage,Comparator<Transport> {

	@Override
	public List<Transport> sortTransport(List<Transport> transportList) {
		// TODO Auto-generated method stub
		Collections.sort(transportList,new TransportStorageNameImpl());
		return transportList;
	}

	@Override
	public int compare(Transport o1, Transport o2) {
		// TODO Auto-generated method stub
		return o1.getTransportName().compareTo(o2.getTransportName());
	}

}
