package es.upm.miw.iwvg_devops.models;

public class User{

    private int id;
    private int edad;

    public User(int id, int edad) {
        this.id= id;
        this.edad= edad;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        System.out.println("Resolve conflict");
        return super.toString();
    }
}
