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
    private List<Habitacion> listHotelHabitacion;
    private List<Huesped> listHotelHuesped;
    private List<Reserva> listHotelReserva;
    private List<ServicioAdicional> listHotelServicioAdicional;

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

    public void agregarHuesped(Huesped huesped) {
        listHotelHuesped.add(huesped);
    }

    public void agregarHabitacion(Habitacion habitacion) {
        listHotelReserva.add(habitacion);
    }

    public void agregarReserva(Reserva reserva) {
        listHotelReserva.add(reserva);
    }

    public void agregarServicio(ServicioAdicional servicio) {
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

    public List<Habitacion> getListHotelHabitacion() {
        return listHotelHabitacion;
    }

    public void setListHotelHabitacion(List<Habitacion> listHotelHabitacion) {
        this.listHotelHabitacion = listHotelHabitacion;
    }

    public List<Huesped> getListHotelHuesped() {
        return listHotelHuesped;
    }

    public void setListHotelHuesped(List<Huesped> listHotelHuesped) {
        this.listHotelHuesped = listHotelHuesped;
    }

    public List<Reserva> getListHotelReserva() {
        return listHotelReserva;
    }

    public void setListHotelReserva(List<Reserva> listHotelReserva) {
        this.listHotelReserva = listHotelReserva;
    }

    public List<ServicioAdicional> getListHotelServicioAdicional() {
        return listHotelServicioAdicional;
    }

    public void setListHotelServicioAdicional(List<ServicioAdicional> listHotelServicioAdicional) {
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
