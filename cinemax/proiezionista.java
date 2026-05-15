
public class proiezionista extends utente {

    //CAMPI
    private int idproiezionista;

    //COSTRUTTORI
    /**
     * Costruttore della classe proiezionista
     *
     * @param nome nome del proiezionista
     * @param cognome cognome del proiezionista
     * @param username username del proiezionista
     * @param codicefiscale codice fiscale del proiezionista
     * @param password password del proiezionista
     * @param idproiezionista id del proiezionista
     */
    public proiezionista(String nome, String cognome, String username, String codicefiscale, int password, int idproiezionista) {
        super(nome, cognome, username, codicefiscale, password);
        this.idproiezionista = idproiezionista;
    }

    //METODI
    /**
     * @return restituisce l'id del proiezionista
     */
    public int getIdproiezionista() {
        return idproiezionista;
    }

    /**
     * @param idproiezionista id del proiezionista
     */
    public void setIdproiezionista(int idproiezionista) {
        this.idproiezionista = idproiezionista;
    }

}
