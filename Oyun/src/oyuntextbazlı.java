import java.util.Scanner;

public class oyuntextbazlý {

	public static void main(String[] args) {
		
		float dusmansaglýgý, saglýk, seçim, saldýrý, dusmanhasarý, xp;
		saglýk = 100;
		dusmansaglýgý = 100;
		saldýrý = -50;
		dusmanhasarý = -5;
		xp = 0;
		Scanner input = new Scanner(System.in);
		
		while (saglýk > 0 || dusmansaglýgý > 0 ){

	    	System.out.println("Saðlýk=> " + saglýk + " Dusmansaglýðý=> "+ dusmansaglýgý);
			System.out.println("1=> |Saldýr|");
			System.out.println("2=> |Savun|");
			System.out.println("3=> |Yükselt|(25xpgerekli)");
			System.out.println("4=> |çýk|");
			System.out.print("Seçiminizi giriniz=> ");
		
			seçim = input.nextInt();
			
		if (seçim==1){
			System.out.println("Sladýrýyoruz!!");
			System.out.println("Düþman saðlýðý " + (dusmansaglýgý + saldýrý) + " kaldý.");
			System.out.println("Dusman saldýrdý ve " + (dusmanhasarý + saglýk) + " saðlýðýmýz kaldý.");
			
		} 
		
		else if (seçim==2){
			System.out.println("Kalkaným hazýr.(Alýnan Hasarýn %50 si absorbe edilicektir.)");
		}
		
		else if(seçim == 3 && xp >= 25){
				System.out.println("Hasarýnýz +10 artýrýldý.");
				saldýrý = -20;
		}
		
		else if (seçim==4){
			System.exit(1);
			input.close();
		}
		
		else if (saglýk <= 0 ){
			System.out.print("Oyun sona erdi.");
			System.exit(1);
		}
		
		else if (dusmansaglýgý <= 0){
			
			System.out.println("!!!KAZANDINIZ!!!");
		}
		
		else if (seçim >= 4) {
			System.out.print("Devam etmek için 0 giriniz=> ");
			seçim = input.nextInt();
		}
		}
    	System.exit(1);
		input.close();
	}

}
