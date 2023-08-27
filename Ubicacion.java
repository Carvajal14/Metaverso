import java.util.ArrayList;

class Ubicacion {
    private String nombre;
    private String descripcion;
    private ArrayList<Usuario> usuariosEnUbicacion = new ArrayList<>();
    private ArrayList<ObjetoVirtual> objetosEnUbicacion = new ArrayList<>();

    public Ubicacion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void agregarUsuario(Usuario usuario) {
        usuariosEnUbicacion.add(usuario);
    }

    public void agregarObjeto(ObjetoVirtual objeto) {
        objetosEnUbicacion.add(objeto);
    }

    public String getNombre() {
        return nombre;
    }
}
