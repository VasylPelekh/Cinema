import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_Guest extends JFrame{
	Film film;
	List<Film> fname = new ArrayList<>();
		
	
	
	private JLabel fFilmLabel = new JLabel("Choise Film:");
	Object[] array = Program.cinema.getFilms().toArray();
	JComboBox comboBox = new JComboBox(array);
}
