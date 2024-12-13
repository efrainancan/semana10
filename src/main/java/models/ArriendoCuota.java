package Models;

public class ArriendoCuota {
    private Integer cantCuotas;

    public ArriendoCuota(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    @Override
    public String toString() {
        return "ArriendoCuota [cantCuotas=" + cantCuotas + "]";
    }
    
}
