
public class utente {

    //CAMPI 
    private String nome;
    private String cognome;
    private int password;
    private String username;
    private String codicefiscale;

    //COSTRUTTORI
    /**
     * Costruttore della classe utente
     *
     * @param nome nome dell'utente
     * @param cognome cognome dell'utente
     * @param username username dell'utente
     * @param codicefiscale codice fiscale dell'utente
     * @param password password dell'utente
     *
     */
    public utente(String nome, String cognome, String username, String codicefiscale, int password) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.codicefiscale = codicefiscale;
        this.password = password;
    }

    //METODI
    /**
     * @return restituisce il nome dell'utente
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome nome dell'utente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return restituisce il cognome dell'utente
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome cognome dell'utente
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return restituisce lo username dell'utente
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username username dell'utente
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return restituisce il codice fiscale dell'utente
     */
    public String getCodicefiscale() {
        return codicefiscale;
    }

    /**
     * @param codicefiscale codice fiscale dell'utente
     */
    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }

    /**
     * @return restituisce la password dell'utente
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password password dell'utente
     */
    public void setPassword(int password) {
        this.password = password;
    }

}
