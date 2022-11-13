public class showUserBoards {
    public static String[][] userBoard = new String[11][11];//Declaramos el tablero del usuario
    public static String[][] shootBoard = new String[11][11];//Declaramos el tablero de disparos del usuario
    public static char[] userLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',};
    // Este método muestra los dos tableros del usuario
    public static void userBoards() {
        System.out.println("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|           |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
        System.out.println("|         | Tablero |         |           |         | Disparos |        |");
        System.out.println("|         | Usuario |         |           |         |  Usuario |        |");
        System.out.println("|_____________________________|           |_____________________________|");
        System.out.println();
        Numeros();
        Rellenar();
        Numeros();
    }
    private static void Rellenar(){
        //Mostramos los dos tableros del usuario
        for (int i = 0; i < userBoard.length - 1; i++) {
            System.out.print(userLetters[i] + " ");
            for (int j = 1; j < userBoard[0].length - 1; j++) {
                userBoard[i][j] = " ~ "; //Rellenamos las arrays del tablero
                System.out.print(userBoard[i][j]);
            }
            System.out.print(" " + userLetters[i] + " "); //Añadimos las letras de nuevo

            System.out.print("          "); //Añadimos el espacio entre tableros

            //Dibujamos el tablero de disparos
            System.out.print(userLetters[i] + " ");
            for (int k = 0; k < shootBoard[0].length - 2; k++) {
                shootBoard[i][k] = " ~ ";
                System.out.print(shootBoard[i][k]);
            }
            System.out.print(" " + userLetters[i] + " ");
            System.out.println();
        }
    }
    public static void Numeros(){
        System.out.print("  ");
        for (int letters = 1; letters < 2; letters++) {
            for (int k = 0; k < userBoard.length - 2; k++) {
                System.out.print(" " + k + " ");
            }
            System.out.print("               ");
            for (int k = 0; k < userBoard.length - 2; k++) {

                System.out.print(" " + k + " ");
            }
        }
        System.out.println();
    }
}