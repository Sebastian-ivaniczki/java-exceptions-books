package jana.org;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Quanti libri vuoi inserire?");
		
		Scanner sc = new Scanner(System.in);
			
		int valUser = sc.nextInt();
		
		
		Book[] bArr = new Book[valUser];
		for(int i = 1; i<= valUser; i++) {

			String te = sc.nextLine();
			System.out.println("inserisci titolo:");
			String title = sc.nextLine();
			System.out.println("Inserisci autore:");
			String author = sc.nextLine();
			System.out.println("Inserisci editore:");
			String editor = sc.nextLine();
			System.out.println("inserisci numero pagine:");
			int pages = sc.nextInt();
			
			//new book 
			
			try {
				Book b1 = new Book(title, author, editor, pages);
				bArr[i-1] = b1;
			} catch (Exception e) {
				System.err.println("Errore nella creazione del libro\n" + e.getMessage());
				return;
			}
			
			
		}
		sc.close();
		
		
		
		
		
		
	}
}
