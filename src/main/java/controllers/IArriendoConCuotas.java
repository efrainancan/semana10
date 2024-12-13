package controllers;

import models.Cliente;
import models.Vehiculo;
import java.util.List;

public interface IArriendoConCuotas extends IClientes{

  List<Cliente> seleccionarCliente();

  List<Vehiculo> seleccionarAutomovil();

  void ingresarNuevoCliente(Cliente cliente);

  void guardarArriendoYMostrarCuotas();

  void pagarPrimerCuota();

}