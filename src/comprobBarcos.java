public class comprobBarcos {
    public static void tamanio() {
        do {
            System.out.println("Debes Introducir dos valors Ejemplo [A1]");
            Tools.getString("Introduzca la posición en la que quiere colocar los barcos: ");
        } while (colocarBarcos.pedirPosicion().length() > 2 || colocarBarcos.pedirPosicion().length() <= 0 || colocarBarcos.pedirPosicion().length() == 1);
    }

    public static boolean comprobarTamanio() {
        String pos = colocarBarcos.pedirPosicion();
        boolean isTrue = false;
        pos.toUpperCase();
        for (int i = 0; i < colocarBarcos.pedirPosicion().length(); i++) {
            if (pos.charAt(i) != Tools.recorrerAZ()) {
                System.out.println("Debes introducir la posición con el formato [a1]");
                isTrue = false;
            } else {
                isTrue = true;
            }
        }
        return isTrue;
    }
}
