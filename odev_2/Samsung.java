package week_2.odev_2;

import java.util.Scanner;

public class Samsung extends PhoneCompany implements Opining,Closing,Calling,SendMessage{
    public boolean status;
    private boolean isCLose = false;
    Scanner oku = new Scanner(System.in);
    @Override
    public void call() {

        System.out.println("aramak istediginiz numarayi gir:");
        String numara=oku.nextLine();
        System.out.printf(" %s numaraya arama yapiliyor",numara);
        System.out.println("samsung telefonundan arama yapildi");
    }

    @Override
    public void close() {
        if (isCLose) {
            System.out.println("samsung phone already is closing");
        } else {
            isCLose = true;
            System.out.println("samsung telefonunuz zaten kapali");
        }

    }

    @Override
    public void open() {
        if (!status) {
            this.status = true;
            System.out.println("samsung cihazi acildi :" + status);
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
        System.out.println("samsung telefonundan sms gonderildi");

    }
    //samsung telefonun ozel davranislar:
    private String mp3listing="";
    private String fileshare="";

    public Samsung(String mp3listing, String fileshare) {
        this.mp3listing = mp3listing;
        this.fileshare = fileshare;

    }
}
