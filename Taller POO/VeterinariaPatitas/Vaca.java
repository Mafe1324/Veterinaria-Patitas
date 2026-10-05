public class Vaca extends Animal {
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Muuuu!");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre() + " | Edad: " + getEdad() + " | Tipo: Vaca");
    }
}
