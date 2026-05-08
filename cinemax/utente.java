
public class utente {

    //CAMPI 
    private String nome;
    private String cognome;
    private int password;
    private String username;
    private String codicefiscale;

    //COSTRUTTORI
    public utente(String nome, String cognome, String username, String codicefiscale, int password) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.codicefiscale = codicefiscale;
        this.password = password;
    }

    //METODI
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCodicefiscale() {
        return codicefiscale;
    }

    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
