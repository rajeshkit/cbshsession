package storage;

import java.util.List;

import entity.Transport;

public interface TransportStorage {
	public List<Transport> sortTransport(List<Transport> transportList);
}
