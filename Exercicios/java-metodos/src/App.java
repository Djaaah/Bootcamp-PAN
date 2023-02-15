public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = { 5, 10, 20, 89, 98 };
        int[][] numeros2 = { { 5, 10, 20, 89, 98 }, { 5, 10, 20, 22 } };
        String[] palavras = { "Jailton", "Júnior", "Lohayne", "Adriana", "Selma" };

        // Metodos<int[]> metodos = new Metodos<int[]>();

        lerArray(numeros);
    }

    public static void lerArray(int[] arr) {
        System.out.print("Números: ");
        for (int valores : arr) {
            System.out.print(valores + " ");
        }
    }
}
