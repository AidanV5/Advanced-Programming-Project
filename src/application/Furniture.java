package application;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Furniture extends General {
	
	@FXML
	private ImageView Bed;

	@FXML
	private ImageView Chair;

	@FXML
	private ImageView Table;
	    
	@FXML
    private Button addBed;

    @FXML
    private Button addChair;

    @FXML
    private Button addTable;

    @FXML
    void addToBed(ActionEvent event) {
    	Main.reciept.add(Main.furniture[0].getName());
		Main.reciept.add(Main.furniture[0].getPrice());
		Main.total += Main.furniture[0].getPrice();
    }

    @FXML
    void addToChair(ActionEvent event) {
    	Main.reciept.add(Main.furniture[1].getName());
		Main.reciept.add(Main.furniture[1].getPrice());
		Main.total += Main.furniture[1].getPrice();
    }

    @FXML
    void addToTable(ActionEvent event) {
    	Main.reciept.add(Main.furniture[2].getName());
		Main.reciept.add(Main.furniture[2].getPrice());
		Main.total += Main.furniture[2].getPrice();
    }
	static Main main = new Main();
	static General general = new General();
	static Scanner scan = new Scanner(System.in);

	public Furniture(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public Furniture() {
		// TODO Auto-generated constructor stub
	}

	public static void displayFurniture() {
		for (int i = 0; i < Main.furniture.length; i++) {
			System.out.println(i + 1 + ") " + Main.furniture[i].getName());
		}
		int input = scan.nextInt();

		switch (input) {
		case 1:
			Main.reciept.add(Main.furniture[0].getName());
			Main.reciept.add(Main.furniture[0].getPrice());
			Main.total += Main.furniture[0].getPrice();
general.display();
			break;

		case 2:
			Main.reciept.add(Main.furniture[1].getName());
			Main.reciept.add(Main.furniture[1].getPrice());
			Main.total += Main.furniture[1].getPrice();
			general.display();

			break;

		case 3:
			Main.reciept.add(Main.furniture[2].getName());
			Main.reciept.add(Main.furniture[2].getPrice());
			Main.total += Main.furniture[2].getPrice();
			general.display();

			break;
			

		}

	}

}
