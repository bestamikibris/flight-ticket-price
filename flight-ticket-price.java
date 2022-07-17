import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int distance, age, type;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi Km Türünde Giriniz: ");
        distance = input.nextInt();
        System.out.println("Yaşınızı Giriniz: ");
        age = input.nextInt();
        System.out.println("Yolculuk Tipini Giriniz");
        System.out.println("1)Tek Yön - 2)Gidiş/Dönüş: ");
        type = input.nextInt();
		
		double totalCost = distance * 0.1;
        double childDictount = totalCost / 2;
        double youngDiscount = totalCost * 0.9;
        double oldDiscount = totalCost * 0.7;
        
        
        if (age > 0 && distance > 0 && type > 0 && type < 3) {
            System.out.println("İndirimsiz Tutar: " + totalCost);
            
            if (age < 12) {
                totalCost = childDictount;
            } else if (12 <= age && age <= 24) {
                totalCost = youngDiscount;
            } else if (age > 65) {
                totalCost = oldDiscount;
            }
            
            if (type == 2) {
                totalCost = (totalCost - (totalCost * 0.2)) * 2;
            }
            System.out.println("İndirimli Tutar: " + totalCost);
        } 
        else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }
        
	}
}
