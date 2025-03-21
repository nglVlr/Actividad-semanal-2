import java.util.ArrayList;

public class Banco {
    // atrivutos privados
    private String nombre;
    private ArrayList<CuentaBancaria> listaCuentas;

    //constructor
    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaCuentas = new ArrayList<CuentaBancaria>();
    }

    // metodo para agregar una cuenta al banco
    public void agregarCuenta(CuentaBancaria cuenta) {
        listaCuentas.add(cuenta);
        System.out.println("Cuenta agregada exitosamente al banco " + nombre + ".");
    }

    //metodo para mostrar todas las cuentas registradas en el banco
    public void mostrarCuentas() {
        System.out.println("Listado de Cuentas del Banco " + nombre + ":");
        for (CuentaBancaria cuenta : listaCuentas) {
            cuenta.mostrarInformacionCuenta();
            System.out.println("-----------------------------");
        }
    }
}