package cl.inacap.taskster.modelo;

public class Nota {
    private String titulo;
    private String descripcion;
    private Boolean estado;

    public static final Nota[] notas={
            new Nota("Nota de prueba", "Algo para escribir en esta nota...", true),
            new Nota("Otra nota", "Esta es otra nota", true)
    };

    public Nota(String titulo, String descripcion, Boolean estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return titulo + '\'' +
                descripcion;
    }
}
