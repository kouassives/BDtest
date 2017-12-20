package gest;

import java.util.Scanner;

import connection.ControleConnexion;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		Scanner sc = new Scanner(System.in);
		String user="root";
		String MDP="toor";
		if (ControleConnexion.controle(user, MDP))
			if (ControleConnexion.getControleConnexion())
			{
				try {
					ControleConnexion.transfertDonnees();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		sc.close();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
