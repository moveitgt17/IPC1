package Clases;

public class Branch {
    private int ID;
    private String nombre;
    private String address;
    private int rooms;

    public Branch() {
    }

    public Branch(int ID,String nombre, String address, int rooms) {
        this.ID = ID;
        this.address = address;
        this.rooms = rooms;
        this.nombre = nombre;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the rooms
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(int rooms) {
        this.rooms = rooms;
        
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

    @Override
    public String toString() {
        return "Branch{" + "ID=" + ID + ", nombre=" + nombre + ", address=" + address + ", rooms=" + rooms + '}';
    }
    
    
}
