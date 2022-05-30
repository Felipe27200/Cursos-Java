public class PruebaPerfilMedico
{
  public static void main(String[] args)
  {
    PerfilMedico perfilMedico = new PerfilMedico("Felipe", "Zea", "M", 27,
      07, 2000, 175, 54);

    System.out.printf("Nombre: %s%nApellido: %s%n", perfilMedico.obtenerNombre(),
    perfilMedico.obtenerApellido());

    System.out.printf("Sexo: %s%n", perfilMedico.obtenerSexo());

    perfilMedico.mostrarFecha();

    System.out.printf("Edad: %d%n", perfilMedico.obtenerEdad());

    System.out.printf("Altura: %.2f cm%n", perfilMedico.obtenerAltura());

    System.out.printf("Peso: %.2f kg%n", perfilMedico.obtenerPeso());

    System.out.printf("Frecuencia cardiaca en reposo: %.2f%n", 
    perfilMedico.frecuenciaReposo());

    System.out.printf("Frecuencia cardiaca Máxima: %d%n%n",
      perfilMedico.frecuenciaCardiacaM());

    System.out.printf("BMI: %.2f%n%n", perfilMedico.bmi());

    System.out.printf("%s%n%s%n%s%n%s%n", "VALORES DE IMC",
      "Bajo peso: menos de 18.5", "Normal: 18.5 y 24.9", "Sobrepeso: entre 25 y 29.9",
      "Obeso: 30 o mas");
  }
}