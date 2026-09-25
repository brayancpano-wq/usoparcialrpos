package uniquindio.edu.co.model;

import uniquindio.edu.co.model.Huesped;
import java.util.ArrayList;
import java.util.List;


public class Hotel {

    //Atributos de la clase Hotel
    public String nombre;
    public int nit;
    public String direccion;
    public int telefono;
    public String web;

    //Relaciones de la clase Hotel
    private List<habitacion> listHotelHabitacion;
    private List<Huesped> listHotelHuesped;
    private List<reserva> listHotelReserva;
    private List<servicioAdicional> listHotelServicioAdicional;


    /**
     * Metodo constructor de la clase Hotel
     * @param nombre del Hotel
     * @param nit del Hotel
     * @param direccion del Hotel
     * @param telefono del Hotel
     * @param web del Hotel
     */

    public Hotel(String nombre, int nit, String direccion,
                 int telefono, String web){
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.web = web;

        this.listHotelHabitacion = new ArrayList<>();
        this.listHotelHuesped = new ArrayList<>();
        this.listHotelReserva = new ArrayList<>();
        this.listHotelServicioAdicional = new ArrayList<>();
    }

    /**
     * Metodo que permite registrar huespedes en el hotel
     * @param nombre del Huesped
     * @param documento del Huesped
     * @param telefono del Huesped
     * @param correo del Huesped
     * @param paisProcedencia del Huesped
     * @return
     */
    public String registrarHuesped(String nombre, String documento, int telefono, String correo, String paisProcedencia){
        String existe = "";
        Huesped huesped = buscarHuesped(documento);
        if(huesped == null){
            uniquindio.edu.co.model.Huesped hue = new Huesped(nombre,documento,telefono,correo, paisProcedencia);
            listHotelHuesped.add(hue);
            existe = "El Huesped " + nombre + " se registro exitosamente";
        }else{
            existe = "El estudiante " + nombre + " ya se encuentra matriculado";
        }
        return existe;
    }
    /**
     * Determina si un número entero es perfecto (la suma de sus divisores propios es igual al número).
     */
    public boolean esNumeroPerfecto(int numero) {
        if (numero <= 1) {
            return false;
        }

        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }
    /**
     * Busca un huésped por su teléfono y verifica si el número telefónico es perfecto.
     */
    public String verificarTelefonoPerfectoHuesped(int telefono) {
        Huesped huespedEncontrado = buscarHuespedPorTelefono(telefono);

        if (huespedEncontrado == null) {
            return "No se encontró ningún huésped con el teléfono: " + telefono;
        }

        if (esNumeroPerfecto(telefono)) {
            return "El teléfono " + telefono + " del huésped " + huespedEncontrado.getNombre() + " ES un número perfecto.";
        } else {
            return "El teléfono " + telefono + " del huésped " + huespedEncontrado.getNombre() + " NO es un número perfecto.";
        }
    }
    /**
     * Metodo para calcular los ingresos totales de las reservas realizadas en una fecha específica.
     */
    public double calcularIngresosPorFecha(String fechaConsulta) {
        double totalIngresos = 0.0;
        for (int i = 0; i < listHotelReserva.size(); i++) {
            reserva reserva = listHotelReserva.get(i);
            if (reserva.getFechaRealizacion().equals(fechaConsulta)) {
                totalIngresos += reserva.getValorTotal();
            }
        }
        return totalIngresos;
    }

    /**
     * Busca un huésped en la lista por su número de teléfono.
     */
    public Huesped buscarHuespedPorTelefono(int telefono) {
        for (int i = 0; i < listHotelHuesped.size(); i++) {
            Huesped h = listHotelHuesped.get(i);
            if (h.getTelefono()==(telefono)) {
                return h;
            }
        }
        return null;
    }

    /**
     * Metodo que permite buscar un huesped por su documento
     * @param documento del huesped a buscar
     * @return
     */
    public Huesped buscarHuesped(String documento){
        Huesped encontrado = null;
        for(int i = 0; i < listHotelHuesped.size(); i++){
            Huesped huesped = listHotelHuesped.get(i);
            if(huesped.getDocumento().equals(documento)){
                encontrado = huesped;
                break;
            }
        }
        return encontrado;
    }

    public void agregarHuesped(Huesped huesped) {
        listHotelHuesped.add(huesped);
    }

    public void agregarHabitacion(habitacion habitacion) {
        listHotelHabitacion.add(habitacion);
    }

    public void agregarReserva(reserva reserva) {
        listHotelReserva.add(reserva);
    }

    public void agregarServicio(servicioAdicional servicio) {
        listHotelServicioAdicional.add(servicio);
    }

    public String getnombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnit() {
        return nit;
    }

    public void setnit(int nit) {
        this.nit = nit;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public int gettelefono() {
        return telefono;
    }

    public void settelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getweb() {
        return web;
    }

    public void setweb(String web) {
        this.web = web;
    }

    public List<habitacion> getListHotelHabitacion() {
        return listHotelHabitacion;
    }

    public void setListHotelHabitacion(List<habitacion> listHotelHabitacion) {
        this.listHotelHabitacion = listHotelHabitacion;
    }

    public List<Huesped> getListHotelHuesped() {
        return listHotelHuesped;
    }

    public void setListHotelHuesped(List<Huesped> listHotelHuesped) {
        this.listHotelHuesped = listHotelHuesped;
    }

    public List<reserva> getListHotelReserva() {
        return listHotelReserva;
    }

    public void setListHotelReserva(List<reserva> listHotelReserva) {
        this.listHotelReserva = listHotelReserva;
    }

    public List<servicioAdicional> getListHotelServicioAdicional() {
        return listHotelServicioAdicional;
    }

    public void setListHotelServicioAdicional(List<servicioAdicional> listHotelServicioAdicional) {
        this.listHotelServicioAdicional = listHotelServicioAdicional;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                ", nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono + '\'' +
                ", web=" + web + '\'' +
                ", listHotelHabitacion=" + listHotelHabitacion +
                ", listHotelHuesped=" + listHotelHuesped +
                ", listHotelReserva=" + listHotelReserva +
                '}';
    }




}
