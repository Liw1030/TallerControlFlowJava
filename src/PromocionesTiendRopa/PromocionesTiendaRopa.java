package PromocionesTiendRopa;

import java.util.Locale;
import java.util.Scanner;

public class PromocionesTiendaRopa {
    public  static void promociones(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Promociones Tienda de Ropa");
        System.out.print("Ingresa la prenda que quieres comprar (camisa, pantalon, chaqueta): ");
        String prenda = entrada.nextLine().trim().toLowerCase();
        System.out.print("Ingresa la cantidad: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        double precioUnidad;
        double totalPagar;

        switch (prenda) {
            case "camisa" -> precioUnidad = 50000;
            case "pantalon" -> precioUnidad = 120000;
            case "chaqueta" -> precioUnidad = 300000;
            default -> {
                System.out.println("Producto no encontrado.");
                return;
            }
        }

        totalPagar = precioUnidad * cantidad;
        double descuento = 0;

        if (cantidad > 5) {
            descuento = totalPagar * 0.15;
        }

        double totalFinal = totalPagar - descuento;

        System.out.println("Detalles de la Compra:");
        System.out.println("Producto: " + prenda);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total sin descuento: $" + totalPagar);
        if (descuento > 0) {
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Total con descuento: $" + totalFinal);
        } else {
            System.out.println("No aplica para descuento.");
            System.out.println("Total a pagar: $" + totalFinal);
        }
    }
}
