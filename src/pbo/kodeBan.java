package pbo;

//class
public class kodeBan {
    //atribut dan encapsulation
    private String merekBan;
    private String kodeBan;
    
    //constructor
    public kodeBan(String merekBan, String kodeBan) {
        this.merekBan = merekBan;
        this.kodeBan = kodeBan;
    }

    //mutator (setter)
    public void setMerekBan(String merek) {
        this.merekBan = merek;
    }
    
    public void setKodeBan(String kode) {
        this.kodeBan = kode;
    }
    
    //mutator (getter)
    public String getMerekBan() {
        return merekBan;
    }
    
    public String getKodeBan() {
        return kodeBan;
    }

    public String displayInfo(){
        return "Merek Ban: "+getMerekBan()+"\nKode Ban: "+getKodeBan();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String harga){
        return displayInfo() + "\nHarga Ban: "+harga;
    }
}
