class ObjetoVirtual {
    private String nombre;
    private String descripcion;
    private Usuario propietario;
    private Ubicacion ubicacionActual;
    private double valor;

    public ObjetoVirtual(String nombre, String descripcion, Usuario propietario, double valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.propietario = propietario;
        this.valor = valor;
    }

    public void moverAUbicacion(Ubicacion nuevaUbicacion) {
        ubicacionActual = nuevaUbicacion;
    }

    public void cambiarPropietario(Usuario nuevoPropietario) {
        propietario = nuevoPropietario;
    }

    public String getNombre() {
        return nombre;
    }
}
