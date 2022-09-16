package application;

	import java.util.Scanner;
	import javafx.fxml.FXML;
	import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

	public class General {
	private String name;
	private int price;
	

    @FXML
    private Label showReceipt;


    public Label getShowReceipt() {
		return showReceipt;
	}

	public void setShowReceipt(Label showReceipt) {
		this.showReceipt = showReceipt;
	}

	@FXML
    private Button Cars;

    @FXML
    private Button Furnitures;

    @FXML
    private Button Houses;
    
    @FXML
    private Button RC;
    
    @FXML
    private Label Welcome;
    
    @FXML
    private BorderPane borderpane;

    @FXML
    void openCars(ActionEvent event) {
    Loading l= new Loading();
    Pane p=l.getPage("CScreen.fxml");
    borderpane.setCenter(p);
    }

    @FXML
    void openFurniture(ActionEvent event) {
    	Loading l= new Loading();
        Pane p=l.getPage("FScreen.fxml");
        borderpane.setCenter(p);
    }

    @FXML
    void openHouses(ActionEvent event) {
    	Loading l= new Loading();
        Pane p=l.getPage("HScreen.fxml");
        borderpane.setCenter(p);
    }
    
   
    
    @FXML
    void showReciept(ActionEvent event) {
    	System.out.println(Main.reciept);
    	Loading l= new Loading();
        Pane p=l.getPage("Rc.fxml");
        borderpane.setCenter(p);
        Receipt r= new Receipt();
    	
    }
    
	Scanner scan = new Scanner(System.in);

	public General(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public General() {
		
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}





	public void display() {
		
		System.out.println("Welcome");
		System.out.println("We offer Multiple Services");
		System.out.println("Enter (1) For Furniture,Enter (2) For Vehicles, Enter (3) For Houses");
		System.out.println("Enter any other Number to end and Display Reciept");
		int input=scan.nextInt();
		
		switch(input) {
		case 1 : Furniture.displayFurniture();
		break;
		
		case 2 : Vehicle.displayVehicle();
		break;
		
		case 3 : House.displayHouse();
		break;
		
		default: System.out.println(Main.reciept+"\n"+Main.total);
		

		break;

		
		
		
		}

	}
	}


