package back;

import Models.Cliente;

import java.util.ArrayList;

public class ArriendoCuota extends Arriendo {
    private int cantCuotas;
    private ArrayList<CuotaArriendo> cuotas;

    //constructor

    public ArriendoCuota(int numArriendo, String fecArr, int diasArriendo, int cantCuotas, ArrayList<CuotaArriendo> cuotas) {
        super(numArriendo, fecArr, diasArriendo);
        this.cantCuotas = cantCuotas;
        this.cuotas = cuotas;
    }

    //getters

    public int getCantCuotas() {
        return cantCuotas;
    }

    public ArrayList<CuotaArriendo> getCuotas() {
        return cuotas;
    }

    //setters

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public void setCuotas(ArrayList<CuotaArriendo> cuotas) {
        this.cuotas = cuotas;
    }




    //metodo ingresar arriendo con cuota


    //metodo generar cuotas

}

