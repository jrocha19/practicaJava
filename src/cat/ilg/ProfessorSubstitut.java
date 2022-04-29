package cat.ilg;

public class ProfessorSubstitut extends Professor {
    //Atributos
    private String dni;
    private String nom;
    private Date dataInici;
    private Date dataFi;
    //Metodos
    public void assignarSubstitucio(dataInici, dataFi){

    }

    public void obtenirDades () {
        System.out.println("Nombre:"+nom+"-DNI:"+dni+"-Sou:"+sou+"-DataInici"+DataInici+"-DataFi"+DataFi);
    }
}
