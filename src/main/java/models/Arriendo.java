package Models;

public class Arriendo {
    private Integer numArriendo;
    private String fecArr;
    private Integer diasArriendo;
    public Arriendo(Integer numArriendo, String fecArr, Integer diasArriendo) {
        this.numArriendo = numArriendo;
        this.fecArr = fecArr;
        this.diasArriendo = diasArriendo;
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
    @Override
    public String toString() {
        return "Arriendo [numArriendo=" + numArriendo + ", fecArr=" + fecArr + ", diasArriendo=" + diasArriendo + "]";
    }
    
}
