import Views.Principal;
import models.Vehiculo;
import storage.DataStorage;

public class Main {

    private static final DataStorage storage = DataStorage.getInstance();
    
    public static void main(String[] args) {
        // Al no tener manera de agregar automoviles, se agrega esta lista
        storage.addCar(new Vehiculo("ASFD-12", 'D'));
        storage.addCar(new Vehiculo("QWER-21", 'D'));
        storage.addCar(new Vehiculo("ZXCV-34", 'D'));
        storage.addCar(new Vehiculo("HAHA-21", 'D'));
        Principal cliente = new Principal();
        cliente.setVisible(true);
    }

}
