import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
        System.out.println("|                Bienvenido              |");
        System.out.println("|                    a                   |");
        System.out.println("|             HUNDIR LA FLOTA            |");
        System.out.println("|----------------------------------------|");

        System.out.println();

        System.out.println("1 - EMPEZAR EL JUEGO");
        System.out.println("2 - SALIR DEL JUEGO");

        switch (sc.nextInt()) {
            case 1:
                Menu.Menu();
            case 2:
                break;
        }
    }
}