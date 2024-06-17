import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.print("> Parâmetro Um: ");
        int parametroUm = terminal.nextInt();
        System.out.print("> Parâmetro Dois: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        System.out.printf("> Contagem: %d%n%n", contagem);
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i + ") imprimindo o número " + (parametroUm+i));
        }
    }
}