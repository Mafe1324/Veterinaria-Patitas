import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais", 3, "Criollo"));
        animales.add(new Gato("Michi", 2, true));
        animales.add(new Vaca("Lola", 4));

        for (Animal animal : animales) {
            animal.mostrarInformacion();
            animal.hacerSonido();
        }
    }
}
