import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double altura = sc.nextDouble();
    double massa = sc.nextDouble();
    double imc = massa / (altura * altura);
    System.out.printf("O seu IMC é de %f kg/m² %n" , imc);
    if( imc < 16.9 ); {
    System.out.println("Você está muito abaixo do peso. ");
    }
    if( 17 > imc & imc < 18.4); {
    System.out.println("Você está abaixo do peso.");
    }
    if( 18.5 > imc & imc < 24.9); {
    System.out.println("Você está com peso normal");
    }
    if( 25 > imc & imc < 29.9 ); {
      System.out.println("Você está acima do peso.");
      }
    if( 30 > imc & imc < 34.9); {
      System.out.println("Você apresenta Obesidade Grau I");
    }
    if( 35 > imc & imc < 39.9); {
      System.out.println("Você apresenta Obesidade Grau I");
    }
    if ( imc > 40 & imc > 40); {
      System.out.println("Você apresenta Obesidade Grau III");
    }
    
      
    sc.close();
  }
}