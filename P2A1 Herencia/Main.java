public class Main {
    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes();
        estudiante1.nombre = "Carlos";
        estudiante1.apellidos = "Gomez Perez";
        estudiante1.setNumIdentificacion("11111111A");
        estudiante1.setEstadoCivil("Soltero");
        estudiante1.setCursoMatricula("1º TI");

        Profesores profesor1 = new Profesores();
        profesor1.nombre = "Ana";
        profesor1.apellidos = "Lopez Martinez";
        profesor1.setNumIdentificacion("22222222B");
        profesor1.setEstadoCivil("Casada");
        profesor1.anioDeIncorporacion = 2015;
        profesor1.setNumDespacho("D-101");
        profesor1.setAreaPerteneciente("Matemáticas");

        PersonalDeServicio personal1 = new PersonalDeServicio();
        personal1.nombre = "Luis";
        personal1.apellidos = "Hernandez Ruiz";
        personal1.setNumIdentificacion("33333333C");
        personal1.setEstadoCivil("Soltero");
        personal1.anioDeIncorporacion = 2018;
        personal1.setNumDespacho("D-002");
        personal1.setSeccionAsignada("Biblioteca");

        estudiante1.setEstadoCivil("Casado");
        estudiante1.setCursoMatricula("2º TI");

        profesor1.setNumDespacho("D-204");
        profesor1.setAreaPerteneciente("Lenguajes");

        personal1.setSeccionAsignada("Decanato");

        CentroDocente facultad = new CentroDocente();
        facultad.darDeAlta(estudiante1);
        facultad.darDeAlta(profesor1);
        facultad.darDeAlta(personal1);

        System.out.println("=== ESTADO INICIAL EN EL CENTRO DOCENTE ===");
        facultad.imprimirTodo();

        System.out.println("\n--- Dando de baja al estudiante con ID 11111111A ---");
        facultad.darDeBaja("11111111A");

        System.out.println("\n=== ESTADO TRAS LA BAJA ===");
        facultad.imprimirTodo();
    }
}