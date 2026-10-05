public class Gato extends Animal {
    private final boolean esDeInterior;

    public Gato(String nombre, int edad, boolean esDeInterior) {
        super(nombre, edad);
        this.esDeInterior = esDeInterior;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre() + " | Edad: " + getEdad() + " | Interior: " + (esDeInterior ? "sí" : "no"));
    }
}
