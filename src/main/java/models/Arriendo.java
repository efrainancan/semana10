package models;

public class Arriendo {

  private Integer numArriendo;
  private String fecArr;
  private Integer diasArriendo;
  private Cliente cliente;
  private Vehiculo vehiculo;

  public Arriendo(Integer numArriendo, String fecArr, Integer diasArriendo) {
    this.numArriendo = numArriendo;
    this.fecArr = fecArr;
    this.diasArriendo = diasArriendo;
  }

  public Arriendo(Integer numArriendo, String fecArr, Integer diasArriendo, Cliente cliente, Vehiculo vehiculo) {
    this.numArriendo = numArriendo;
    this.fecArr = fecArr;
    this.diasArriendo = diasArriendo;
    this.cliente = cliente;
    this.vehiculo = vehiculo;
  }

  public int obtenerMontoAPagar(int precioDia) {
    return diasArriendo * precioDia;
  }

  // se ejecuta antes de guardar un arriendo al sistema
  public boolean evaluarArriendo() {
    return cliente.isVigente() && vehiculo.getCondicion().equals('D');
  }

  public Integer getNumArriendo() {
    return numArriendo;
  }

  public void setNumArriendo(Integer numArriendo) {
    this.numArriendo = numArriendo;
  }

  public String getFecArr() {
    return fecArr;
  }

  public void setFecArr(String fecArr) {
    this.fecArr = fecArr;
  }

  public Integer getDiasArriendo() {
    return diasArriendo;
  }

  public void setDiasArriendo(Integer diasArriendo) {
    this.diasArriendo = diasArriendo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Vehiculo getVehiculo() {
    return vehiculo;
  }

  public void setVehiculo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
  }

  @Override
  public String toString() {
    return "Arriendo [numArriendo=" + numArriendo + ", fecArr=" + fecArr + ", diasArriendo=" + diasArriendo + "]";
  }

}
