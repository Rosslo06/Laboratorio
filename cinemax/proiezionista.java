
public class proiezionista extends utente {

    //CAMPI
    private int idproiezionista;

    //COSTRUTTORI
    public proiezionista(String nome, String cognome, String username, String codicefiscale, int password, int idproiezionista) {
        super(nome, cognome, username, codicefiscale, password);
        this.idproiezionista = idproiezionista;
    }

    //METODI
    public int getIdproiezionista() {
        return idproiezionista;
    }

    public void setIdproiezionista(int idproiezionista) {
        this.idproiezionista = idproiezionista;
    }

}
