public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Perez", "1234567890101", "Zona 1, Ciudad de Guatemala");
        Cliente cliente2 = new Cliente("Angel Mayen", "1098765432101", "Zona 2, Ciudad de Guatemala");
        Cliente cliente3 = new Cliente("Valeria Guzman", "1122334455667", "Zona 3, Ciudad de Guatemala");

        // Crear cuentas bancarias asociadas a los clientes
        CuentaBancaria cuenta1 = new CuentaBancaria("100123456789", cliente1);
        CuentaBancaria cuenta2 = new CuentaBancaria("100987654321", cliente2);
        CuentaBancaria cuenta3 = new CuentaBancaria("101112131415", cliente3);

        // Crear banco
        Banco banco = new Banco("Banco Central");

        // Agregar las cuentas al banco
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);
        banco.agregarCuenta(cuenta3);

        System.out.println("\n--- Operaciones en las cuentas ---");

        // Realizar operaciones en cuenta1
        cuenta1.depositar(1500);
        cuenta1.retirar(500);
        System.out.println("Consulta saldo cuenta no.1 : Q" + cuenta1.consultarSaldo());

        // Realizar operaciones en cuenta2
        cuenta2.depositar(2000);
        cuenta2.retirar(2500); // Intento de retiro con fondos insuficientes
        System.out.println("Consulta saldo cuenta no.2: Q" + cuenta2.consultarSaldo());

        // Realizar operaciones en cuenta3
        cuenta3.depositar(3000);
        cuenta3.retirar(1000);
        System.out.println("Consulta saldo cuenta no.3: Q" + cuenta3.consultarSaldo());

        System.out.println("\n--- Informacion de todas las cuentas en el banco ---");
        banco.mostrarCuentas();
    }
}