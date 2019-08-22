
public class Main {
    public static void main(String[] args) {
        // Object Oriented(Nesne Yönelimli ) ATM Programı
        
        // Login Class'ı Kullanıcı Girişini Kontrol Edecek.
        
        // Hesap Class'ı Hesap İşlemlerini Yapacak.
        
        // ATM ise atmmizi çalıştıracak.
        
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("İsa Etingün","12345", 2000);
        Hesap hesap1 = new Hesap("Husamettin", "12345", 3000);
        atm.calis(hesap);
        atm.calis(hesap1);
        System.out.println("Programdan Çıkılıyor...");
        
        
        
        
    }
 
}
