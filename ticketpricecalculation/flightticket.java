package ticketpricecalculation;
import java.util.Scanner;
public class flightticket {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("gideceğiniz km giriniz ");
		int km = scanner.nextInt();
		
		System.out.println("yaşınızı giriniz");
		int yas = scanner.nextInt();
		
		
		System.out.println("yolculuk tipini giriniz 1-tek yön, 2- gidiş dönüş");
		int tip=scanner.nextInt();
		

		if (yas<5 || yas >141 ) {
			System.out.println(" bu yaslar icin biletlerimiz ücretsiz");
			
		}
		else {
			double normaltutar= 0.10*km;
			
			System.out.println("Normal bilet fiyatı tutarı :"+normaltutar);
			
		}
		double normaltutar= 0.10*km;
		
		
		if (yas<13 && yas>=5) {
			double yasindirimlitutar=normaltutar/2;
			if (tip==2) {
				double gidisdonus = (yasindirimlitutar*20)/100;
				System.out.println("gidiş-dönüş yaş indirimli tutarınız : "+gidisdonus);
			}
			else {
				System.out.println("tek yön yaş indiriminden faydalanarak tutarınız : "+yasindirimlitutar);
			}
			
			
		}
		else if (yas>=13 && yas<25 ) {
			double indirimlitutar= (normaltutar -(normaltutar * 10)/100);
			if (tip==2) {
				double gidisdonus2 = (indirimlitutar*20)/100;
				System.out.println("gidiş-dönüş indirimli tutarınız : "+gidisdonus2);
			}
			else {
				System.out.println("tek yön indirimli tutarınız "+indirimlitutar);
			}

		}
		else if (yas>=25 && yas<65) {
			if (tip==2) {
				double gidisdonus3 = (normaltutar*20)/100;
				System.out.println("gidiş-dönüş normal tutarınız : "+gidisdonus3);
			}
			else {
				System.out.println("tek yön normal tutarınız : ");
			}
		}
		else if (yas>=65 && yas<141) {
			double yasliindirimi = (normaltutar -(normaltutar * 30)/100);
			if (tip==2) {
				double gidisdonus4 = (yasliindirimi*20)/100;
				System.out.println("gidiş-dönüş yaşlı indirimli  tutarınız : "+gidisdonus4);
		}
			else {
				System.out.println("tek yön yaşlı indirimi fiyatı üzerinden tutarınız "+yasliindirimi);
			}
		
		}
		
		

	}

}
