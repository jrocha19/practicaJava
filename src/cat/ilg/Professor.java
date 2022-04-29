package cat.ilg;

public class Professor extends Persona {
    //Atributos
    private String dni;
    private String nom;
    private int sou;
    //Metodos
    public void canviarSou (int nouSou){

        this.nouSou = nouSou;
    }

    public void obtenirDades () {
        System.out.println("Nombre:"+nom+"-DNI:"+dni+"-Sou:"+sou);
    }
}
