import java.util.ArrayList;

class Actividad {
    private String nombre;
    private String descripcion;
    private ArrayList<Usuario> participantes = new ArrayList<>();
    private Ubicacion ubicacion;
    private String horario;

    public Actividad(String nombre, String descripcion, Ubicacion ubicacion, String horario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.horario = horario;
    }

    public void unirseParticipante(Usuario participante) {
        participantes.add(participante);
    }

    public void cambiarUbicacion(Ubicacion nuevaUbicacion) {
        ubicacion = nuevaUbicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
