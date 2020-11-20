package week_2.odev_2;


public class Main {
    public static void main(String[] args) {

        Samsung samsung= new Samsung("mp3 music","document");
        samsung.call(); //samsung'a ozel calisan interface metod
        samsung.sendsms();

        Apple apple = new Apple();
        apple.open();//her iki siniftaki olasi gereken davranislardan
        apple.screenSharing();//apple sinifina ait ozellik.

        //telefon instance olusturabilmek icin keyboard nesnesine ihtiyacim var
        Klavye klavye = new OEMkeyboard();
        PhoneCompany phone= new PhoneCompany(klavye); //classin nesnesini gonderiyorum

        phone.read();




    }
}
