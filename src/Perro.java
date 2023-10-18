public class Perro {

    private String nombre;
    private String raza;
    private int edad;


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void Comer(String comida,double gramos){
    }

    public String Ladrar(){
        return "guau guau";
    }
}
