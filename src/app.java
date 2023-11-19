
import java.util.Scanner;

public class app {
   
	 static   int bakiye = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- ATM App -----");

        String operations = "1- Bakiye görüntüle \n"
                + "2- Para yatır \n"
                + "3- Para çek";
        System.out.println(operations);
        System.out.print("Secim yapınız :");
        int secim = scanner.nextInt();

        
        
        
    
     
        
       
        switch (secim) {
            case 1:
                System.out.println("Bakiyeniz = " + bakiye);
                menu(scanner, args);
                break;

            case 2:
                System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                int yatirilanPara = scanner.nextInt();
                bakiye += yatirilanPara;
                System.out.println("Güncel bakiyeniz = " + bakiye);
                menu(scanner, args);
                break;

            case 3:
                System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                int cekilenPara = scanner.nextInt();
                if (cekilenPara > bakiye) {
                    System.out.println("Yetersiz bakiye. İşlem iptal edildi.");
                } else {
                    bakiye -= cekilenPara;
                    System.out.println(cekilenPara + " TL para çekimi yaptınız. Güncel bakiyeniz = " + bakiye);
                }
                
                menu(scanner, args);
                break;

            default:
                System.out.println("Geçersiz seçim.");
        }

       
    }

    private static void menu(Scanner scanner, String[] args) {
        System.out.print("Ana menüye dönmek için '0' çıkış için '1' tuşlayınız : ");
        int menu = scanner.nextInt();
        if (menu == 0) {
            main(args);
        } else if (menu == 1) {
        	switch(menu)
        	{
        	case 1: System.out.println("Çıkış yapıldı");
        	break;
        	}
            
            
        }
    }
}
