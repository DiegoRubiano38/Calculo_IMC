import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Main {

    public static int generaCC() {
        int CCAleatoria = (int) (Math.random() * 100000000 + 1);
        return CCAleatoria;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona[] array_p = new Persona[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona 1: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la edad de la persona 1: ");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese el genero (M o F) de la persona 1: ");
        char genero = scan.nextLine().charAt(0);
        System.out.println("Ingrese el peso en Kg de la persona 1: ");
        float peso = scan.nextFloat();
        System.out.println("Ingrese la estatura en metros de la persona 1: ");
        float estatura = scan.nextFloat();
        scan.nextLine();

        System.out.println("Ingrese el nombre de la persona 2: ");
        String nombre_2 = scan.nextLine();
        System.out.println("Ingrese la edad de la persona 2: ");
        int edad_2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese el genero (M o F) de la persona 2: ");
        char genero_2 = scan.nextLine().charAt(0);
        System.out.println("");

        int cc_1 = generaCC();
        int cc_2 = generaCC();
        int cc_3 = generaCC();

        array_p[0] = new Persona(nombre, cc_1, edad, peso, estatura, genero);
        array_p[1] = new Persona(nombre_2, cc_2, edad_2, genero_2);
        array_p[2] = new Persona(cc_3);

        array_p[2].setEdad(23);
        array_p[2].setEstatura(1.68f);
        array_p[2].setNombre("Julian");
        array_p[2].setPeso(62f);
        array_p[2].setGenero('M');

//-------------------Comprobar requerimientos---------------------------------------
        for (int i = 0; i < 3; i++) {
            if (array_p[i].calcularIMC() == -1) {
                System.out.println(array_p[i].getNombre() + " está por debajo de su peso ideal");
            } else if (array_p[i].calcularIMC() == 0) {
                System.out.println(array_p[i].getNombre() + " está en su peso ideal");
            } else if (array_p[i].calcularIMC() == 1) {
                System.out.println(array_p[i].getNombre() + " tiene sobrepeso");
            } else {
                System.out.println("Datos faltantes, no se puede calcular el IMC de " + array_p[i].getNombre());
            }

            if (array_p[i].esMayorDeEdad()) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }

            System.out.println("Los datos de " + array_p[i].getNombre() + " son: " + array_p[i].toString());
        }

    }

}
