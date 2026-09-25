package uniquindio.edu.co.model;


public class Huesped {

    // Atributos de la clase Huesped
    private String nombre, documento, correo, paisProcedencia;
    private int telefono;

    /**
     * Metodo constructor de la clase Huesped
     * @param nombre del Huesped
     * @param documento del Huesped
     * @param telefono del Huesped
     * @param correo del Huesped
     * @param paisProcedencia del Huesped
     */

    public Huesped(String nombre, String documento, int telefono, String correo, String paisProcedencia) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.paisProcedencia = paisProcedencia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    @Override
    public String toString() {
        return "Huesped{" +
                " nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                '}';
    }
}