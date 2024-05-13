public class Estu extends Persona { // herencia, Estu hereda de Persona

    int codigoEstudiante; // Agrego atributos ademas de los heredados
    float notaFinal;

    // metodo constructor

    public Estu(String nombre, int edad, int codigoEstudiante, float notaFinal) { // atributos de ambas clases
        super(nombre, edad); // ya esta inicializados en la clase Persona.
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;

    }

    public void mostrarDatos() { // metodo para mostrar datos
        System.out.println("El nombre es " + getNombre() + ", la edad es " + getEdad() +
                ", el Codigo de estudiante es " + codigoEstudiante + " y la nota final es " + notaFinal);

    }

}