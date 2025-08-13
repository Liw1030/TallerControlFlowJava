package clasificaciónMascotas;

import java.util.Scanner;

public class ClasificaciónMascotasVet {
    public  static  void clasificacion(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el tipo de animal(perro,gato,ave,otro):  ");
        String tipoAnimal = entrada.nextLine().trim().toLowerCase();
        System.out.print("Ingresa el nombre de tu mascota:  ");
        String nombreMascota = entrada.nextLine().trim().toLowerCase();
        System.out.print("Ingresa la edad de tu mascota:  ");
        int edadMascota = entrada.nextInt();
        entrada.nextLine();

        String doctorAsignado = "";

        switch (tipoAnimal){
            case "perro" -> doctorAsignado = "Ana Alvarado";
            case "gato" -> doctorAsignado = "Natalia Diaz";
            case "ave" -> doctorAsignado = "Jessica Pineda";
            case "otro" -> doctorAsignado = "Johana Usaquen";
            default -> {
                System.out.println("Animal no encotrado, ingresa otro para consultar con un especialista");
                return;
            }
        }

        System.out.println("Datos del Paciente");
        System.out.println("Tipo de paciente: "+ tipoAnimal);
        System.out.println("Nombre del paciente: "+ nombreMascota);
        System.out.println("Edad del paciente: " + edadMascota);
        System.out.println("Quien atenderá tu mascota será: " + doctorAsignado);

        if ((tipoAnimal.equals("gato") || tipoAnimal.equals("perro")) && edadMascota < 5) {
            System.out.println("Es recomendable una vacunación adicional");
        } else {
            System.out.println("No se recomienda una vacunación adicional");
        }

    }
}

