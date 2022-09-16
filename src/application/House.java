package application;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class House extends General  {
	
	 @FXML
	    private ImageView Colonial;

	    @FXML
	    private ImageView Loft;

	    @FXML
	    private ImageView Modern;
	    
	@FXML
    private Button addColonial;

    @FXML
    private Button addLoft;

    @FXML
    private Button addModern;

    @FXML
    void addToColonial(ActionEvent event) {
    	Main.reciept.add(Main.house[0].getName());
		Main.reciept.add(Main.house[0].getPrice());
		Main.total += Main.house[0].getPrice();
    }

    @FXML
    void addToLoft(ActionEvent event) {
    	Main.reciept.add(Main.house[1].getName());
		Main.reciept.add(Main.house[1].getPrice());
		Main.total += Main.house[1].getPrice();
    }

    @FXML
    void addToModern(ActionEvent event) {
    	Main.reciept.add(Main.house[2].getName());
		Main.reciept.add(Main.house[2].getPrice());
		Main.total += Main.house[2].getPrice();
    }
    
	static Main main = new Main();
	static General general = new General();
	static Scanner scan = new Scanner(System.in);

	

	public House(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	
	public House() {
		// TODO Auto-generated constructor stub
	}

	public static void displayHouse() {
		for (int i = 0;i<Main.house.length ; i++) {
			System.out.println(i + 1 +  ") " + Main.house[i].getName());
		}
		int input = scan.nextInt();

		switch (input) {
		case 1:
			Main.reciept.add(Main.house[0].getName());
			Main.reciept.add(Main.house[0].getPrice());
			Main.total += Main.house[0].getPrice();
general.display();
			break;

		case 2:
			Main.reciept.add(Main.house[1].getName());
			Main.reciept.add(Main.house[1].getPrice());
			Main.total += Main.house[1].getPrice();
			general.display();

			break;

		case 3:
			Main.reciept.add(Main.house[2].getName());
			Main.reciept.add(Main.house[2].getPrice());
			Main.total += Main.house[2].getPrice();
			general.display();

			break;
			

		}

	}
}