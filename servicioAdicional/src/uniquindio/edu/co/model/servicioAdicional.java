package uniquindio.edu.co.model;

import java.util.List;

    public class servicioAdicional {

        //Atributos de la clase servicioAdicional
        public int codigo;
        public String nombre;
        public String descripcion;
        public double precio;
        public boolean disponibilidad;


        /**
         * Metodo constructor de la clase servicioAdicional
         * @param codigo del servicioAdicional
         * @param nombre del servicioAdicional
         * @param descripcion del servicioAdicional
         * @param precio del servicioAdicional
         * @param disponibilidad del servicioAdicional
         */

        public servicioAdicional (String nombre, int codigo, String descripcion,double precio, boolean disponibilidad){
            this.nombre = nombre;
            this.codigo = codigo;
            this.descripcion =descripcion;
            this.precio= precio;
            this.disponibilidad = disponibilidad;

        }

        public int getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public double getPrecio() {
            return precio;
        }

        public boolean isDisponibilidad() {
            return disponibilidad;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }


        public void setDisponibilidad(boolean disponibilidad) {
            this.disponibilidad = disponibilidad;
        }

        @Override
        public String toString() {
            return "servicioAdicional{" +
                    "codigo=" + codigo +
                    ", nombre='" + nombre + '\'' +
                    ", descripcion='" + descripcion + '\'' +
                    ", precio=" + precio +
                    ", disponibilidad=" + disponibilidad +
                    '}';
        }
    }

