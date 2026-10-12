package Ejercicio10_billeteraVirtual;

public class BilleteraVirtual {
    private String alias;
    private double saldo;
    private double limiteDiarioTransferencia;
    private double transferidoHoy;

    public BilleteraVirtual(String alias, double saldo, double limiteDiarioTransferencia) {
        if (saldo < 0 || limiteDiarioTransferencia <= 0) {
            throw new IllegalArgumentException("Saldo o límite diario inválidos.");
        }
        this.alias = alias;
        this.saldo = saldo;
        this.limiteDiarioTransferencia = limiteDiarioTransferencia;
        this.transferidoHoy = 0;
    }

    public boolean transferir(double monto) {
        if (monto <= 0) {
            return false;
        }
        if (monto > saldo) {
            return false;
        }
        if (transferidoHoy + monto > limiteDiarioTransferencia) {
            return false;
        }
        saldo -= monto;
        transferidoHoy += monto;
        return true;
    }

    public boolean configurarLimite(String aliasTitular, double nuevoLimite) {
        if (!alias.equals(aliasTitular) || nuevoLimite <= 0) {
            return false;
        }
        limiteDiarioTransferencia = nuevoLimite;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTransferidoHoy() {
        return transferidoHoy;
    }

    public double getLimiteDiarioTransferencia() {
        return limiteDiarioTransferencia;
    }
}
