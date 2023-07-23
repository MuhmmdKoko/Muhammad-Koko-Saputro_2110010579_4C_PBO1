package pbo;

//inheritance
public class bacaKodeBan extends kodeBan {
    //overriding
    public bacaKodeBan(String merek, String kode) {
        super(merek, kode);
    }
    
    //seleksi
    public String getLebarBan() {
        return String.valueOf(getKodeBan().substring(0,3));
    }
    
    public String getTinggiBan(){
        return String.valueOf(getKodeBan().substring(4, 6));
    }
    
    public String getDiameterVelg(){
        return String.valueOf(getKodeBan().substring(6 ,9));
    }
    
    public String getKecepatanMaksimum(){
       String kecMaks = getKodeBan().substring(11);
       //seleksi switch
       switch(kecMaks){
           case "P":
               return "150";
           case "Q":
               return "160";
           case "R":
               return "170";
           case "S":
               return "180";
           case "T":
               return "190";
           case "H":
               return "210";
           case "V":
               return "240";
           case "W":
               return "270";
           case "Y":
               return ">300";    
           default:
               return "Kode Tidak Ditemukan";
       }
    }
    
    public String getBebanMaksimum(){
        String bebanMaks = getKodeBan().substring(9, 11);
        //seleksi switch case
        switch(bebanMaks){
           case "62":
               return "265";
           case "63":
               return "272";
           case "64":
               return "280";
           case "65":
               return "290";
           case "66":
               return "300";
           case "67":
               return "307";
           case "68":
               return "315";
           case "69":
               return "325";
           case "70":
               return "335";
           case "71":
               return "345";
           case "72":
               return "355";
           case "73":
               return "365";
           case "74":
               return "375";
           case "75":
               return "387";
           case "76":
               return "400";
           case "77":
               return "412";
           case "78":
               return "425";
           case "79":
               return "437";
           case "80":
               return "450";
           case "81":
               return "462";
           case "82":
               return "475";
           default:
               return "Kode Tidak Ditemukan";
        }
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nLebar Ban : "+getLebarBan()+ " mm"+
                "\nTinggi Ban: "+getTinggiBan()+ " %"+
                "\nDiameter Velg: "+getDiameterVelg()+ " inch"+
                "\nBeban Maksimum : "+getBebanMaksimum()+ " kg"+
                "\nKecepatan Maksimum: "+getKecepatanMaksimum()+" km/jam";                
    }   
}
