package Clases;

public class Empleado {
    private int ID;
    private String nombre;
    private String user;
    private String password;

    public Empleado() {
    }

    public Empleado(int ID, String nombre, String user, String password) {
        this.nombre = nombre;
        this.user = user;
        this.password = password;
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
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "Empleado{" + "ID=" + ID + ", nombre=" + nombre + ", user=" + user + ", password=" + password + '}';
    }
    
    
}
