import java.util.ArrayList;

class Usuario {
    private String nombre;
    private int ID;
    private Ubicacion ubicacionActual;
    private ArrayList<Usuario> amigos = new ArrayList<>();
    private ArrayList<ObjetoVirtual> inventario = new ArrayList<>();

    public Usuario(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public void interactuarConObjeto(ObjetoVirtual objeto) {
        System.out.println(nombre + " interactuó con " + objeto.getNombre());
    }

    public void unirseActividad(Actividad actividad) {
        actividad.unirseParticipante(this);
        ubicacionActual = actividad.getUbicacion();
    }

    public void agregarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public String getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacionActual() {
        return ubicacionActual;
    }

    public ArrayList<ObjetoVirtual> getInventario() {
        return inventario;
    }
}
