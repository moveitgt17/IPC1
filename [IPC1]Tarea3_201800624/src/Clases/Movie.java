package Clases;

public class Movie {
    private int ID;
    private String nombre;
    private int duracion;
    private String idioma;

    public Movie() {
    }

    public Movie(int ID, String nombre, int duracion, String idioma) {
        this.ID = ID;
        this.nombre = nombre;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Movie{" + "ID=" + ID + ", nombre=" + nombre + ", duracion=" + duracion + ", idioma=" + idioma + '}';
    }
    
}
