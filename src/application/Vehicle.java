package application;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Vehicle extends General {
	 	@FXML
	    private ImageView Audi;

	    @FXML
	    private ImageView BMW;

	    @FXML
	    private ImageView Benz;

	
	@FXML
    private Button addAudi;

    @FXML
    private Button addBMW;

    @FXML
    private Button addBenz;

    @FXML
    void addToAudi(ActionEvent event) {
    	Main.reciept.add(Main.vehicle[0].getName());
		Main.reciept.add(Main.vehicle[0].getPrice());
		Main.total += Main.vehicle[0].getPrice();
    }

    @FXML
    void addToBMW(ActionEvent event) {
    	Main.reciept.add(Main.vehicle[1].getName());
		Main.reciept.add(Main.vehicle[1].getPrice());
		Main.total += Main.vehicle[1].getPrice();
    }

    @FXML
    void addToBenz(ActionEvent event) {
    	Main.reciept.add(Main.vehicle[2].getName());
		Main.reciept.add(Main.vehicle[2].getPrice());
		Main.total += Main.vehicle[2].getPrice();
    }

	static Main main = new Main();
	static General general = new General();
	static Scanner scan = new Scanner(System.in);


	public Vehicle(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public static void displayVehicle() {
		for (int i = 0;i<Main.vehicle.length ; i++) {
			System.out.println(i + 1 + ") " + Main.vehicle[i].getName());
		}
		int input = scan.nextInt();

		switch (input) {
		case 1:
			Main.reciept.add(Main.vehicle[0].getName());
			Main.reciept.add(Main.vehicle[0].getPrice());
			Main.total += Main.vehicle[0].getPrice();
general.display();
			break;

		case 2:
			Main.reciept.add(Main.vehicle[1].getName());
			Main.reciept.add(Main.vehicle[1].getPrice());
			Main.total += Main.vehicle[1].getPrice();
			general.display();

			break;

		case 3:
			Main.reciept.add(Main.vehicle[2].getName());
			Main.reciept.add(Main.vehicle[2].getPrice());
			Main.total += Main.vehicle[2].getPrice();
			general.display();

			break;
			

		}

	
	}
}
