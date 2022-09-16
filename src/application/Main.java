package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	static Furniture[] furniture = new Furniture[3];
	static Vehicle[] vehicle = new Vehicle[3];;
	static House[] house = new House[3];;
	static String[] line1;
	static String[] line2;
	static String[] line3;
	static String[] line4;
	static String[] line5;
	static String[] line6;

	static ArrayList<Object> reciept = new ArrayList<>();
	static int total = 0;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		General g = new General();

		File file = new File("C:\\Users\\Dawn Pratt\\eclipse-workspace\\Test\\src\\application\\input");
		String string = null;
		ArrayList<String> lines = new ArrayList<>();

		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("FIle not found");
		}
		while (scan.hasNext()) {
			string = (String) scan.next();
			lines.add(string);
		}
		line1 = lines.get(0).split(",");
		line2 = lines.get(1).split(",");
		line3 = lines.get(2).split(",");
		line4 = lines.get(3).split(",");
		line5 = lines.get(4).split(",");
		line6 = lines.get(5).split(",");
		for (int i = 0; i < line1.length; i++) {
			furniture[i] = new Furniture(line1[i], Integer.parseInt(line2[i]));
			vehicle[i] = new Vehicle(line3[i], Integer.parseInt(line4[i]));
			house[i] = new House(line5[i], Integer.parseInt(line6[i]));

		}
		// TODO Auto-generated method stub
		

		// System.out.println([]furniture.getName());

		try {
			FileWriter reciept = new FileWriter("C:\\Users\\Dawn Pratt\\eclipse-workspace\\Test\\src\\application\\reciept");
			reciept.write(Main.reciept + "\n" + Main.total);
			reciept.close();
			System.out.println("File Written Successfully");
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		launch(args);
	}
}
