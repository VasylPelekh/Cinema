import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI_Admin extends JFrame {

	private JButton addFilmButton = new JButton("Add Film");
	
	private JButton addSesionButton = new JButton("Add Sesion");
	
	private JButton listFilmButton = new JButton("Films list");
	
	private JButton listSesionButton = new JButton("Sesions list");
	
	private JButton deleteButton = new JButton("Delete film or sesion");

	private JButton saveButton = new JButton("Save");

	public GUI_Admin() {
		super("Menu Admin");
		setSize(1280, 762);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container container = getContentPane();
		container.setLayout(new GridLayout(5, 1, 100, 100));
		
		container.add(addFilmButton);
		container.add(addSesionButton);
		container.add(listFilmButton);
		container.add(listSesionButton);
		container.add(deleteButton);
		container.add(saveButton);
		
		addFilmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				GUI_Film app = new GUI_Film();
				app.setVisible(true);
			}
		});
		
		addSesionButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				GUI_Sesion app1 = new GUI_Sesion();
				app1.setVisible(true);
			}
		});

		listFilmButton.addActionListener(e -> {
			StringBuilder sb = new StringBuilder();
			Program.cinema.getFilms().forEach(sb::append);
			JOptionPane.showMessageDialog(null, sb.toString(), "Films", JOptionPane.PLAIN_MESSAGE);
		});
		
		listSesionButton.addActionListener(e -> {
			StringBuilder sb = new StringBuilder();
			Program.cinema.getSesions().forEach(sb::append);
			JOptionPane.showMessageDialog(null, sb.toString()+"\n", "Sesions", JOptionPane.PLAIN_MESSAGE);
		});
		
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				GUI_Delete app = new GUI_Delete();
				app.setVisible(true);
			}
		});
		
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Program.save(Program.cinema);
			}
		});

	}



}
