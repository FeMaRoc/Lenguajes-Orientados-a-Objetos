package pms.lychi;

public class Guerrero extends PersonajeMinecraft {
    private String tipoEspada;

    public Guerrero(String nombre, int vida, int nivel, String tipoEspada) {
        super(nombre, vida, nivel);
        this.tipoEspada = tipoEspada;
    }

    public void golpeEspecial() {
        System.out.println("Realiza un golpe especial con su espada de " + tipoEspada);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de espada: " + tipoEspada;
    }
}
