import java.util.Scanner;

public class oyuntextbazl� {

	public static void main(String[] args) {
		
		float dusmansagl�g�, sagl�k, se�im, sald�r�, dusmanhasar�, xp;
		sagl�k = 100;
		dusmansagl�g� = 100;
		sald�r� = -50;
		dusmanhasar� = -5;
		xp = 0;
		Scanner input = new Scanner(System.in);
		
		while (sagl�k > 0 || dusmansagl�g� > 0 ){

	    	System.out.println("Sa�l�k=> " + sagl�k + " Dusmansagl���=> "+ dusmansagl�g�);
			System.out.println("1=> |Sald�r|");
			System.out.println("2=> |Savun|");
			System.out.println("3=> |Y�kselt|(25xpgerekli)");
			System.out.println("4=> |��k|");
			System.out.print("Se�iminizi giriniz=> ");
		
			se�im = input.nextInt();
			
		if (se�im==1){
			System.out.println("Slad�r�yoruz!!");
			System.out.println("D��man sa�l��� " + (dusmansagl�g� + sald�r�) + " kald�.");
			System.out.println("Dusman sald�rd� ve " + (dusmanhasar� + sagl�k) + " sa�l���m�z kald�.");
			
		} 
		
		else if (se�im==2){
			System.out.println("Kalkan�m haz�r.(Al�nan Hasar�n %50 si absorbe edilicektir.)");
		}
		
		else if(se�im == 3 && xp >= 25){
				System.out.println("Hasar�n�z +10 art�r�ld�.");
				sald�r� = -20;
		}
		
		else if (se�im==4){
			System.exit(1);
			input.close();
		}
		
		else if (sagl�k <= 0 ){
			System.out.print("Oyun sona erdi.");
			System.exit(1);
		}
		
		else if (dusmansagl�g� <= 0){
			
			System.out.println("!!!KAZANDINIZ!!!");
		}
		
		else if (se�im >= 4) {
			System.out.print("Devam etmek i�in 0 giriniz=> ");
			se�im = input.nextInt();
		}
		}
    	System.exit(1);
		input.close();
	}

}
