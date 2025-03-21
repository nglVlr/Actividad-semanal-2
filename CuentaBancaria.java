public class CuentaBancaria {
    // atributos privados
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    // constructo
    public CuentaBancaria(String numeroCuenta, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.propietario = propietario;
        this.saldo = 0.0;
    }

    //metodo para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito de Q" + monto + " realizado exitosamente. Saldo actual: Q" + saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    //metodo para retirar dinero
    
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de Q" + monto + " realizado exitosamente. Saldo actual: Q" + saldo);
        } else if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes para retirar Q" + monto + ". Saldo actual: Q" + saldo);
        } else {
            System.out.println("Error: El monto a retirar debe ser positivo.");
        }
    }

    //metodo para consultar el saldo actual
    public double consultarSaldo() {
        return saldo;
    }

    //metodo para mostrar la info de la cuenta y su propietario
    public void mostrarInformacionCuenta() {
        System.out.println("No. de Cuenta: " + numeroCuenta);
        System.out.println("Saldo Actual: Q" + saldo);
        System.out.println("Propietario:");
        propietario.mostrarDatos();
    }
}