import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        int x, y;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese valor para x: ");
        x = leer.nextInt();
        System.out.println("Ingrese valor para y: ");
        y = leer.nextInt();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("SUMA (" + x + "+" + y + ") = " + (x+y));

        System.out.println("RESTA (" + x + "-" + y + ") = " + (x-y));

        System.out.println("MULTIPLICACION (" + x + "*" + y + ") = " + (x*y));

        System.out.println("DIVISION (" + x + "/" + y + ") = " + (x/y));

        System.out.println("MODULO (" + x + "%" + y + ") = " + (x%y));
    }
}
