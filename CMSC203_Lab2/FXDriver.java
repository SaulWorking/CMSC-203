


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		
		final int xPos = 400;
		final int yPos = 400;
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		FXMainPane4 root = new FXMainPane4();
		
		
		stage.setScene(new Scene(root,xPos,yPos));
		
		//  set the scene to hold root
		//set stage title
		
		//  set the scene to hold root
		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
}
