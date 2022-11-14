public class pedirPosicion {
    public static String pidePos() {
        String pos = "";
        for (int i = 1; i <= 5; i++) {
            pos = Tools.getString("Introduzca la posición del " + i + " barco: ");
            pos.toUpperCase();
            while (!posBarco(pos) || !syntBarcos(pos)) {
                System.out.println("Debes introducir dos carácteres [a1]");
                System.out.println();
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
        if (!primLetra(pos) && !segLetra(pos)) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean primLetra(String pos) {
        boolean primeraLetra;
        char letter = 'A';
        do {
            if (pos.toUpperCase().charAt(0) != letter) {
                primeraLetra = false;
                letter += 1;
            } else {
                primeraLetra = true;
            }
        } while (!primeraLetra && letter != 'J');

        return primeraLetra;
    }

    private static boolean segLetra(String pos) {
        boolean segundaLetra;
        int secondNum;
        int num = 0;
        do {
            if (Integer.parseInt(String.valueOf(pos.charAt(1))) != num) {
                segundaLetra = false;
                num++;
            } else {
                segundaLetra = true;
            }
        } while (!segundaLetra && num != 10);
        return segundaLetra;
    }
}


//Para saber la posicion de el primer carácter debes restarlo por 'A'(char) y para convertir el segundo carácter en un INT debes restarlo por 0