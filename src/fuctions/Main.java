package fuctions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayiBulmaca();

	}
	//camel casing
	public static void sayiBulmaca() {
		int[] sayilar = { 1, 2, 34, 5, 6, 7, 8, 9 };
		int aranacak = 6;
		boolean varMi = false;

		for (int i : sayilar) {
			if (i == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj="";

		if (varMi) {
			mesaj="Sayı mevcuttur: "+aranacak;
			mesajVer(mesaj);
		} else {
			mesaj="Sayı mevcut değildir: "+aranacak;
			mesajVer(mesaj);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
