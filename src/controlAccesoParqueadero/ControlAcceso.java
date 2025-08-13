package controlAccesoParqueadero;

import java.util.Scanner;

public class ControlAcceso {
    public  static void controlAcceso(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el tipo de vehículo (carro, moto, bicicleta): ");
        String tipoVehiculo = entrada.nextLine().trim().toLowerCase();
        System.out.print("Ingresa la hora de llegada (formato 24h, ej: 20): ");
        int horaLlegada = entrada.nextInt();


        if (horaLlegada < 0 || horaLlegada > 23) {
            System.out.println("Hora no válida. Debe estar entre 0 y 23.");
            return;
        }

        double tarifaBase;

        if (tipoVehiculo.equals("carro")) {
            tarifaBase = 5000;
        } else if (tipoVehiculo.equals("moto")) {
            tarifaBase = 3000;
        } else if (tipoVehiculo.equals("bicicleta")) {
            tarifaBase = 1000;
        } else {
            System.out.println("Tipo de vehículo no válido.");
            return;
        }

        double recargo = 0;
        if (horaLlegada >= 20) {
            recargo = tarifaBase * 0.20;
            System.out.println("Recargo nocturno del 20% aplicado.");
        }

        double total = tarifaBase + recargo;

        System.out.println("Resumen de Parqueo:");
        System.out.println("Vehículo: " + tipoVehiculo);
        System.out.println("Hora de llegada: " + horaLlegada + ":00");
        System.out.println("Tarifa base: $" + tarifaBase);
        System.out.println("Recargo: $" + recargo);
        System.out.println("Total a pagar: $" + total);

    }
}
