package sistemaSupermercado;

import java.util.Scanner;

public class SistemaFacturacionSupermercado {
    public static void facturacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("🧾 Facturación");
        System.out.print("Ingresa el total de tus compras: ");
        double totalCompras = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("¿Cuántos productos compró? ");
        int totalProductos = entrada.nextInt();
        entrada.nextLine();
        System.out.print("¿Tiene membresía? (S/N): ");
        String membresia = entrada.nextLine().trim().toUpperCase();

        double descuento = 0;

        if (membresia.equals("S") && totalProductos > 10) {
            descuento = totalCompras * 0.15;
        } else if (membresia.equals("S")) {
            descuento = totalCompras * 0.10;
        } else if (membresia.equals("N") && totalProductos > 10) {
            descuento = totalCompras * 0.05;
        } else {
            System.out.println("No aplica para descuentos.");
        }

        double totalFinal = totalCompras - descuento;

        System.out.println("Resumen de compra:");
        System.out.println("Total productos: " + totalProductos);
        System.out.println("Total sin descuento: $" + totalCompras);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}