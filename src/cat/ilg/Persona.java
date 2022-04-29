package cat.ilg;

public class Persona {
    //Atributos
    private String dni;
    private String nom;
    //Metodos
    public void canviarNom (String nom){

        this.nom = nom;
    }

    public void assignarDni (String dni){

        this.dni=dni;
    }

    public void obtenirDades () {
        System.out.println("Nombre:"+nom+"/ DNI"+dni);
    }
}
