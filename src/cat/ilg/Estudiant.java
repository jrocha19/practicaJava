package cat.ilg;

public class Estudiant extends Persona {
    //Atributos
    private String dni;
    private String nom;
    private double nota;
    //Metodos
    public void posarNota (double nota){

        this.nota = nota;
    }

    public void obtenirDades () {
        System.out.println("Nombre:"+nom+"-DNI:"+dni+"-Nota:"+nota);
    }
}
