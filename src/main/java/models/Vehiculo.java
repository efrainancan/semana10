package Models;

public class Vehiculo {
    private String patente;
    private Character condicion;
    public Vehiculo(String patente, Character condicion) {
        this.patente = patente;
        this.condicion = condicion;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public Character getCondicion() {
        return condicion;
    }
    public void setCondicion(Character condicion) {
        this.condicion = condicion;
    }
    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", condicion=" + condicion + "]";
    }
}
