package Ejercicio10_billeteraVirtual;

public class Main {
    public static void main(String[] args) {
        BilleteraVirtual billetera = new BilleteraVirtual("tiziano.mp", 100000.0, 50000.0);

        System.out.println("Transferir 30000: " + (billetera.transferir(30000.0) ? "OK" : "RECHAZADA"));
        System.out.println("Transferir 30000 (supera el límite diario): " + (billetera.transferir(30000.0) ? "OK" : "RECHAZADA"));
        System.out.println("Transferir 500000 (supera el saldo): " + (billetera.transferir(500000.0) ? "OK" : "RECHAZADA"));
        System.out.println("Cambiar límite con alias ajeno: " + (billetera.configurarLimite("otro.alias", 90000.0) ? "OK" : "RECHAZADO"));
        System.out.println("Cambiar límite como titular: " + (billetera.configurarLimite("tiziano.mp", 90000.0) ? "OK" : "RECHAZADO"));
        System.out.println("Transferir 30000: " + (billetera.transferir(30000.0) ? "OK" : "RECHAZADA"));

        System.out.println("Saldo final: " + billetera.getSaldo() + " - Transferido hoy: " + billetera.getTransferidoHoy());
    }
}
