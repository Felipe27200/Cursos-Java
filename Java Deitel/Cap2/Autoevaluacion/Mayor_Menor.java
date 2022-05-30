import java.util.Scanner;

public class Mayor_Menor
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    int numero1, numero2, numero3, suma, promedio,
      producto;

    System.out.print("Ingrese el primer número: ");
    numero1 = entrada.nextInt();

    System.out.print("Ingrese el segundo número: ");
    numero2 = entrada.nextInt();

    System.out.print("Ingrese el tercer número: ");
    numero3 = entrada.nextInt();

    suma = numero1 + numero2 + numero3;

    promedio = (numero1 + numero2 + numero3) / 2;

    producto = numero1 * numero2 * numero3;

    System.out.printf("La suma es: %d%n", suma);

    System.out.printf("El promedio es: %d%n", promedio);

    System.out.printf("El producto es: %d%n", producto);

    if (numero1 > numero2)
     if  (numero1 > numero3)
       System.out.printf("%d es más grande%n", numero1);

    if (numero1 < numero2)
     if  (numero3 < numero2)
       System.out.printf("%d es más grande%n", numero2);

    if (numero1 < numero3)
     if  (numero2 < numero3)
       System.out.printf("%d es más grande%n", numero3);

    if (numero1 == numero2)
    if (numero1 > numero3)
       System.out.printf("%d es más grande%n", numero1);

    if (numero1 == numero3)
    if (numero1 > numero2)
       System.out.printf("%d es más grande%n", numero1);

    if (numero2 == numero3)
     if  (numero2 > numero1)
       System.out.printf("%d es más grande%n", numero2);

    if (numero1 < numero2)
     if  (numero1 < numero3)
       System.out.printf("%d es menor%n", numero1);

    if (numero1 > numero2)
     if  (numero3 > numero2)
       System.out.printf("%d es menor%n", numero2);

    if (numero1 > numero3)
    if (numero2 > numero3)
       System.out.printf("%d es menor%n", numero3);

    if (numero1 == numero2)
     if  (numero1 < numero3)
       System.out.printf("%d es menor%n", numero1);

    if (numero1 == numero3)
      if (numero1 < numero2)
       System.out.printf("%d es menor%n", numero1);

    if (numero2 == numero3)
      if (numero2 < numero1)
       System.out.printf("%d es menor%n", numero2);
  }
}