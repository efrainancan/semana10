package storage;

import java.util.ArrayList;
import java.util.List;

import models.Cliente;
import models.Vehiculo;

public class DataStorage {

  private static final DataStorage INSTANCE = new DataStorage();

  private final List<Cliente> clientList;
  private final List<Vehiculo> carList;

  private DataStorage() {
    clientList = new ArrayList<>();
    carList = new ArrayList<>();
  }

  public static DataStorage getInstance() {
    return INSTANCE;
  }

  public List<Cliente> getClientes() {
    return clientList;
  }

  public List<Vehiculo> getVehiculos() {
    return carList;
  }


  public void addClient(Cliente cliente) {
    clientList.add(cliente);
  }

}
