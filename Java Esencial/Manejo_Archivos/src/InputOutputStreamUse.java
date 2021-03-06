// fig.1.3

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InputOutputStreamUse {
	public static void main(String[] args) {
		// variables que almacenan el path del archivo
		Path inputPath = Paths.get("C:\\Users\\felip\\Escritorio\\Ejemplo.txt");
		Path outputPath = Paths.get("C:\\Users\\felip\\Escritorio\\Ejemplo2.txt");
						
		try {
			InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);
			
			Files.newOutputStream(outputPath, StandardOpenOption.CREATE);
			
			OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);
			
			int i;
			byte[] data = new byte[1024];
			
			// lee el archivo
			while ((i = inputStream.read()) != -1)
			{
				System.out.print((char) i);
			}
			
			// Copia el contenido de Ejemplo en Ejemplo2
			while ((inputStream.read(data)) != -1)
			{
				outputStream.write(data);
			}
			
			// Cierre de los Streams
			inputStream.close();
			outputStream.close();
			
		} catch (IOException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
	}
}
