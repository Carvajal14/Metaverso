import java.util.ArrayList;

class Metaverso {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<ObjetoVirtual> objetosVirtuales = new ArrayList<>();
    private ArrayList<Ubicacion> ubicaciones = new ArrayList<>();
    private ArrayList<Actividad> actividades = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarObjetoVirtual(ObjetoVirtual objeto) {
        objetosVirtuales.add(objeto);
    }

    public void agregarUbicacion(Ubicacion ubicacion) {
        ubicaciones.add(ubicacion);
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }
}
