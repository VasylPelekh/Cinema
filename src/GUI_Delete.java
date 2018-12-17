import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_Delete extends JFrame {


	private JLabel fFilmLabel = new JLabel("Choise Film:");
	Object[] array = Program.cinema.getFilms().toArray();
	JComboBox comboBox = new JComboBox(array);

	private JButton delFilmButton = new JButton("Delete Film");
	
	
	private JLabel fSesionLabel = new JLabel("Choise Sesion:");
	Object[] array1 = Program.cinema.getSesions().toArray();
	JComboBox comboBox1 = new JComboBox(array1);

	private JButton delSesButton = new JButton("Delete Sesion");

	public GUI_Delete() {
		super("Delete");
		setSize(1280, 762);
		Container container = getContentPane();
		container.setLayout(new GridLayout(2, 3, 80, 80));

		container.add(fFilmLabel);
		Container content = getContentPane();
		JComboBox fFilm = new JComboBox(array);
		fFilm.setAlignmentX(LEFT_ALIGNMENT);
		content.add(comboBox);
		
		delFilmButton.setBackground(Color.red);
		container.add(delFilmButton);
		
		container.add(fSesionLabel);
		Container content1 = getContentPane();
		JComboBox fSes = new JComboBox(array1);
		fSes.setAlignmentX(LEFT_ALIGNMENT);
		content1.add(comboBox1);
		
		delSesButton.setBackground(Color.red);
		container.add(delSesButton);

		delFilmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Film film = (Film) comboBox.getSelectedItem();
				Program.cinema.getFilms().remove(film);

			}
		});

		delSesButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Sesion sesion = (Sesion) comboBox1.getSelectedItem();
				Program.cinema.getSesions().remove(sesion);
			}
		});

	}
}
