package backend.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Pane tmpRoot = FXMLLoader.load(getClass().getResource("/backend/views/Main.fxml"));
		Scene tmpScene = new Scene(tmpRoot);
		primaryStage.setTitle("SIGCor");
		primaryStage.setScene(tmpScene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
