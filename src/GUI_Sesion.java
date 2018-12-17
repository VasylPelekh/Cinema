import java.awt.Container;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI_Sesion extends JFrame{
	
	private JLabel fFilmLabel = new JLabel("Choise Film:");
	Object[] array = Program.cinema.getFilms().toArray();
	JComboBox comboBox = new JComboBox(array);
	
	private JLabel LocalHourLabel = new JLabel("Hour:");
	private JTextField LocalHourInput = new JTextField();
	private JLabel LocalMinLabel = new JLabel("Minutes:");
	private JTextField LocalMinInput = new JTextField();

	private JLabel LocalYearLabel = new JLabel("Year:");
	private JTextField LocalYearInput = new JTextField();
	private JLabel LocalMounthLabel = new JLabel("Mounth:");
	private JTextField LocalMounthInput = new JTextField();
	private JLabel LocalDayLabel = new JLabel("Day:");
	private JTextField LocalDayInput = new JTextField();

	private JLabel fKinozalLabel = new JLabel("Kinozal:");
	String[] quality = {
			"1",
			"2",
			"3",
			"4",
			"5"
	};
	JComboBox comboBox1 = new JComboBox(quality);	

	private JButton clearButton = new JButton("clear");
	private JButton addButton = new JButton("add");

	private JButton showSesions = new JButton("List of sesions");

	public GUI_Sesion() {
		super("Sesion creator");
		setSize(1280, 762);
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(9, 2, 30, 20));

		container.add(fFilmLabel);
		Container content = getContentPane();
		JComboBox fFilm = new JComboBox(array);
		fFilm.setAlignmentX(LEFT_ALIGNMENT);
		content.add(comboBox);

		container.add(LocalHourLabel);
		container.add(LocalHourInput);
		container.add(LocalMinLabel);
		container.add(LocalMinInput);

		container.add(LocalYearLabel);
		container.add(LocalYearInput);
		container.add(LocalMounthLabel);
		container.add(LocalMounthInput);
		container.add(LocalDayLabel);
		container.add(LocalDayInput);

		container.add(fKinozalLabel);
		Container content1 = getContentPane();
		JComboBox fKinozalInput = new JComboBox(quality);
		fKinozalInput.setAlignmentX(LEFT_ALIGNMENT);
		content1.add(comboBox1);

		container.add(clearButton);
		container.add(addButton);

		container.add(showSesions);

		showSesions.addActionListener(e -> {
			StringBuilder sb = new StringBuilder();
			Program.cinema.getSesions().forEach(sb::append);
			JOptionPane.showMessageDialog(null, sb.toString()+"\n", "Films", JOptionPane.PLAIN_MESSAGE);
		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Film film = (Film) comboBox.getSelectedItem();
				int hour = Integer.valueOf(LocalHourInput.getText());;
				int min = Integer.valueOf(LocalMinInput.getText());;
				int year = Integer.valueOf(LocalYearInput.getText());;
				int mounth = Integer.valueOf(LocalMounthInput.getText());;
				int day = Integer.valueOf(LocalDayInput.getText());;
				String fKinozal = (String) comboBox1.getSelectedItem();
				int kinozal = Integer.valueOf(fKinozal);
				Sesion ses = new Sesion(film,LocalTime.of(hour, min), LocalDate.of(year, mounth, day), kinozal);
				Program.cinema.getSesions().add(ses);
			}
		});
	}
}
