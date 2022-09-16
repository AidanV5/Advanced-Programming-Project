package application;



	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Iterator;

	import javafx.fxml.FXML;
	import javafx.scene.control.Label;

	public class Receipt extends General {
		public Receipt() {
			super();
			// TODO Auto-generated constructor stub
		}

	    @FXML
	    private Label showReceipt;
		
		public Label getShowReceipt() {
			return showReceipt;
		}

		public void setShowReceipt(Label showReceipt) {
			this.showReceipt = showReceipt;
		}

		public void initialize() {

			FileWriter writer = null;
			try {
				writer = new FileWriter("C:\\Users\\Dawn Pratt\\eclipse-workspace\\Test\\src\\application\\reciept");

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.err.println("The receipt file is not found");

			}

			if (Main.reciept.isEmpty() == false) {
				String list="\n";
				for(int i=0;i<Main.reciept.size();i++) {
					
					list+=Main.reciept.get(i)+"\n";
				}
				showReceipt.setText("You have selected the following services" + " " +list
						+ "\nYour total is: D" + Main.total);
				
				System.out.println("You have selected the following services" + " " + Main.reciept
						+ "\nYour total is: D" + Main.total);
				try {
					writer.write(Main.reciept.toString() + "\nYour total is: D" + Main.total);
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else {
				showReceipt.setText("You have not selected any service");
				System.out.println("You have not selected any service");

			}
		 }
		
	}


