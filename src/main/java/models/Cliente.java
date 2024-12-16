package models;

public class Cliente {

  private String cedula;
  private String nombre;
  private boolean vigente;

  public Cliente(String cedula, String nombre, boolean vigente) {
    setCedula(cedula);
    this.nombre = nombre;
    this.vigente = vigente;
  }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    var tmp = cedula.split("-");
    if (tmp.length != 2) {
      throw new IllegalArgumentException("Cedula no es valida");  
    }
    var rut = Integer.parseInt(tmp[0]);
    if (tmp[1].charAt(0) != calcularDv(rut)) {
        throw new IllegalArgumentException("Cedula no es valida");
    }
    this.cedula = cedula;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean isVigente() {
    return vigente;
  }

  public void setVigente(boolean vigente) {
    this.vigente = vigente;
  }

  @Override
  public String toString() {
    return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", vigente=" + vigente + "]";
  }

    private char calcularDv(int rut) {
        int suma = 0;
        int factor = 2;

        while (rut > 0) {
            suma += (rut % 10) * factor;
            rut /= 10;
            factor++;
            if (factor > 7) {
                factor = 2;
            }
        }

        int resto = 11 - (suma % 11);
        if (resto == 11) {
            return '0';
        } else if (resto == 10) {
            return 'K';
        } else {
            return (char) (resto + '0');
        }
    }
}
