import java.io.*;
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
  double mayorNota = Double.MIN_VALUE; // Inicializa con el valor mínimo posible
  Alumno alumnoConMayorNota = null;

  for (Alumno alumno : listaAlumnos) {
   if (alumno.getNota() > mayorNota) {
    mayorNota = alumno.getNota();
    alumnoConMayorNota = alumno;
   }
  }

  if (alumnoConMayorNota != null) {
   System.out.println("El alumno con la mayor nota es:");
   System.out.println(alumnoConMayorNota.toString());
  } else {
   System.out.println("No se encontraron alumnos en la lista.");
  }
  for (Alumno alumno : listaAlumnos) {
   System.out.println("Alumno representado en csv ");
   System.out.println(alumno.toCSV());
  }
  controlador c = new controlador();
  c.generarCSVAlumnosAprobados(listaAlumnos);
 }

 public void generarCSVAlumnosAprobados(List<Alumno> alumnos) {
  try (BufferedWriter writer = new BufferedWriter(new FileWriter("alumnos_aprobados.csv"))) {
   writer.write("Nombre,Apellido,DNI,Nota\n");

   // Iterar a través de los alumnos y escribir solo aprobados en el archivo
   for (Alumno alumno : alumnos) {
    if (alumno.getNota() >= 5.0) { // Cambia 5.0 por la nota mínima para aprobar
     writer.write(alumno.toCSV() + "\n");
    }
   }

   System.out.println("Archivo CSV de alumnos aprobados creado con éxito.");
  } catch (IOException e) {
   System.err.println("Error al escribir el archivo CSV de alumnos aprobados: " + e.getMessage());
  }
 }
}
