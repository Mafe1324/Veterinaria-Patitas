public class Perro extends Animal {
    private final String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre() + " | Edad: " + getEdad() + " | Raza: " + raza);
    }
}
