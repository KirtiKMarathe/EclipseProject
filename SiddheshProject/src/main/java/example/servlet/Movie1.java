package example.servlet;
public class Movie1 {
	private int movieNo;
	private String title;//Instance Variable
	private String genre;
	private int year;
	public Movie1() {
		System.out.println("Movie object created...");
	}
	public Movie1(int movieNo, String title, String genre, int year) {
		this.movieNo = movieNo;
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	public int getMovieNo() {
		System.out.println("Retrieving Movie Number");
		return movieNo;
	}
	public void setMovieNo(int movieNo) {
		System.out.println("Setting Movie Number");
		this.movieNo = movieNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
	

}
