import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String logoTerminal = """

            888888ba  dP  .88888.      888888ba   .d888888  888888ba  dP     dP 
            88    `8b 88 d8'   `8b     88    `8b d8'    88  88    `8b 88   .d8' 
            88     88 88 88     88    a88aaaa8P' 88aaaaa88a 88     88 88aaa8P'  
            88     88 88 88     88     88   `8b. 88     88  88     88 88   `8b. 
            88    .8P 88 Y8.   .8P     88    .88 88     88  88     88 88     88 
            8888888P  dP  `8888P'      88888888P 88     88  dP     dP dP     dP 
            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
            
""";

        //mensagem de booas vindas
        System.out.println(logoTerminal);
        System.out.println("""
                Olá, seja bem-vindo ao banco DIO!
                Vamos criar uma conta para você.
                """);
        
        //solicitar os dados do cliente
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        //exibir sucesso na criação da conta
        System.out.println("\n\n");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco." +
                "\nSua conta " + numeroConta + " da agência " + numeroAgencia +
                " foi criada com sucesso!" +
                "\nSeu saldo inicial é de R$" + saldo + " já disponível para saque.");

    }
}
