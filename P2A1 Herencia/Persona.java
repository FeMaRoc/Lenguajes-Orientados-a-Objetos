//Nombre: Felipe Marin Rocco 
//ID: 00609549
//Carrera: TI


public class Persona{ 
    public String nombre;
    public String apellidos;
    private String numIdentificacion;
    private String estadoCivil;
    
    public Persona(){
        this.nombre = "";
        this.apellidos = "";
        this.numIdentificacion = "";
        this.estadoCivil = "";
    }
    
    public String getNumIdentificacion(){
        return numIdentificacion;
    }
    
    public void setNumIdentificacion(String n){
        this.numIdentificacion = n;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public void setEstadoCivil(String nuevoEstadoCivil){
        this.estadoCivil = nuevoEstadoCivil;
    }
    
    @Override
    public String toString(){
        return "Nombre Completo: " + nombre + " " + apellidos + "\nNumero de Identificacion: " + numIdentificacion + "\nEstado Civil: " + estadoCivil;
    }
    
}

class Empleados extends Persona {
    public int anioDeIncorporacion;
    private String numDespacho;
    
    public Empleados(){
        super();
        this.anioDeIncorporacion = 0;
        this.numDespacho = "";
    }
    
    public String getNumDespacho(){
        return numDespacho;
    }
    
    public void setNumDespacho(String numDespacho){
        this.numDespacho = numDespacho;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nAño de Incorporacion: " + anioDeIncorporacion + "\nNumero de Despacho: " + numDespacho;
    }
}

class Estudiantes extends Persona {
    public String cursoMatricula;
    
    public Estudiantes(){
        super();
        this.cursoMatricula = "";
    }
    
    public void setCursoMatricula(String cursoMatricula){
        this.cursoMatricula = cursoMatricula;
    }
    
    @Override
    public String toString(){
        return "Info del Estudiante:\n" + super.toString() + "\nCurso Matriculado: " + cursoMatricula;
    }
}

class Profesores extends Empleados{
    public String areaPerteneciente;
    
    public Profesores(){
        super();
        this.areaPerteneciente = "";
    }
    
    public void setAreaPerteneciente(String areaPerteneciente){
        this.areaPerteneciente = areaPerteneciente;
    }
    
    @Override
    public String toString(){
        return "Info del Profesor:\n" + super.toString() + "\nArea Perteneciente: " + areaPerteneciente;
    }
}

class PersonalDeServicio extends Empleados{
    private String seccionAsignada;
    
    public PersonalDeServicio(){
        super();
        this.seccionAsignada = "";
    }
    
    public String getSeccionAsignada(){
        return seccionAsignada;
    }
    
    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }
    
    @Override
    public String toString(){
        return "Info del Personal de Servicio:\n" + super.toString() + "\nSeccion Asignada: " + seccionAsignada;
    }
}

class CentroDocente {
    private Estudiantes[] listaEstudiantes;
    private Profesores[] listaProfesores;
    private PersonalDeServicio[] listaPersonalServicio;

    private int contadorEstudiantes;
    private int contadorProfesores;
    private int contadorPersonalServicio;

    public CentroDocente() {
        this.listaEstudiantes = new Estudiantes[100];
        this.listaProfesores = new Profesores[100];
        this.listaPersonalServicio = new PersonalDeServicio[100];

        this.contadorEstudiantes = 0;
        this.contadorProfesores = 0;
        this.contadorPersonalServicio = 0;
    }

    public void darDeAlta(Estudiantes estudiante) {
        if (contadorEstudiantes < listaEstudiantes.length) {
            listaEstudiantes[contadorEstudiantes] = estudiante;
            contadorEstudiantes++;
        }
    }

    public void darDeAlta(Profesores profesor) {
        if (contadorProfesores < listaProfesores.length) {
            listaProfesores[contadorProfesores] = profesor;
            contadorProfesores++;
        }
    }

    public void darDeAlta(PersonalDeServicio personal) {
        if (contadorPersonalServicio < listaPersonalServicio.length) {
            listaPersonalServicio[contadorPersonalServicio] = personal;
            contadorPersonalServicio++;
        }
    }

    public boolean darDeBaja(String dni) {
        for (int i = 0; i < contadorEstudiantes; i++) {
            if (listaEstudiantes[i].getNumIdentificacion().equals(dni)) {
                for (int j = i; j < contadorEstudiantes - 1; j++) {
                    listaEstudiantes[j] = listaEstudiantes[j + 1];
                }
                listaEstudiantes[contadorEstudiantes - 1] = null;
                contadorEstudiantes--;
                return true;
            }
        }

        for (int i = 0; i < contadorProfesores; i++) {
            if (listaProfesores[i].getNumIdentificacion().equals(dni)) {
                for (int j = i; j < contadorProfesores - 1; j++) {
                    listaProfesores[j] = listaProfesores[j + 1];
                }
                listaProfesores[contadorProfesores - 1] = null;
                contadorProfesores--;
                return true;
            }
        }

        for (int i = 0; i < contadorPersonalServicio; i++) {
            if (listaPersonalServicio[i].getNumIdentificacion().equals(dni)) {
                for (int j = i; j < contadorPersonalServicio - 1; j++) {
                    listaPersonalServicio[j] = listaPersonalServicio[j + 1];
                }
                listaPersonalServicio[contadorPersonalServicio - 1] = null;
                contadorPersonalServicio--;
                return true;
            }
        }

        return false; 
    }

    public void imprimirTodo() {
        System.out.println("Info del Centro Docente:");

        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        for (int i = 0; i < contadorEstudiantes; i++) {
            System.out.println(listaEstudiantes[i]);
            System.out.println("--------------------");
        }

        System.out.println("\n--- LISTA DE PROFESORES ---");
        for (int i = 0; i < contadorProfesores; i++) {
            System.out.println(listaProfesores[i]);
            System.out.println("--------------------");
        }

        System.out.println("\n--- LISTA DE PERSONAL DE SERVICIO ---");
        for (int i = 0; i < contadorPersonalServicio; i++) {
            System.out.println(listaPersonalServicio[i]);
            System.out.println("--------------------");
        }
    }
}