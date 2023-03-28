import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaquinaCafe deposito = new MaquinaCafe();

        Scanner lector = new Scanner(System.in);
        int repetir;

        do {
            System.out.println(" - - - - - - - - - - - - - - - - ");
            System.out.println("| Cafetera Huroncito de Xie Lian |");
            System.out.println(" - - - - - - - - - - - - - - - - ");
            System.out.println("Introduzca el numero correspondiente al sabor de cafe que se desea tomar?");
            System.out.println("1. Americano");
            System.out.println("2. Expreso");
            System.out.println("3. Capuchino");
            int numero = lector.nextInt();

            // establecemos parametss numero mayor a 1 y mnor a 3
            if (numero == 1) {
                System.out.println("Americano");
                deposito.americano();
            }
            if (numero == 2) {
                System.out.println("Expreso");
                deposito.expreso();
            }
            if (numero == 3) {
                System.out.println("Capuchino");
                deposito.capuchino();
            }
            deposito.estado();

            System.out.println("\nPara repetir presione 1");
            System.out.println("Para terminar presione 2");
            repetir = lector.nextInt();
        } //cuando repetir es diferente de uno
        while (!(repetir != 1));
    }
}