package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        this.cedula = 1;		//Defini que la cedula fuera 1 porque ese es el valor que se necesita
        totalPersonas++;		//printear cuando solo se define una persona por el nombre
    }
    
    Persona(){
    	this(0,"NN");		//Este constructor apunta al otro y establece el valor de cédula 00 y NN
    }						//cuando se crea un objeto persona sin pasar parámetos
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}