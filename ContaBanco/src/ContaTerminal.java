import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Por favor, digite o numero da sua conta: ");
                int numeroConta = scanner.nextInt();

                System.out.println("Pro favor, digite o numero de sua agencia: ");
                String numeroAgencia = scanner.next();

                System.out.println("Por favor, digite seu nome completo: ");
                String nomeClinete = scanner.next();

                System.out.println("Digite valor saque: ");
                double valorSaque = scanner.nextDouble();

                System.out.println("Olá " + nomeClinete + ", obrigado por criar uma conta em nosso banco, sua agência é: "
                        + numeroAgencia + " número: " + numeroConta + " e o valor: " + valorSaque + " já está disponível para saque.");
                
                scanner.close();

            }
        }
