public class main {
    public static void main(String args[]) {
        Cliente cliente = new Cliente();
        cliente.edad = 39;
        cliente.nombre = "Gonzalo";
        cliente.telefono = 15579816;
        cliente.credito = 25843;
        
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 27;
        trabajador.nombre = "Martin";
        trabajador.telefono = 15563521;
        trabajador.salario = 1500;
        
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
     int edad;
     String nombre;
     int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}