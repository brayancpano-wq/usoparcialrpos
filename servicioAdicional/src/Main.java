

import uniquindio.edu.co.model.Huesped;
import uniquindio.edu.co.model.Hotel;
import uniquindio.edu.co.model.habitacion;
import uniquindio.edu.co.model.reserva;
import uniquindio.edu.co.model.servicioAdicional;
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel("StayPlus",
                100032255, "Cra 13 Calle 8-67",1231,
                "stayplus.com");


        int opcion = 0;
        while(opcion != 6){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                            MENÚ
                            1. Registrar Huesped
                            2. Registrar Habitacion
                            3. Registrar Servicio Adicional
                            4. Registrar Reserva
                            5. Consultar ingresos por fecha de realizacion
                            6. Verificar si el teléfono de un huésped es un número perfecto
                            7. Salir
                            Seleccione una opción:
                            """));
            if(opcion == 1){
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del huesped");
                String documento = JOptionPane.showInputDialog(null, "Ingrese el documento del huesped");
                int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono del huesped"));
                String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del huesped");
                String paisProcedencia = JOptionPane.showInputDialog(null, "Ingrese el pais de procedencia del huesped");
                hotel.registrarHuesped(nombre, documento, telefono, correo, paisProcedencia);
                JOptionPane.showMessageDialog(null, "¡Huésped registrado exitosamente!");

            } else if (opcion == 2) {
                int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación:"));
                String tipoHabitacion = JOptionPane.showInputDialog("Ingrese el tipo (Individual / Doble / Suite):");
                String capacidadMaxima = JOptionPane.showInputDialog("Ingrese la capacidad máxima:");
                double precioNoche = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por noche:"));
                String estado = JOptionPane.showInputDialog("Ingrese el estado de habitación(disponible/ocupado)");
                habitacion habitacion = new habitacion(numeroHabitacion,tipoHabitacion,capacidadMaxima, precioNoche, estado);
                hotel.agregarHabitacion(habitacion);

                            JOptionPane.showMessageDialog(null, "¡Habitación registrada exitosamente!");

                        } else if (opcion == 3) {
                            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del servicio:"));
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del servicio:");
                            String descripcion = JOptionPane.showInputDialog("Ingrese la descripción:");
                            double precioServicio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del servicio:"));

                            servicioAdicional servicioAdicional = new servicioAdicional(codigo, nombre, descripcion, precioServicio, true);
                            hotel.agregarServicio(servicioAdicional);

                            JOptionPane.showMessageDialog(null, "¡Servicio registrado exitosamente!");

            } else if (opcion == 4) {
                if (hotel.getListHotelHuesped().isEmpty() || hotel.getListHotelHabitacion().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Error: Debe registrar al menos un huésped y una habitación antes de crear una reserva.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    int codigoReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la reserva:"));
                    Huesped huespedReserva = hotel.buscarHuespedPorTelefono(hotel.gettelefono());

                    if (huespedReserva == null) {
                        String fechaRealizacion = JOptionPane.showInputDialog("Ingrese la fecha de realización (AAAA-MM-DD):");
                        String fechaEntrada = JOptionPane.showInputDialog("Ingrese la fecha de entrada (AAAA-MM-DD):");
                        String fechaSalida = JOptionPane.showInputDialog("Ingrese la fecha de salida (AAAA-MM-DD):");
                        String estado = JOptionPane.showInputDialog("Ingrese el estado de la reserva: (Disponible, Reservada, Ocupada, Mantenimiento)");
                        String metodoPago = JOptionPane.showInputDialog("Ingrese el método de pago (Efectivo / Tarjeta / Transferencia):");
                        double descuentoFrecuente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento frecuente (ej: 0.0 para ninguno o 0.15 para 15%):"));

                        int noches = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de noches:"));

                        reserva nuevaReserva = new reserva(codigoReserva, fechaRealizacion, fechaEntrada, fechaSalida, estado, metodoPago, 0.0, descuentoFrecuente, noches);

                        // Asociar la primera habitación disponible
                        for (int i = 0; i < hotel.getListHotelHabitacion().size(); i++) {
                            habitacion hab = hotel.getListHotelHabitacion().get(i);
                            if (hab.getEstado().equalsIgnoreCase("Disponible")) {
                                nuevaReserva.agregarHabitacion(hab);
                                hab.setEstado("Reservada");
                                break;
                            }
                        }

                        // Asociar el primer servicio adicional si existe alguno registrado
                        if (!hotel.getListHotelServicioAdicional().isEmpty()) {
                            nuevaReserva.agregarServicio(hotel.getListHotelServicioAdicional().get(0));
                        }

                        hotel.agregarReserva(nuevaReserva);

                        JOptionPane.showMessageDialog(null, "¡Reserva creada exitosamente!\nValor Total: $" + nuevaReserva.getValorTotal());
                    }
                }
                        } else if (opcion == 5) {
                String fechaConsulta = JOptionPane.showInputDialog("Ingrese la fecha a consultar (ejemplo: 2026-09-24):");

                double ingresos = hotel.calcularIngresosPorFecha(fechaConsulta);

                JOptionPane.showMessageDialog(null, "El total de ingresos acumulados para la fecha " + fechaConsulta + " es: $" + ingresos);

                        } else if (opcion == 6) {
                            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del huésped a consultar:"));
                            String resultado = hotel.verificarTelefonoPerfectoHuesped(telefono);

                            JOptionPane.showMessageDialog(null, resultado);

                        } else if (opcion == 7) {
                            JOptionPane.showMessageDialog(null, "chat finalizado:::");

                        } else {
                            JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } while (opcion != 7);
                }
            }

