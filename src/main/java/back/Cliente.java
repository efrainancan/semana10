package back;
import java.util.regex.Pattern;

public class Cliente {
    private String cedula;
    private String nombre;
    private boolean vigente;

    public Cliente(String cedula, String nombre, boolean vigente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigente = vigente;
    }

    //getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isVigente() {
        return vigente;
    }

    //setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    //metodos

    //metodo para verificar vigencia del cliente
    public boolean verificarVigente() {
        return this.vigente;
    }

    //metodo para establecer al cliente como vigente
    public void establecerVigente() {
        this.vigente = true;
    }

    //metodo para establecer al cliente como no vigente
    public void establecerNoVigente() {
        this.vigente = false;
    }

    //metodo para validación de cedula a traves de RUT
    public boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            var tmpRut = rut.toUpperCase().replace(".", "").replace("-", "");
            int rutAux = Integer.parseInt(tmpRut.substring(0, tmpRut.length() - 1));

            char dv = tmpRut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (Exception e) {
        }

        return validacion;
    }

    //metodo para verificar el nombre de cliente
    public boolean verificarNombre(String nombre) {
        //1ero verificar que nombre no este en blanco
        if (nombre == null || nombre.isEmpty()) {
            System.out.println( "El nombre no se puede dejar en blanco");
            return false;
        }
        //2do verificar largo de caracteres
        if (nombre.length() < 3 || nombre.length() > 40) {
            System.out.println( "El nombre debe tener desde 3 hasta 40 caracteres");
            return false;
        }
        //3ro verificar que nombre solo contenga letras y espacios
        Pattern patron = Pattern.compile("^[a-zA-Z áéíóúÁÉÍÓÚñÑüÜ'-]+$");
        if (!patron.matcher(nombre).matches()) {
            System.out.println( "El nombre solamente puede contener letras");
            return false;
        }
        return true;
    }

}