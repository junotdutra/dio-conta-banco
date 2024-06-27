import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Integer numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência!");
        numero = scan.nextInt();
        System.out.println("Digite o número da agência!");
        agencia = scan.next();
        System.out.println("Digite seu nome!");
        nomeCliente = scan.next();
        if(scan.hasNext()){
        nomeCliente = nomeCliente + " "+ scan.next();
        }
        System.out.println("Digite o saldo!");
        saldo = scan.nextDouble();

        scan.close();
        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
