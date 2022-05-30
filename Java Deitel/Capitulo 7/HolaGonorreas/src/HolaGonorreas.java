import java.util.Scanner;

public class HolaGonorreas 
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Escribe la palaba: ");
    String palabra = entrada.nextLine();
		
    System.out.println(palabra);
  }  
}
