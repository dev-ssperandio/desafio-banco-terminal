import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: 
        //Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe scanner os valores digitados no terminal
        //exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá, digite seu primeiro nome, pressione a tecla 'Enter' e na segunda linha digite o último nome: ");
        String nomeCliente = scanner.next().concat(" ").concat(scanner.next());

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da conta: ");
        String numero = scanner.next();

        System.out.print("Por favor, digite o saldo: \nR$ ");
        double saldo = Double.parseDouble(scanner.next());

        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ")+numero+" e seu saldo de R$ "+saldo+" já está disponível para saque.");
    }
}
