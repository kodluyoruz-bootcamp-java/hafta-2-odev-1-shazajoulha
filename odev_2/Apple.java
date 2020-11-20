package week_2.odev_2;

import java.util.Scanner;

public class Apple extends PhoneCompany implements Opining,Closing,Calling,SendMessage{
    //Apple bir Phone IS_A iliskisi mevcuttur.
    //Apple hem arama acabilir, kapatabilir hemde arama yapip mesaj atabilir o interfaceleri implement edebilirim.
    // !!! ABSTRUCT siniflarla tip eklenir INTERFACE siniflarla DAVRANIS eklenir !!!
    public boolean status;
    private boolean isCLose = false;
    Scanner oku = new Scanner(System.in);

    //implement edilen siniflardaki metodlar override edilmek zorunda .
    @Override
    public void call() {
        System.out.println("aramak istediginiz numarayi gir:");
        String numara=oku.nextLine();
        System.out.printf(" %s numaraya arama yapiliyor",numara);
        System.out.println("apple telefonundan arama yapildi");

    }

    @Override
    public void close() {
        if (isCLose) {
            System.out.println("apple phone already is closing");
        } else {
            isCLose = true;
            System.out.println("telefonunuz zaten kapali");
        }

    }

    @Override
    public void open() {
        if (!status) {
            this.status = true;
            System.out.println("apple cihazi acildi :" + status);
        } else{
            System.out.println(status);
        }

    }

    @Override
    public void sendsms() {
        System.out.println(" gondermek istediginiz SMS metinini giriniz:");
        String sms=oku.nextLine();
        System.out.println(" istediginiz numarayi giriniz:");
        String numara=oku.nextLine();
        System.out.printf(" %s metini %s numaraya gonderildi yapiliyor",sms,numara);
        System.out.println("apple telefonundan sms gonderildi");

    }

    //apple sinifina ozel olan davranislar:
    private boolean vcall=false;
    private boolean vsharing=false;
    public void videoCall(){
        if(!vcall){
            System.out.println("apple video aramanizi yapmaktadir");
        }else {
            vcall=true;
            System.out.println("artik video aramasi yapmaya musaitsiniz");
        }
    }
    public void screenSharing(){
        if(!vsharing){
            System.out.println("apple video aramanizi yapmaktadir");
        }else {
            vsharing=true;
            System.out.println("artik video aramasi yapmaya musaitsiniz");
        }
    }
}
