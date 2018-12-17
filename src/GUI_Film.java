import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.*;

public class GUI_Film extends JFrame {
	private java.util.List<Film> films = new ArrayList<>();
	private java.util.List<Sesion> sesion = new ArrayList<>();
	static Cinema cinema;
	
	private JLabel fNameLabel = new JLabel("Film Name:");
	private JTextField fNameInput = new JTextField();

	private JLabel fYearLabel = new JLabel("Year:");
	private JTextField fYearInput = new JTextField();
	
	private JLabel fZhanrLabel = new JLabel("Zhanr:");
	String[] label = {
		    "triller",
		    "drama",
		    "western",
		    "comedy",
		    "action",
		    "fantasy",
		    "horror",
		    
		};
		JComboBox comboBox = new JComboBox(label);
		
	private JLabel fQualityLabel = new JLabel("Quality:");
	String[] quality = {
			    "2D",
			    "3D",
			    "4D",
			    "5D"
			};
		JComboBox comboBox1 = new JComboBox(quality);	
		
	private JButton clearButton = new JButton("clear");
	private JButton addButton = new JButton("add");
	private JButton sesButton = new JButton("Sesion");

	private JButton showFilms = new JButton("List of films");

	public GUI_Film() {
		super("Film creator");
		setSize(1280, 762);
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(6, 2, 80, 80));
	
		container.add(fNameLabel);
		container.add(fNameInput);

		container.add(fYearLabel);
		container.add(fYearInput);

		container.add(fZhanrLabel);
		Container content = getContentPane();
		JComboBox fZhanr = new JComboBox(label);
		fZhanr.setAlignmentX(LEFT_ALIGNMENT);
        content.add(comboBox);
		
        container.add(fQualityLabel);
		Container content1 = getContentPane();
		JComboBox fQuality = new JComboBox(quality);
		fQuality.setAlignmentX(LEFT_ALIGNMENT);
        content1.add(comboBox1);
        
		container.add(clearButton);
		container.add(addButton);
		container.add(sesButton);
		container.add(showFilms);
		
		sesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GUI_Sesion app1 = new GUI_Sesion();
				app1.setVisible(true);
			}
		});
		
		showFilms.addActionListener(e -> {
			StringBuilder sb = new StringBuilder();
			Program.cinema.getFilms().forEach(sb::append);
			JOptionPane.showMessageDialog(null, sb.toString(), "Films", JOptionPane.PLAIN_MESSAGE);
		});

		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String fName = fNameInput.getText();
				int fYear = Integer.valueOf(fYearInput.getText());
                String fZhanr = (String) comboBox.getSelectedItem();
                String fQuality = (String) comboBox1.getSelectedItem();
				Film film = new Film(fName, fYear, fZhanr, fQuality);
				Program.cinema.getFilms().add(film);
			}
		});
	}
}
