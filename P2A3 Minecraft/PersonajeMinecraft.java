package pms.lychi;

public class PersonajeMinecraft {
    private String nombre;
    private int vida;
    private int nivel;

    public PersonajeMinecraft() {
        this.nombre = "Steve";
        this.vida = 20;
        this.nivel = 1;
    }

    public PersonajeMinecraft(String nombre) {
        this.nombre = nombre;
        this.vida = 20;
        this.nivel = 1;
    }

    public PersonajeMinecraft(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Personaje: " + nombre + " \nVida: " + vida + "\nNivel: " + nivel;
    }

    public void atacar() {
        System.out.println(nombre + " realiza un ataque basico");
    }

    public void atacar(int danio) {
        System.out.println(nombre + " realiza un ataque causando " + danio + " de dano");
    }

    public void atacar(String objetivo, int danio) {
        System.out.println(nombre + " ataca a " + objetivo + " y le causa " + danio + " de dano");
    }
}
