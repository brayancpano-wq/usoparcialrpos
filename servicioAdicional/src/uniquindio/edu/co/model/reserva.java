package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

    public class reserva {

        //Atributos de la clase reserva;
        public int codigoReserva;
        public String fechaRealizacion;
        public String fechaEntrada;
        public String fechaSalida;
        public String estado;
        public String metodoPago;
        public double valorTotal;

        //Relaciones de la clase reserva
        private List<reserva> listservicioAdicionalreserva;
        private Huesped huesped;
        private List<habitacion> listreservahabitacion;

        /**
         * Metodo constructor de la clase reserva
         * * @param codigoReserva del reserva
         * *@param fechaRealizacion del reserva
         * * @param fechaEntrada del reserva
         * * @param fechaSalida del reserva
         * *@param estado del reserva
         * * @param metodoPago del reserva
         * * @param valorTotal del reserva
         */

        public reserva (int codigoReserva , String fechaRealizacion, String fechaEntrada,String fechaSalida,
                        String estado, String metodoPago,double valorTotal){
            this.codigoReserva= codigoReserva;
            this.fechaRealizacion=fechaRealizacion;
            this.fechaEntrada=fechaEntrada;
            this.fechaSalida= fechaSalida;
            this.estado =estado;
            this.metodoPago=metodoPago;
            this.valorTotal=valorTotal;

            this.listservicioAdicionalreserva = new ArrayList<>();
            this.listreservahabitacion= new ArrayList<>();
        }
        public void agregarHabitacion(habitacion habitacion) {
            listreservahabitacion.add(habitacion);
        }

        public void agregarServicio(servicioAdicional servicioAdicional) {
            listservicioAdicionalreserva.add(servicioAdicional);
        }
        public int getCodigoReserva() {
            return codigoReserva;
        }

        public String getFechaRealizacion() {
            return fechaRealizacion;
        }

        public String getFechaEntrada() {
            return fechaEntrada;
        }

        public String getFechaSalida() {
            return fechaSalida;
        }

        public String getEstado() {
            return estado;
        }

        public String getMetodoPago() {
            return metodoPago;
        }

        public double getValorTotal() {
            return valorTotal;
        }

        public List<reserva> getListservicioAdicionalreserva() {
            return listservicioAdicionalreserva;
        }

        public Huesped getHuesped() {
            return huesped;
        }

        public List<habitacion> getListreservahabitacion() {
            return listreservahabitacion;
        }

        public void setCodigoReserva(int codigoReserva) {
            this.codigoReserva = codigoReserva;
        }

        public void setFechaRealizacion(String fechaRealizacion) {
            this.fechaRealizacion = fechaRealizacion;
        }

        public void setFechaEntrada(String fechaEntrada) {
            this.fechaEntrada = fechaEntrada;
        }

        public void setFechaSalida(String fechaSalida) {
            this.fechaSalida = fechaSalida;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public void setMetodoPago(String metodoPago) {
            this.metodoPago = metodoPago;
        }

        public void setValorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
        }

        public void setListservicioAdicionalreserva(List<reserva> listservicioAdicionalreserva) {
            this.listservicioAdicionalreserva = listservicioAdicionalreserva;
        }

        public void setHuesped(Huesped huesped) {
            this.huesped = huesped;
        }

        public void setListreservahabitacion(List<habitacion> listreservahabitacion) {
            this.listreservahabitacion = listreservahabitacion;
        }

        @Override
        public String toString() {
            return "reserva{" +
                    "codigoReserva=" + codigoReserva +
                    ", fechaRealizacion='" + fechaRealizacion + '\'' +
                    ", fechaEntrada='" + fechaEntrada + '\'' +
                    ", fechaSalida='" + fechaSalida + '\'' +
                    ", estado='" + estado + '\'' +
                    ", metodoPago='" + metodoPago + '\'' +
                    ", valorTotal=" + valorTotal +
                    ", listservicioAdicionalreserva=" + listservicioAdicionalreserva +
                    ", huesped=" + huesped +
                    ", listreservahabitacion=" + listreservahabitacion +
                    '}';
        }
    }
