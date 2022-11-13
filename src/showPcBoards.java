public class showPcBoards {
    public static String[][] pcBoard = new String[11][11];//Declaramos el tablero del PC
    public static String[][] shootPcBoard = new String[11][11];//Declaramos el tablero de disparos del PC
    public static char[] userLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',};

    public static void pcBoards() {
        System.out.println("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|           |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
        System.out.println("|         | Tablero |         |           |         | Disparos |        |");
        System.out.println("|         |    PC   |         |           |         |    PC    |        |");
        System.out.println("|_____________________________|           |_____________________________|");
        System.out.println();
        showUserBoards.Numeros();
        Rellenar();
        showUserBoards.Numeros();
    }

    public static void Rellenar() {
        for (int i = 0; i < pcBoard.length - 1; i++) {
            System.out.print(userLetters[i] + " ");
            for (int j = 1; j < pcBoard[0].length - 1; j++) {
                pcBoard[i][j] = " ~ ";
                System.out.print(pcBoard[i][j]);
            }
            System.out.print(" " + userLetters[i] + " ");

            System.out.print("          ");

            System.out.print(userLetters[i] + " ");
            for (int k = 0; k < shootPcBoard[0].length - 2; k++) {
                shootPcBoard[i][k] = " ~ ";
                System.out.print(shootPcBoard[i][k]);
            }
            System.out.print(" " + userLetters[i] + " ");
            System.out.println();
        }
    }
}
