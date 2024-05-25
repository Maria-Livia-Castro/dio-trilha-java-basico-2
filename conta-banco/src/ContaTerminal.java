import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        // Solicita informações ao usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        // Consumir a quebra de linha

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

         // Exibe a mensagem com os dados inseridos
         System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
         System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo);
 
         scanner.close(); // Fecha o scanner
    }
}
