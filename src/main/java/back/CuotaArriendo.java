package back;

public class CuotaArriendo {
    private int numCuota;
    private int valorCuota;
    private boolean pagada;

    public CuotaArriendo(int numCuota, int valorCuota, boolean pagada) {
        this.numCuota = numCuota;
        this.valorCuota = valorCuota;
        this.pagada = pagada;
    }

    //getters


    public int getNumCuota() {
        return numCuota;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    //setters


    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    // metodos
    public boolean pagarCuota() { //¿Hay que pagar la cuota?
        if (pagada) {
            return false;
        }
        else {
            pagada = true;
            return true;
        }
    }
}