import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class controlador {
public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new FileReader("src/datos.csv"));
 String line;
 List<Alumno> listaAlumnos = new ArrayList<>(); // Creamos una lista para almacenar los objetos Alumno

 while ((line = br.readLine()) != null) {
String[] datos = line.split(",");
 Alumno a = new Alumno(datos[0], datos[1], datos[2], datos[3]);
listaAlumnos.add(a); // Agregamos el objeto Alumno a la lista
}


 for (Alumno alumno : listaAlumnos) {
 System.out.println(alumno.toString());

 }
 }
}
