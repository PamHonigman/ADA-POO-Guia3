package entidades;

public class Pelicula {
    private String titulo;
    private String director;
    private float duracionHoras;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, float duracionHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHoras = duracionHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Título: '" + titulo + '\'' +
                ", Director: " + director +
                ", Duración: " + duracionHoras +
                " hs.";
    }
}
