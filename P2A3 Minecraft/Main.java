package pms.lychi;

public class Main {
    public static void main(String[] args) {
        PersonajeMinecraft base1 = new PersonajeMinecraft();
        PersonajeMinecraft base2 = new PersonajeMinecraft("Alex");
        PersonajeMinecraft base3 = new PersonajeMinecraft("Herobrine", 100, 50);

        System.out.println(base1);
        System.out.println(base2);
        System.out.println(base3);
        base3.atacar();
        base3.atacar(15);
        base3.atacar("Creeper", 8);

        System.out.println();
        Guerrero guerrero = new Guerrero("Arturo", 40, 10, "diamante");
        System.out.println(guerrero);
        guerrero.atacar();
        guerrero.atacar(12);
        guerrero.atacar("Zombie", 20);
        guerrero.golpeEspecial();

        System.out.println();
        Constructor constructor = new Constructor("Bob", 25, 5, "ladrillo");
        System.out.println(constructor);
        constructor.atacar();
        constructor.atacar(3);
        constructor.atacar("Arana", 4);
        constructor.construir();
    }
}
