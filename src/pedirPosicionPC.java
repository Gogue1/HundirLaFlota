public class pedirPosicionPC {
    public static void posPc() {
        System.out.println(primeraPos());
        System.out.println(segunPos());
    }

    public static char primeraPos() {
        int random = (int) (Math.random() * (74 - 65 + 1) + 65);
        return (char) random;
    }
    public static int segunPos(){
        int random = (int) (Math.random() * (8 + 1) - 0);
        return random;
    }

}
