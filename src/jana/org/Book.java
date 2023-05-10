package jana.org;

public class Book {
	private String title;
	private String author;
	private String editor;
	private int pages;
	
	public Book(String title, String author, String editor, int pages) throws Exception {
		setTitle(title);
		setAuthor(author);
		setEditor(editor);
		setPages(pages);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		
		if(title.length()<=1 || title.length()>= 34) {
			
			throw new Exception("il titolo deve essere composto da almeno 1 carattere");
		}
		
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		
if(author.length()<= 3 || author.length()>= 34) {
			
			throw new Exception("il nome deve essere composto da almeno 1 carattere");
		}
		
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws Exception {
		
		if(pages <=0) {
			
			throw new Exception("il numero di pagine non puo essere 0 o inferiore");
		}
		
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		return "Titolo libro: " + title + " Autore: " + author +
				" \neditor: " + editor + " numero pagine: " + pages;
	}
	
}
