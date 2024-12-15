package models;

import java.util.ArrayList;
import java.util.List;

public class ArriendoCuota extends Arriendo {

  private Integer cantCuotas;
  private ArrayList<CuotaArriendo> cuotas;

  public ArriendoCuota(Integer numArriendo, String fecArr, Integer diasArriendo, Integer cantCuotas) {
    super(numArriendo, fecArr, diasArriendo);
    setCantCuotas(cantCuotas);
  }

  public ArriendoCuota(Integer numArriendo, String fecArr, Integer diasArriendo, Cliente cliente, Vehiculo vehiculo, int cantCuotas) {
    super(numArriendo, fecArr, diasArriendo, cliente, vehiculo);
    setCantCuotas(cantCuotas);
  }
  
  public Integer getCantCuotas() {
    return cantCuotas;
  }

  public void setCantCuotas(int cantCuotas) {
    if (cantCuotas < 1) {
        throw new IllegalArgumentException("Cantidad de cuotas no puede ser menor a 1");
    }
    this.cantCuotas = cantCuotas;
  }

  @Override
  public String toString() {
    return "ArriendoCuota [cantCuotas=" + cantCuotas + "]";
  }

  /**
   * Este método evalúa los datos del arriendo instanciado (invocando la función evaluarArriendo) retornando true si la operación fue exitosa y false si no lo fue. En el caso de que la operación sea exitosa, este método automáticamente
   * dejará el vehículo arrendado con condición A y para aplicar correctamente la relación compuesta entre los objetos arriendoCuota y cuotas, asignará las cuotas respectivas del arriendo invocando la función definida en c).
   *
   * @param precioDia
   * @return true cuando la operacion es exitosa.
   */
  public boolean ingresarArriendoConCuota(int precioDia) {
    boolean evaluacionCorrecta = evaluarArriendo();
    if (!evaluacionCorrecta) {
      return false;
    }

    getVehiculo().setCondicion('A');
    cuotas = generarCuotas(precioDia);
    return true;
  }

  /**
   * Generar cuotas del arriendo: operación que se ejecuta al guardar un arriendo exitoso al sistema, que recibe el precio por día del arriendo y crea las cuotas según la siguiente especificación:
   *
   * El número de cada cuota es un correlativo que comienza en 1 y se aumenta en uno para las cuotas siguientes.
   *
   * El valor de cada cuota es la división entre monto a pagar y cantidad de cuotas.
   *
   * Todas las cuotas deben quedar inicialmente con pagada igual a False.
   *
   * @param precioDia
   * @return - Este método debe retornar la lista (ArrayList) de cuotas generada para que sea asignada (o referenciada) al arriendo respectivo.
   */
  public ArrayList<CuotaArriendo> generarCuotas(int precioDia) {
    int total = obtenerMontoAPagar(precioDia);
    int valorCuota = total / cantCuotas;
    var output = new ArrayList<CuotaArriendo>();
    for (int i = 0; i < cantCuotas; i++) {
      output.add(new CuotaArriendo(i + 1, valorCuota, false));
    }
    return output;
  }

  /**
   * Pagar cuota: operación que recibe la cuota a pagar y busca la cuota en la lista respectiva. Si la encuentra, el método actualiza el atributo pagada con True y retorna un true, en caso contrario, retorna un false.
   *
   * @return
   */
  public boolean pagarCuota(int numCuota) {
    var cuota = cuotas.stream().filter(c -> c.getNumCuota() == numCuota).findAny();
    if (cuota.isEmpty()) {
      System.out.println("Cuota numero " + numCuota + " no fue encontrada");
      return false;
    }
    var estaPagada = cuota.get().getPagada();
    if (estaPagada) {
      System.out.println("Cuota numero " + numCuota + " ya esta pagada");
      return false;
    }

    cuota.get().setPagada(true);
    return true;
  }

  public List<CuotaArriendo> getCuotasArriendo() {
    return cuotas;
  }
  
}
