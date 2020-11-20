package week_2.odev_2;


public  class PhoneCompany { //ana sinifimiz butun telefon varliklar icindir ve ortak ozelliklerini icerir
    public String modelName ="";
    public String IMEInumber ="";
    public String vesionNumber="";
    public int bellekKapasitesi;
    public int boyut;

    //has_a iliskisinde telefonun bir klavyesi var .
    private Klavye klavye; //sinifi buraya inject ettik
    //inject ettigim bu sinifi constract araciligiyla set ettim

    public PhoneCompany(Klavye klavye) {
        this.klavye = klavye;
    }

    public PhoneCompany() {
    }

    public void read(){
        this.klavye.read();

    }
}
