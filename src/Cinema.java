import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Cinema implements Serializable {
	private List<Film> films;
	private List<Sesion> sesions;

    public Cinema() {
        films = new ArrayList<>();
        sesions = new ArrayList<>();
    }
	public List<Film> getFilms() {
		return films;
	}
	public List<Sesion> getSesions() {
		return sesions;
	}
	public void setFilms(List<Film> films) {
		this.films = films;
	}
	public void setSesions(List<Sesion> sesions) {
		this.sesions = sesions;
	}
    
	
}
