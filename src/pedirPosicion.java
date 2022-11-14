public class pedirPosicion {
    public static String pidePos() {
        String pos = "";
        for (int i = 1; i <= 5; i++) {
            pos = Tools.getString("Introduzca la posición del " + i + " barco: ");
            pos.toUpperCase();
            while (!posBarco(pos) || !syntBarcos(pos)) {
                System.out.println("Debes introducir dos carácteres [a1]");
                pos = Tools.getString("Introduzca de nuevo la posición del " + i + " barco: ");
            }
        }
        return pos;
    }

    public static boolean posBarco(String pos) {
        if (pos.length() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean syntBarcos(String pos) {
        boolean opt = false;
        char letter = 'A';
        do {
            if (pos.toUpperCase().charAt(0) != letter && pos.charAt(1) > 9) {
                opt = false;
                letter += 1;
            } else {
                opt = true;
            }
        } while (!opt && letter != 'J');
        return opt;
    }
}
