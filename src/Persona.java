
public class Persona { // creo una clase llamada Persona
    // atributos de la clase Persona
    protected String nombre;
    protected int edad;

    // método constructor de la clase Persona
    public Persona(String nombre, int edad) { // no devuelve ningun valor, es público, mismo nombre de la clase Persona

        this.nombre = nombre; // this es el atributo
        this.edad = edad;
    }

    // métodos accesores Getters y Setters
    public String getNombre() { // Get: obtener datos, traer
        return nombre; // retorna nombre
    }

    public void setNombre(String nombre) { // puede colocar o establecer o modificar algun dato
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) { // es un procedimiento, se encarga de setearlo
        this.edad = edad;
    }

    // método para mostrar solo atributos de la clase Persona
    // public void mostrarDatos() {

    // System.out.println("El nombre es " + nombre);
    // System.out.println("La edad es " + edad);
    // }

}