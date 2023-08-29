package view;

import storage.TransportStorage;
import storage.TransportStorageCostImpl;
import storage.TransportStorageIdImpl;
import storage.TransportStorageNameImpl;

public class TransportStorageFactory {
	public static TransportStorage transportStorage;
	public static TransportStorage getTransportImpl(String type) {
		if("id".equalsIgnoreCase(type)) {
			transportStorage=new TransportStorageIdImpl();
		}
		if("name".equalsIgnoreCase(type)) {
			transportStorage = new TransportStorageNameImpl();
		}
		if("cost".equalsIgnoreCase(type)) {
			transportStorage = new TransportStorageCostImpl();
		}
		return transportStorage;
	}
}
