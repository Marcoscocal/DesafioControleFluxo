import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.print("Digite o primeiro número:");
        parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo número: ");
        parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            System.out.println("!!! Error !!!");
            System.out.println(e.getMessage());

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");

        }
        int contagem = parametroDois - parametroUm;
        for (int i = parametroDois; i <= parametroDois; i++) {
            System.out.println("Número: " + i);

        }
    }
}