public class Main {
    public static void main(String[] args) {
        Metaverso metaverso = new Metaverso();

        Ubicacion plazaCentral = new Ubicacion(" Plaza Central ", " El corazón del metaverso ");
        Ubicacion parque = new Ubicacion(" Parque ", " Un lugar tranquilo para relajarse ");

        metaverso.agregarUbicacion(plazaCentral);
        metaverso.agregarUbicacion(parque);

        Usuario usuario1 = new Usuario(" Laura Camila ", 1);
        Usuario usuario2 = new Usuario(" Santiago ", 2);

        metaverso.agregarUsuario(usuario1);
        metaverso.agregarUsuario(usuario2);

        ObjetoVirtual espada = new ObjetoVirtual(" Espada ", " Una espada poderosa ", usuario1, 10.0);
        ObjetoVirtual pocion = new ObjetoVirtual(" Poción ", " Restaura la salud ", usuario2, 5.0);

        metaverso.agregarObjetoVirtual(espada);
        metaverso.agregarObjetoVirtual(pocion);

        Actividad cazaMonstruos = new Actividad(" Caza de Monstruos ", " Derrota monstruos en el parque ", parque, "2:00");

        metaverso.agregarActividad(cazaMonstruos);

        usuario1.unirseActividad(cazaMonstruos);
        usuario2.unirseActividad(cazaMonstruos);
        espada.moverAUbicacion(parque);
        espada.cambiarPropietario(usuario2);

        System.out.println(usuario1.getNombre() + " está en el " + usuario1.getUbicacionActual().getNombre());
        System.out.println(usuario2.getNombre() + " tiene en su inventario: " + usuario2.getInventario().size() + " objetos");
        System.out.println(usuario1.getNombre() + " se unió a la actividad: " + cazaMonstruos.getNombre());
        System.out.println(usuario2.getNombre() + " también se unió a la actividad: " + cazaMonstruos.getNombre());
    }
}
