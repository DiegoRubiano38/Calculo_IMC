
/**
 *
 * @author diego
 */
//------------------DECLARACIÓN DE ATRIBUTOS------------------//
public class Persona {

    private String nombre;
    private int edad;
    private int cc;
    private float peso, estatura;
    private char genero;

//------------------MÉTODOS GETTER----------------------------//    
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getcc() {
        return cc;
    }

    public float getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public char getGenero() {
        return genero;
    }

//------------------MÉTODOS SETTER----------------------------//
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

//------------------CONSTRUCTORES----------------------------//    
    public Persona(int cc) {
        this.cc = cc;
    }

    public Persona(String nombre, int cc, int edad, char genero) {
        this.cc = cc;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Persona(String nombre, int cc, int edad, float peso, float estatura, char genero) {
        this.nombre = nombre;
        this.cc = cc;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.genero = genero;
    }

//------------------MÉTODOS----------------------------// 
    public int calcularIMC() {
        while (peso != 0 && estatura != 0) {
            float formula = peso / (estatura * estatura);
            if (formula < 20) {
                return -1;
            } else if (formula >= 20 && formula <= 25) {
                return 0;
            } else {
                return 1;
            }
        }
        return 2;
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String comprobarGenero() {
        if (genero == 'F') {
            return "Femenino";
        } else if (genero == 'M') {
            return "Masculino";
        } else {
            return "Digite F o M";
        }
    }

    @Override
    public String toString() {
        return "\nnombre: " + nombre
                + "\ncédula: " + cc
                + "\nedad: " + edad
                + "\npeso: " + peso
                + "\nestatura: " + estatura
                + "\ngenero: " + comprobarGenero()
                + "\n";
    }

}
