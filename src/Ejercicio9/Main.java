package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(30);
        cliente.setNombre("Juan");
        cliente.setTelefono("+543517473121");
        cliente.setCredito(10000);
        System.out.println("Hola! Soy " + cliente.getNombre() + " tengo " + cliente.getEdad() + " años y mi numero de telefono es " + cliente.getTelefono() + ". Actualmente tengo un credito de " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Juan");
        trabajador.setTelefono("+543517473121");
        trabajador.setSalario(3000);
        System.out.println("Hola! Soy " + trabajador.getNombre() + " tengo " + trabajador.getEdad() + " años y mi numero de telefono es " + trabajador.getTelefono() + ". Actualmente tengo un salario de " + trabajador.getSalario());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
