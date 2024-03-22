//Animal
package animaal;

public class Main {

    public static void main(String[] args) {

        AnimalTerrestre animal = new AnimalTerrestre();
        animal.getTotalEspecies();

        Zorro zorro = new Zorro();
        zorro.getTotalEspecies();
    }
}

//Animal terrestre y Zorro

package animaal;

public class Animaal {

class AnimalTerrestre {
    
    String getNombre() {
        return "Animales terrestres";
    }

    void getTotalEspecies() {
        System.out.println("Los " + getNombre() + " tienen n especies");
    }
}

class Zorro extends AnimalTerrestre {
    int n = 50000; // Definimos el valor de n para la clase Zorro

    @Override
    String getNombre() {
        return "Zorro";
    }

    @Override
    void getTotalEspecies() {
        super.getTotalEspecies(); // Llamada al método de la superclase
        System.out.println("Los " + getNombre() + ", como el " + getNombre() + ", tienen " + n + " especies");
        }
    }
}
    
