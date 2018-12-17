import java.awt.List;
import java.io.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Program {
	static LocalDateTime now = LocalDateTime.now();
	static Scanner sc = new Scanner(System.in);
	static Cinema cinema = new Cinema(); 
	static java.util.List<User> users = new ArrayList<>();
	
	
	public static void main(String[] args) {
		users.add(new User("admin", "admin"));
		readCinema();
		
		
//		Iterator<Film> iter = cinema.getFilms().iterator();
		
		
//		Film film = new Film(iter);
		
				
//				System.out.println(cinema.getFilms().toString());
//		System.out.println(film.getfName());
		
		GUI_Autorisation app2 = new GUI_Autorisation();
		app2.setVisible(true);
	}
	
	private static void readCinema() {
	File file = new File("backupFilms");
	if (file.exists()) {
		try (
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				) {
			Object o = ois.readObject();
			if (o instanceof Cinema) {
				
				cinema = (Cinema) o;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			cinema = new Cinema();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} else {
		cinema = new Cinema();
		
	}
}

	static void save(Cinema cinema) {
	try (
			FileOutputStream fos = new FileOutputStream("backupFilms");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
		oos.writeObject(cinema);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
	
	
	
	
//	public static void logGuest() {
//		while (true) {
//			printMenuGuest();
//			int chooise = sc.nextInt();
//			switch (chooise) {
//			case 1:
//				poshycDataPokazu();
//				break;
//			case 2:
//				poshycNazva();
//				break;
//			case 3:
//				poshycDataVypusku();
//				break;
//			case 4:
//				poshycYakist();
//				break;
//			case 5:
////				sortuvannyaNazva();
//				break;
//			case 6:
////				sortuvannyaDataVypusku();
//				break;
//			case 7:
////				sortuvannyaDataPokazu();
//				break;
//			case 0:
//				return;
//			default:
//				System.out.println("�� ���� ���� �����!!!");
//			}
//		}
//	}
//	
//	public static void poshycNazva() {
//		System.out.print("������ ����� ������ ��� ������: ");
//		String vvs = sc.next().toUpperCase();
//		String vvs1 = vvs.substring(0, 1).toUpperCase() + vvs.substring(1).toLowerCase();
//
//		Iterator<Sesion> iter = cinema.getSesions().iterator();
//		while (iter.hasNext()){
//			Sesion ses = iter.next();
//			if (ses.getFilm().getfName().equals(vvs1)){
//				System.out.println("���������: " + ses);
//				iter.toString();
//			} 
//		}
//	}
//	
//	public static void poshycDataPokazu() {
//		System.out.print("������ �� ������ ������ ��� ������: ");
//		int rik = sc.nextInt();
//		System.out.print("������ �����: ");
//		int mis = sc.nextInt();
//		System.out.print("������ �����: ");
//		int den = sc.nextInt();
//		Iterator<Sesion> iter = cinema.getSesions().iterator();
//		while (iter.hasNext()){
//			Sesion ses = iter.next();
//			if (ses.getDate().equals(LocalDate.of(rik, mis, den))){
//				System.out.println("���������: " + ses);
//				iter.toString();
//			} 
//		}
//	}
//	
//	public static void poshycDataVypusku() {
//		System.out.print("������ ���� ������� ������ ��� ������: ");
//		int vvs = sc.nextInt();
//		
//		Iterator<Sesion> iter = cinema.getSesions().iterator();
//		while (iter.hasNext()){
//			Sesion ses = iter.next();
//			if (ses.getFilm().getfYear() == vvs){
//				System.out.println("���������: " + ses);
//				iter.toString();
//			} 
//		}
//	}
//	
//	public static void poshycYakist() {
//		System.out.print("������ ����� ������ ��� ������: ");
//		String vvs = sc.next().toUpperCase();
//		String vvs1 = vvs.substring(0, 1).toUpperCase() + vvs.substring(1).toLowerCase();
//
//		Iterator<Sesion> iter = cinema.getSesions().iterator();
//		while (iter.hasNext()){
//			Sesion ses = iter.next();
//			if (ses.getFilm().getfQuality().equals(vvs1)){
//				System.out.println("���������: " + ses);
//				iter.toString();
//			} 
//		}
//	}


//	
//	public static void printMenuGuest() {
//		System.out.println("1 - ����� �� ��� ������");
//		System.out.println("2 - ����� �� ����");
//		System.out.println("3 - ����� �� ���� �������");
//		System.out.println("4 - ����� �� �����");
//		System.out.println("5 - ���������� �� ����");
//		System.out.println("6 - ���������� �� ���� �������");
//		System.out.println("7 - ���������� �� ��� ������");
//		System.out.println("0 - ������� ��������");
//		System.out.print("������ ��� ����: ");
//	}
//	

}
