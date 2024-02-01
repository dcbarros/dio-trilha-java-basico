import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Por favor, digite o número da Conta ! ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Por favor, digite o número da Agência ! ");
        String numeroAgencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do Cliente ! ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo da Conta ! ");
        double saldo = scanner.nextDouble();
        
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, numeroAgencia, numeroConta, saldo);
        
        scanner.close();
    }
}
