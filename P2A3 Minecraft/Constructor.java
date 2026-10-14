package pms.lychi;

public class Constructor extends PersonajeMinecraft {
    private String materialFavorito;

    public Constructor(String nombre, int vida, int nivel, String materialFavorito) {
        super(nombre, vida, nivel);
        this.materialFavorito = materialFavorito;
    }

    public void construir() {
        System.out.println("Esta construyendo una estructura utilizando " + materialFavorito);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMaterial favorito: " + materialFavorito;
    }
}
