package models;

import java.util.Objects;

public class Vehiculo {

  private String patente;
  private Character condicion;

  public Vehiculo(String patente, Character condicion) {
    setPatente(patente);
    setCondicion(condicion);
  }

  public String getPatente() {
    return patente;
  }

  public void setPatente(String patente) {
    Objects.requireNonNull(patente, "patente no puede ser nula");
    if (patente.isBlank()) {
      throw new IllegalArgumentException("patente debe contener al menos un caracter");
    }
    this.patente = patente;
  }

  public Character getCondicion() {
    return condicion;
  }

  public void setCondicion(Character condicion) {
    Objects.requireNonNull(condicion, "Condicion no puede ser nula");
    if (condicion != 'A' && condicion != 'D') {
      throw new IllegalArgumentException("Solo valores 'A' y 'D' permitidos");
    }
    this.condicion = condicion;
  }

  @Override
  public String toString() {
    return "Vehiculo [patente=" + patente + ", condicion=" + condicion + "]";
  }

}
