import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Sesion implements Serializable {
	private Film film; 
	private LocalTime time;
	private LocalDate date;
	private int kinozal;
	
	public Sesion(Film film, LocalTime time, LocalDate date, int kinozal) {
		this.film = film;
		this.time = time;
		this.date = date;
		this.kinozal = kinozal;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getKinozal() {
		return kinozal;
	}
	public void setKinozal(int kinozal) {
		this.kinozal = kinozal;
	}
	@Override
	public String toString() {
		return "Sesion [film=" + film + ", time=" + time + ", date=" + date + ", kinozal=" + kinozal + "]\n";
	}
	
	
	
}
