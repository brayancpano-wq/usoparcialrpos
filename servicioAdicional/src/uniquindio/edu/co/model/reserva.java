package uniquindio.edu.co.model;
import uniquindio.edu.co.model.Hotel;

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
        public double descuentoFrecuente;
        public int cantidadNoches;

        //Relaciones de la clase reserva
        private List<servicioAdicional> listservicioAdicionalreserva;
        private Huesped huesped;
        private List<habitacion> listreservahabitacion;

        /**
         * Metodo constructor de la clase reserva
         *  @param codigoReserva del reserva
         * @param fechaRealizacion del reserva
         *  @param fechaEntrada del reserva
         *  @param fechaSalida del reserva
         * @param estado del reserva
         *  @param metodoPago del reserva
         *  @param valorTotal del reserva
         * @param  descuentoFrecuente del reserva
         * @param  cantidadNoches del reserva
         */

        public reserva (int codigoReserva , String fechaRealizacion, String fechaEntrada,String fechaSalida,
                        String estado, String metodoPago,double valorTotal,double descuentoFrecuente,int cantidadNoches ){
            this.codigoReserva= codigoReserva;
            this.fechaRealizacion=fechaRealizacion;
            this.fechaEntrada=fechaEntrada;
            this.fechaSalida= fechaSalida;
            this.estado =estado;
            this.metodoPago=metodoPago;
            this.valorTotal=valorTotal;
            this.descuentoFrecuente=descuentoFrecuente;
            this.cantidadNoches=cantidadNoches;

            this.listservicioAdicionalreserva = new ArrayList<servicioAdicional>();
            this.listreservahabitacion= new ArrayList<>();
        }

        /**
         * Calcula el valor total de la reserva sumando el precio de las habitaciones
         * multiplicado por la cantidad de noches, más el costo de los servicios adicionales
         */
        public double getValorTotal() {
            double costoHabitaciones = 0.0;

            for (int i = 0; i < listreservahabitacion.size(); i++) {
                habitacion hab = listreservahabitacion.get(i);
                costoHabitaciones += hab.getPrecioNoche() * cantidadNoches;
            }

            double costoServicios = 0.0;
            for (int i = 0; i < listservicioAdicionalreserva.size(); i++) {
                servicioAdicional serv = listservicioAdicionalreserva.get(i);
                costoServicios += serv.getPrecio();
            }

            double subtotal = costoHabitaciones + costoServicios;
            return subtotal - (subtotal * descuentoFrecuente);
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

        public void setCodigoReserva(int codigoReserva) {
            this.codigoReserva = codigoReserva;
        }

        public String getFechaRealizacion() {
            return fechaRealizacion;
        }

        public void setFechaRealizacion(String fechaRealizacion) {
            this.fechaRealizacion = fechaRealizacion;
        }

        public String getFechaEntrada() {
            return fechaEntrada;
        }

        public void setFechaEntrada(String fechaEntrada) {
            this.fechaEntrada = fechaEntrada;
        }

        public String getFechaSalida() {
            return fechaSalida;
        }

        public void setFechaSalida(String fechaSalida) {
            this.fechaSalida = fechaSalida;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getMetodoPago() {
            return metodoPago;
        }

        public void setMetodoPago(String metodoPago) {
            this.metodoPago = metodoPago;
        }

        public void setValorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
        }

        public double getDescuentoFrecuente() {
            return descuentoFrecuente;
        }

        public void setDescuentoFrecuente(double descuentoFrecuente) {
            this.descuentoFrecuente = descuentoFrecuente;
        }

        public int getCantidadNoches() {
            return cantidadNoches;
        }

        public void setCantidadNoches(int cantidadNoches) {
            this.cantidadNoches = cantidadNoches;
        }

        public List<servicioAdicional> getListservicioAdicionalreserva() {
            return listservicioAdicionalreserva;
        }

        public void setListservicioAdicionalreserva(List<servicioAdicional> listservicioAdicionalreserva) {
            this.listservicioAdicionalreserva = listservicioAdicionalreserva;
        }

        public Huesped getHuesped() {
            return huesped;
        }

        public void setHuesped(Huesped huesped) {
            this.huesped = huesped;
        }

        public List<habitacion> getListreservahabitacion() {
            return listreservahabitacion;
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

