import java.util.Scanner;
public class prova {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("informe o seu nome.");
    String nome = sc.nextLine();

    System.out.println("Informe o seu cargo.");
    String cargo = sc.nextLine();

    System.out.println("Qual o seu nivel de acesso?");
    int acesso = sc.nextInt();

    System.out.println("Qual o nivel de sigilo que deseja acessar? ");
    int sigilo = sc.nextInt();
 
    int soma = 0;
    
    
    
    System.out.println( "\n" + nome);
    System.out.println(cargo );

    if (acesso >= sigilo) {System.out.println("nivel de acesso " + acesso + " nivel de sigilo " + sigilo);
    }else if (acesso < 0 && acesso >10 && sigilo <0 && sigilo <10 ) {System.out.println("ERRO: Nível de acesso inválido");
    }else{System.out.println("Alerta: Tentativa de acesso indevida detectada!");
    }

    if (acesso >= sigilo) {System.out.println("Acesso permitido");
    }else{ System.out.println("Acesso negado");
    }

   


    
    

    sc.close();
}
}

