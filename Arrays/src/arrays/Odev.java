package arrays;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		String[] que = {"a","b","c","d","a"};
		String[] a = new String[5];
		int i = 0;
		int count = 0;
		//1
		System.out.println("Yasadigimiz cagdaki iklim degisikliklerine verilen isim ......' dır");
		System.out.println("a) Din Savaşları ");
		System.out.println("b) Sanayi Devrimi");
		System.out.println("c) Küresel ısınma");
		System.out.println("d) Evrim Teorisi");
		Scanner sc = new Scanner(System.in);
			a[i] = sc.nextLine();
		if(que[i].equals(a[i])) 
		{
			count++;
			System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		//2
		System.out.println("Hangi Ülke En Çok Sera Gazı Yaymaktadır");
		System.out.println("a) ABD ");
		System.out.println("b) Çin");
		System.out.println("c) Hindistan");
		System.out.println("d) Japonya");
		 Scanner sasc = new Scanner(System.in);
			a[i] = sasc.nextLine();
		if(que[i].equals(a[i])) 
		{
			count++;
			System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		//3
		System.out.println("Iklim Değişikli nedeniyle yılda kaç kişi ölmektedir?");
		System.out.println("a) 100-1000 ");
		System.out.println("b) 1000-4000");
		System.out.println("c) 4000-8000");
		System.out.println("d) 8000+");
		Scanner sc1 = new Scanner(System.in);
			a[i] = sc1.nextLine();
		if(que[i].equals(a[i])) 
		{
			count++;
			System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		//4
		System.out.println("Hangi Gezegenin Atmosferi Kuresel Isınma İle Yok olmaktadır?");
		System.out.println("a) Jupiter ");
		System.out.println("b) Merkür");
		System.out.println("c) Venüs");
		System.out.println("d) Mars");
		Scanner s2c = new Scanner(System.in);
					a[i] = s2c.nextLine();
		if(que[i].equals(a[i])) 
		{
				count++;
				System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		//5
		System.out.println("Küresel Isınmaya Karşı En Savunmasız Hayvan? ");
		System.out.println("a) Kar Leoparı ");
		System.out.println("b) Kutup Ayısı");
		System.out.println("c) Deniz Gergedanı");
		System.out.println("d) Tukan");
		Scanner seec = new Scanner(System.in);
			a[i] = seec.nextLine();
		if(que[i].equals(a[i])) 
		{
			count++;
			System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		switch (count)
		{
		case 5:
			System.out.println("Mükemmelsin <3");
			break;
		case 4:
			System.out.println("Cok Iyi");
			break;
		case 3:
			System.out.println("Kuresel Isınma Hakkinda Bilgilerinizi Tazeleme Zamani");
			break;
		case 2:
			System.out.println("Kuresel Isınma Hakkinda Bilgilerinizi Tazeleme Zamani");
			break;
		case 1:
			System.out.println("Kuresel Isınma Hakkinda Bilgilerinizi Tazeleme Zamani");
			break;
		case 0:
			System.out.println("Kuresel Isınma Hakkinda Bilgilerinizi Tazeleme Zamani");
			break;
			
			
		}
		
		
	}

}
