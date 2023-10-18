import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Name;
        String Race;
        int Age;
        String Food;
        double Grams;

        Perro A1 = new Perro();
        Perro B2 = new Perro();


        try {
            System.out.println("Introduce el nombre del perro");
            Name = teclado.nextLine();
            A1.setNombre(Name);
            System.out.println("Introduce la raza del perro");
            Race = teclado.nextLine();
            A1.setRaza(Race);
            System.out.println("Introduce la edad del perro");
            Age = teclado.nextInt();
            A1.setEdad(Age);

            System.out.println("Introduce el nombre del segundo perro");
            Name = teclado.nextLine();
            B2.setNombre(Name);
            System.out.println("Introduce la raza del segundo perro");
            Race = teclado.nextLine();
            B2.setRaza(Race);
            System.out.println("Introduce la edad del segundo perro");
            Age = teclado.nextInt();
            B2.setEdad(Age);


            System.out.println("Informacion de los perros:");
            System.out.println("1:");
            System.out.println("Nombre: " + A1.getNombre());
            System.out.println("Raza: " + A1.getRaza());
            System.out.println("Edad: " + A1.getEdad());

            System.out.println("2:");
            System.out.println("Nombre: " + B2.getNombre());
            System.out.println("Raza: " + B2.getRaza());
            System.out.println("Edad: " + B2.getEdad());


            System.out.println("Indica el que comida que le vas a dar al primer perro");
            Food = teclado.nextLine();
            System.out.println("Indica la cantidad en gramos");
            Grams = teclado.nextDouble();
            A1.Comer(Food, Grams);

            System.out.println("Indica el que comida que le vas a dar al segundo perro");
            Food = teclado.nextLine();
            System.out.println("Indica la cantidad en gramos");
            Grams = teclado.nextDouble();
            B2.Comer(Food, Grams);


            A1.Ladrar();
            B2.Ladrar();
        }catch(InputMismatchException ex){
            System.out.println("Tipo de datos ingresado incorrecto");
        }
    }
}