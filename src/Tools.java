import java.util.Scanner;

public class Tools {
    public static int getInt(String texto) {
        Scanner sc = new Scanner(System.in);

        System.out.println(texto);
        while (!sc.hasNextInt() && sc.nextInt() > 0 && sc.nextInt() < 5) {
            System.out.println("Introduzca un numero:");
            sc.next();
        }
        return sc.nextInt();
    }

    public static String getString(String texto) {
        Scanner sc = new Scanner(System.in);

        System.out.println(texto);
        while (!sc.hasNextLine()) {
            System.out.println("Introduzca la posición en la que quiere colocar los barcos: ");
            sc.next();
        }
        return sc.nextLine();
    }

    public static void sleep(int milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static char recorrerAZ() {
        char letter = 'A';
        for (int i = 0; i < 26; i++) {
            letter += 1;
        }
        return letter;
    }

    public static void screenCleaner() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
