package storage;

import java.util.ArrayList;
import java.util.List;
import models.ArriendoCuota;

import models.Cliente;
import models.Vehiculo;

public class DataStorage {

  private static final DataStorage INSTANCE = new DataStorage();

  private final List<Cliente> clientList;
  private final List<Vehiculo> carList;
  private final List<ArriendoCuota> arriendoCuotaList;

  private DataStorage() {
    clientList = new ArrayList<>();
    carList = new ArrayList<>();
    arriendoCuotaList = new ArrayList<>();
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

  public Cliente findClient(String cedula) {
      return clientList.stream()
        .filter(c -> c.getCedula().equalsIgnoreCase(cedula))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado: " + cedula));
  }

  public void addClient(Cliente cliente) {
    if (clienteExiste(cliente.getCedula())) {
        throw new IllegalArgumentException("Cliente ya existe con cedula: " + cliente.getCedula());
    }
    clientList.add(cliente);
  }

  public boolean clienteExiste(String cedula) {
    return clientList.stream().anyMatch(c -> c.getCedula().equalsIgnoreCase(cedula));
  }
  
  public void addCar(Vehiculo vehiculo) {
    carList.add(vehiculo);
  }
  
  public Vehiculo findCar(String patente) {
      return carList.stream()
        .filter(c -> c.getPatente().equalsIgnoreCase(patente))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Vechiulo no encontrado: " + patente));
  }
 
  public void addArriendoCuotaList(ArriendoCuota arriendoCuota) {
    arriendoCuotaList.add(arriendoCuota);
  }
  
  public int getArriendoCuotaNextSeq() {
    return arriendoCuotaList.size() + 1;
  }

}
