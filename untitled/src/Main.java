package uniquindio.edu.co;

import uniquindio.edu.co.model.Huesped;
import uniquindio.edu.co.model.Hotel;

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
                            2. Registrar Reserva
                            3. Eliminar un estudiante
                            4. Mostrar información de la Universidad
                            5. Mostrar estudiantes palindromos
                            6. Salir
                            Seleccione una opción:
                            """));
            if(opcion == 1){
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del huesped");
                String documento = JOptionPane.showInputDialog(null, "Ingrese el documento del huesped");
                int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono del huesped"));
                String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del huesped");
                String paisProcedencia = JOptionPane.showInputDialog(null, "Ingrese el pais de procedencia del huesped");
                hotel.registrarHuesped(nombre, documento, correo, paisProcedencia, telefono);
            }
        }
    }
}