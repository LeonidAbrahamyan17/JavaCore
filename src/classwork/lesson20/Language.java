package classwork.lesson20;

public enum Language {
    HY("ARMENIA"),
    RU("Russia"),
    ENG("USA"),
    CH;

    private String country;
    Language(String country){
        this.country = country;
    }

    Language(){

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
