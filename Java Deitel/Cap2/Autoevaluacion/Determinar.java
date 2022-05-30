import java.util.Scanner;

public class Determinar
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    int a, b, c, d, e;

    System.out.print("Escriba el primer entero: ");
    a = entrada.nextInt();

    System.out.print("Escriba el segundo entero: ");
    b = entrada.nextInt();

    System.out.print("Escriba el tercer entero: ");
    c = entrada.nextInt();

    System.out.print("Escriba el cuarto entero: ");
    d = entrada.nextInt();

    System.out.print("Escriba el quinto entero: ");
    e = entrada.nextInt();

//ENTERO MAYOR

    if (a > b)
     if (a > c)
      if (a > d)
       if (a > e)
        System.out.printf("El entero más grande es: %d%n", a);

    if (b > a)
     if (b > c)
      if (b > d)
       if (b > e)
        System.out.printf("El entero más grande es: %d%n", b);

    if (c > a)
     if (c > b)
      if (c > d)
       if (c > e)
        System.out.printf("El entero más grande es: %d%n", c);

    if (d > a)
     if (d > b)
      if (d > c)
       if (d > e)
        System.out.printf("El entero más grande es: %d%n", d);

    if (e > a)
     if (e > b)
      if (e > c)
       if (e > d)
        System.out.printf("El entero más grande es: %d%n", e);

	if (a == b)
	 if (a > c)
	  if (a > d)
	   if (a > e)
	    System.out.printf("El entero más grande es: %d%n", a); 


	if (a == c)
	 if (a > b)
	  if (a > d)
	   if (a > e)
	    System.out.printf("El entero más grande es: %d%n", a);

	if (a == d)
	 if (a > b)
	  if (a > c)
	   if (a > e)
	    System.out.printf("El entero más grande es: %d%n", a); 


	if (a == e)
	 if (a > b)
	  if (a > c)
	   if (a > d)
	    System.out.printf("El entero más grande es: %d%n", a);

	if (b == c)
	 if (b > a)
	  if (b > d)
	   if (b > e)
	    System.out.printf("El entero más grande es: %d%n", b); 


	if (b == d)
	 if (b > a)
	  if (b > c)
	   if (b > e)
	    System.out.printf("El entero más grande es: %d%n", b);

	if (b == e)
	 if (b > a)
	  if (b > c)
	   if (b > d)
	    System.out.printf("El entero más grande es: %d%n", b); 

	if (c == d)
	 if (c > a)
	  if (c > b)
	   if (c > e)
	    System.out.printf("El entero más grande es: %d%n", c);

	if (c == e)
	 if (c > a)
	  if (c > b)
	   if (c > d)
	    System.out.printf("El entero más grande es: %d%n", c);

	if (d == e)
	 if (d > a)
	  if (d > b)
	   if (d > c)
	    System.out.printf("El entero más grande es: %d%n", d);

    if (a == b)
     if (a == c)
      if (a > d)
       if (a > e)
        System.out.printf("El entero más grande es: %d%n", a);

    if (a == b)
     if (a == d)
      if (a > c)
       if (a > e)
        System.out.printf("El entero más grande es: %d%n", a);

    if (a == b)
     if (a == e)
      if (a > c)
       if (a > d)
        System.out.printf("El entero más grande es: %d%n", a);

    if (a == c)
     if (a == d)
      if (a > b)
       if (a > e)
        System.out.printf("El entero más grande es: %d%n", a);

    if (a == c)
     if (a == e)
      if (a > b)
       if (a > d)
        System.out.printf("El entero más grande es: %d%n", a);

    if (a == d)
     if (a == e)
      if (a > b)
       if (a > c)
        System.out.printf("El entero más grande es: %d%n", a);

    if (b == c)
     if (b == d)
      if (b > a)
       if (b > e)
        System.out.printf("El entero más grande es: %d%n", b);

    if (b == c)
     if (b == e)
      if (b > a)
       if (b > d)
        System.out.printf("El entero más grande es: %d%n", b);

    if (b == d)
     if (b == e)
      if (b > a)
       if (b > c)
        System.out.printf("El entero más grande es: %d%n", b);

    if (c == d)
     if (c == e)
      if (c > a)
       if (c > b)
        System.out.printf("El entero más grande es: %d%n", c);

	if (a == b)
	 if (a == c)
          if (a == d)
           if (a > e)
	    System.out.printf("El entero más grande es: %d%n", a);

	if (a == b)
	 if (a == c)
          if (a == e)
           if (a > d)
	    System.out.printf("El entero más grande es: %d%n", a);

	if (a == b)
	 if (a == d)
          if (a == e)
           if (a > c)
	    System.out.printf("El entero más grande es: %d%n", a);

	if (a == c)
	 if (a == d)
          if (a == e)
           if (a > b)
	    System.out.printf("El entero más grande es: %d%n", a);

	if (b == c)
	 if (b == d)
          if (b == e)
           if (b > a)
	    System.out.printf("El entero más grande es: %d%n", b);

//Entero menor

    if (a < b)
     if (a < c)
      if (a < d)
       if (a < e)
        System.out.printf("El entero menor es: %d%n", a);

    if (b < a)
     if (b < c)
      if (b < d)
       if (b < e)
        System.out.printf("El entero menor es: %d%n", b);

    if (c < a)
     if (c < b)
      if (c < d)
       if (c < e)
        System.out.printf("El entero menor es: %d%n", c);

    if (d < a)
     if (d < b)
      if (d < c)
       if (d < e)
        System.out.printf("El entero menor es: %d%n", d);

    if (e < b)
     if (e < c)
      if (e < d)
       if (e < a)
        System.out.printf("El entero menor es: %d%n", e);

	if (a == b)
	 if (a < c)
	  if (a < d)
	   if (a < e)
	    System.out.printf("El entero menor es: %d%n", a); 


	if (a == c)
	 if (a < b)
	  if (a < d)
	   if (a < e)
	    System.out.printf("El entero menor es: %d%n", a);

	if (a == d)
	 if (a < b)
	  if (a < c)
	   if (a < e)
	    System.out.printf("El entero menor es: %d%n", a); 


	if (a == e)
	 if (a < b)
	  if (a < c)
	   if (a < d)
	    System.out.printf("El entero menor es: %d%n", a);

	if (b == c)
	 if (b < a)
	  if (b < d)
	   if (b < e)
	    System.out.printf("El entero menor es: %d%n", b); 


	if (b == d)
	 if (b < a)
	  if (b < c)
	   if (b < e)
	    System.out.printf("El entero menor es: %d%n", b);

	if (b == e)
	 if (b < a)
	  if (b < c)
	   if (b < d)
	    System.out.printf("El entero menor es: %d%n", b); 

	if (c == d)
	 if (c < a)
	  if (c < b)
	   if (c < e)
	    System.out.printf("El entero menor es: %d%n", c);

	if (c == e)
	 if (c < a)
	  if (c < b)
	   if (c < d)
	    System.out.printf("El entero menor es: %d%n", c);

	if (d == e)
	 if (d < a)
	  if (d < b)
	   if (d < c)
	    System.out.printf("El entero menor es: %d%n", d);

    if (a == b)
     if (a == c)
      if (a < d)
       if (a < e)
        System.out.printf("El entero menor es: %d%n", a);

    if (a == b)
     if (a == d)
      if (a < c)
       if (a < e)
        System.out.printf("El entero menor es: %d%n", a);

    if (a == b)
     if (a == e)
      if (a < c)
       if (a < d)
        System.out.printf("El entero menor es: %d%n", a);

    if (a == c)
     if (a == d)
      if (a < b)
       if (a < e)
        System.out.printf("El entero menor es: %d%n", a);

    if (a == c)
     if (a == e)
      if (a < b)
       if (a < d)
        System.out.printf("El entero menor es: %d%n", a);

    if (a == d)
     if (a == e)
      if (a < b)
       if (a < c)
        System.out.printf("El entero menor es: %d%n", a);

    if (b == c)
     if (b == d)
      if (b < a)
       if (b < e)
        System.out.printf("El entero menor es: %d%n", b);

    if (b == c)
     if (b == e)
      if (b < a)
       if (b < d)
        System.out.printf("El entero menor es: %d%n", b);

    if (b == d)
     if (b == e)
      if (b < a)
       if (b < c)
        System.out.printf("El entero menor es: %d%n", b);

    if (c == d)
     if (c == e)
      if (c < a)
       if (c < b)
        System.out.printf("El entero menor es: %d%n", c);

	if (a == b)
	 if (a == c)
          if (a == d)
           if (a < e)
	    System.out.printf("El entero menor es: %d%n", a);

	if (a == b)
	 if (a == c)
          if (a == e)
           if (a < d)
	    System.out.printf("El entero menor es: %d%n", a);

	if (a == b)
	 if (a == d)
          if (a == e)
           if (a < c)
	    System.out.printf("El entero menor es: %d%n", a);

	if (a == c)
	 if (a == d)
          if (a == e)
           if (a < b)
	    System.out.printf("El entero menor es: %d%n", a);

	if (b == c)
	 if (b == d)
          if (b == e)
           if (b < a)
	    System.out.printf("El entero menor es: %d%n", b);

//Los números son iguales.

	if (a == b)
	 if (a == c)
          if (a == d)
           if (a == e)
	    System.out.printf("Los números son iguales.");
  }
}