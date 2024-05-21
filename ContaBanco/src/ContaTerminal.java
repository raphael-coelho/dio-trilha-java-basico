import java.util.Scanner;
public class ContaTerminal {
 public static void main(String[] args) {
    //informações que vão ser respondidas no terminal
    Scanner sc = new Scanner( System.in);
    String nome;
    String sobrenome;
    int agencia;
    int numero;
    double saldo = 8500.70;
    String resultado; 
    String confirma;
    
    //informação introdutória 
    System.out.println("Olá, Seja muito bem vindo!");
    System.out.println("__________________________");
    
    //resposta do usuario 1
    System.out.println("Digite seu nome: ");
    nome = sc.nextLine();
    System.out.println("Agora seu sobrenome: ");
    sobrenome = sc.nextLine();
    System.out.println("Então seu nome é " + nome.concat(sobrenome));
    System.out.println("confirma?");
    confirma = sc.next("Sim");

    //resposta do usuario 2 
    System.out.println("Digite o número da sua agência (so numeros)");
    agencia = sc.nextInt();
    System.out.println("Digite o número do seu cartão");
    numero = sc.nextInt();
    System.out.println("___ Armazenado com sucesso!!___");
    System.out.println("___Obrigado por usar nossos serviços, sua conta foi criada em nosso banco "+ nome);
   
    //informação do usuario
    System.out.println("Abaixo suas informações coletadas pelo nosso sistema: ");
    System.out.println("Nome Completo: ".concat(nome).concat(" ").concat(sobrenome));
    System.out.println("Agencia: "+ agencia);
    System.out.println("Numero do cartão: "+ numero);
    System.out.println("________________________");

    //saldo
    System.out.println("Gostaria de verificar seu saldo disponível?");
    resultado = sc.next();
    char resposta = resultado.toLowerCase().charAt(0);
    if(resposta =='s'){

        System.out.println("________________________");
        System.out.println("Saldo disponível: " + saldo +"$");
        System.out.println("Posso ajudar em algo mais? ");
    } 
    else if (resposta == 'n'){
        System.err.println("__________________");
    }
    

 }
    

}