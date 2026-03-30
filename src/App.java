import net.salesianos.dnd.Personaje;
import net.salesianos.dnd.guerrero.Guerrero;
import net.salesianos.dnd.mago.Mago;
public class App {
    public static void main(String[] args) {
        Personaje viajero = new Personaje("Eldrin", 3);
        viajero.entrenar(4);
        viajero.gastarEnergia(30);
        viajero.mostrarInfo();
        Personaje.mostarTotalPersonajes();

        Guerrero thorak = new Guerrero("Thorak", 5, "Hacha doble");
        thorak.ataquePesado();
        thorak.descansar(10);
        thorak.mostrarInfo();
        Personaje.mostarTotalPersonajes();
    }
}
