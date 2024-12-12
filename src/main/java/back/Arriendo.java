package back;

public class Arriendo {
    private int numArriendo;
    private String fecArr;
    private int diasArriendo;

    public Arriendo(int numArriendo, String fecArr, int diasArriendo) {
        this.numArriendo = numArriendo;
        this.fecArr = fecArr;
        this.diasArriendo = diasArriendo;
    }

    //getters
    public int getNumArriendo() {
        return numArriendo;
    }

    public String getFecArr() {
        return fecArr;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    //setters

    public void setNumArriendo(int numArriendo) {
        this.numArriendo = numArriendo;
    }

    public void setFecArr(String fecArr) {
        this.fecArr = fecArr;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    //metodos
    public int obtenerMontoAPagar () {
        int precioDia = Info.getPrecioDia();
        return precioDia * this.diasArriendo;
    }

    //metodo para evaluar arriendo
    public boolean evaluarArriendo(Cliente cliente) {
        if (Cliente.verificarVigente())
            return true;
        return false;
    }
}