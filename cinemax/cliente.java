
public class cliente extends utente {

    //CAMPI
    private int idcliente;

    //COSTRUTTORI
    /**
     * Costruttore della classe cliente
     *
     * @param nome nome del cliente
     * @param cognome cognome del cliente
     * @param username username del cliente
     * @param codicefiscale codice fiscale del cliente
     * @param password password del cliente
     * @param idcliente id del cliente
     */
    public cliente(String nome, String cognome, String username, String codicefiscale, int password, int idcliente) {
        super(nome, cognome, username, codicefiscale, password);
        this.idcliente = idcliente;
    }

    //METODI
    /**
     * @return restituisce l'id del cliente
     */
    public int getIdcliente() {
        return idcliente;
    }

    /**
     * @param idcliente id del cliente
     */
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

}
