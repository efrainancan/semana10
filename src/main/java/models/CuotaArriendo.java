package models;

public class CuotaArriendo {

  private Integer numCuota;
  private Integer valorCuota;
  private Boolean pagada;
  private ArriendoCuota arriendoCuota;

  public CuotaArriendo(Integer numCuota, Integer valorCuota, Boolean pagada) {
    this.numCuota = numCuota;
    this.valorCuota = valorCuota;
    this.pagada = pagada;
  }

  public Integer getNumCuota() {
    return numCuota;
  }

  public void setNumCuota(Integer numCuota) {
    this.numCuota = numCuota;
  }

  public Integer getValorCuota() {
    return valorCuota;
  }

  public void setValorCuota(Integer valorCuota) {
    this.valorCuota = valorCuota;
  }

  public Boolean getPagada() {
    return pagada;
  }

  public void setPagada(Boolean pagada) {
    this.pagada = pagada;
  }

  @Override
  public String toString() {
    return "CuotaArriendo [numCuota=" + numCuota + ", valorCuota=" + valorCuota + ", pagada=" + pagada + "]";
  }

}
