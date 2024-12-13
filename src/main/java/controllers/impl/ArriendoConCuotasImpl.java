package controllers.impl;

import controllers.IArriendoConCuotas;
import models.Cliente;
import models.Vehiculo;
import storage.DataStorage;
import java.util.List;

public class ArriendoConCuotasImpl implements IArriendoConCuotas {
    private DataStorage dataStorage;

    public ArriendoConCuotasImpl() {
        this.dataStorage = DataStorage.getInstance();
    }

    @Override
    public List<Cliente> seleccionarCliente() {
        return dataStorage.getClientes();
    }

    @Override
    public List<Vehiculo> seleccionarAutomovil() {
        return dataStorage.getVehiculos();
    }

    @Override
    public void ingresarNuevoCliente(Cliente cliente) {
        dataStorage.addClient(cliente);
    }

    @Override
    public void guardarArriendoYMostrarCuotas() {

    }

    @Override
    public void pagarPrimerCuota() {

    }

    @Override
    public void agregarClientes(Cliente cliente) {

    }
}
