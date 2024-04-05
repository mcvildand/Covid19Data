public class Covid19Data {

    private String region;
    private String aldersgruppe;
    private int bekraeftede_tilfaelde;
    private String doede;
    private int indlagte_intensiv;
    private int indlagte;
    private String dato;


    public Covid19Data(String region, String aldersgruppe, int bekraeftede_tilfaelde,
                       String doede, int indlagte_intensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekraeftede_tilfaelde = bekraeftede_tilfaelde;
        this.doede = doede;
        this.indlagte_intensiv = indlagte_intensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region=" + region +
                ", aldersgruppe='" + aldersgruppe + '\'' +
                ", bekraeftede_tilfaelde='" + bekraeftede_tilfaelde + '\'' +
                ", doede='" + doede + '\'' +
                ", indlagte_intensiv='" + indlagte_intensiv + '\'' +
                ", indlagte='" + indlagte + '\'' +
                ", dato='" + dato + '\'' +
                '}';
    }


}
