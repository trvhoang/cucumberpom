package apiData;

public class SignUpInfo {
    private String firmId;
    private String email;
    private String login;
    private String password;
    private String country;
    private String consentMarketing;
    private String consentTerms;
    private String isIndividual;

    public SignUpInfo(String firmId, String email, String login, String password, String country, String consentMarketing, String consentTerms, String isIndividual){
        this.firmId = firmId;
        this.email = email;
        this.login = login;
        this.password = password;
        this.country = country;
        this.consentMarketing = consentMarketing;
        this.consentTerms = consentTerms;
        this.isIndividual = isIndividual;
    }

    public String getFirmId() {
        return firmId;
    }

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getConsentMarketing() {
        return consentMarketing;
    }

    public void setConsentMarketing(String consentMarketing) {
        this.consentMarketing = consentMarketing;
    }

    public String getConsentTerms() {
        return consentTerms;
    }

    public void setConsentTerms(String consentTerms) {
        this.consentTerms = consentTerms;
    }

    public String getIsIndividual() {
        return isIndividual;
    }

    public void setIsIndividual(String isIndividual) {
        this.isIndividual = isIndividual;
    }


}
