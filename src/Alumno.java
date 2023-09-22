public class Alumno {
    String nombreApellido;
    int edad;


    String nombreCiclo;
    Double nota;
    Alumno(){
        this.nombreApellido=nombreApellido;
        this.edad = edad;
        this.nombreCiclo=nombreCiclo;
        this.nota=nota;



    }

    public Alumno(String dato, String dato1, String dato2) {

    }

    public Alumno(String dato, String dato1, String dato2, String dato3) {
         nombreApellido = dato;
         edad= Integer.parseInt(dato1);
         nombreCiclo = dato2;
         nota = Double.parseDouble(dato3);
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreApellido='" + nombreApellido + '\'' +
                ", edad=" + edad +
                ", nombreCiclo='" + nombreCiclo + '\'' +
                ", nota=" + nota +
                '}';
    }
}
