public class CalculoPorcentagem{
  public static void main(String args[]){
    double valor = 250.00; // valor original
    double percentual = 5.0 / 100.0; 
    double valor_final =(percentual * valor);
    
    double percentual2 = 50.0 / 100.0; 
    double valor_final2 =(percentual2 * valor);

	double percentual3 = 150.0 / 100.0; 
    double valor_final3 =(percentual3 * valor);
    
    System.out.println("O valor de 5% é: " +
      valor_final);   
    System.out.println("O valor de 50% é: " +
      valor_final2);   
    System.out.println("O valor de 150% é: " +
      valor_final3);   


    System.exit(0);
  }
} 
