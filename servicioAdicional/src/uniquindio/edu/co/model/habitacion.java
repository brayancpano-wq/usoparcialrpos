package uniquindio.edu.co.model;

import java.util.List;

public class habitacion {

    //Atributos de la clase habitacion
    public int numeroHabitacion;
    public String tipoHabitacion;
    public String capacidadMaxima;
    public double precioNoche;
    public String estado;


    /**
     * Metodo constructor de la clase servicioAdicional
     * @param numeroHabitacion del servicioAdicional
     * @param tipoHabitacion del servicioAdicional
     * @param capacidadMaxima del servicioAdicional
     * @param precioNoche del servicioAdicional
     * @param estado del servicioAdicional
     */

    public habitacion (int numeroHabitacion,
                       String tipoHabitacion, String capacidadMaxima ,
                              double precioNoche,String estado){
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion ;
        this.capacidadMaxima =capacidadMaxima;
        this.precioNoche= precioNoche;
        this.estado = estado;

    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(String capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", capacidadMaxima='" + capacidadMaxima + '\'' +
                ", precioNoche=" + precioNoche +
                ", estado='" + estado + '\'' +
                '}';
    }
}


