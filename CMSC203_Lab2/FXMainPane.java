


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	
	

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button b1, b2, b3, b4, b5, b6;
	Label textLabel;
	TextField textField;
	HBox hb1, hb2;

	//student Task #4:
	//  declare an instance of DataManager
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	DataManager data;
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	public class ButtonHandler implements EventHandler<ActionEvent> {
		
		public void handle(ActionEvent event) {
			
			if(event.getTarget() == b1) {
					textField.setText(data.getHello());
			}else if(event.getTarget() == b2) {
					textField.setText(data.getHowdy());
			}else if(event.getTarget() == b3) {
					textField.setText(data.getChinese());
			}else if(event.getTarget() == b4) {
					textField.setText("");
			}else if(event.getTarget() == b5) {
				Platform.exit(); 
				System.exit(0); 
			}else if(event.getTarget() == b6) {
				textField.setText(data.helloInAlbanian());
			}
		}
	}
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		b1 = new Button("Hello");
		b1.setOnAction(new ButtonHandler());
		
		b2 = new Button("Howdy");
		b2.setOnAction(new ButtonHandler());

		b3 = new Button("Chinese");
		b3.setOnAction(new ButtonHandler());

		b4 = new Button("Clear");
		b4.setOnAction(new ButtonHandler());
		
		b5 = new Button("Exit");
		b5.setOnAction(new ButtonHandler());
		
		b6 = new Button("Albanian Hello");
		b6.setOnAction(new ButtonHandler());
			
		textLabel = new Label("Feedback");
		textField = new TextField();
		hb1 = new HBox();
		hb2 = new HBox();
		
		hb1.setAlignment(Pos.CENTER);
		hb2.setMargin(b1, new Insets(15,5,0,5));
		hb2.setMargin(b2, new Insets(15,5,0,5));
		hb2.setMargin(b3, new Insets(15,5,0,5));
		hb2.setMargin(b4, new Insets(15,5,0,5));
		hb2.setMargin(b5, new Insets(15,5,0,5));
		hb2.setMargin(b6, new Insets(15,5,0,5));
		

		hb2.setAlignment(Pos.CENTER);
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		data = new DataManager();
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		hb1.getChildren().addAll(textLabel, textField);
		hb2.getChildren().addAll(b1,b2,b3,b4,b5,b6);
		
		getChildren().addAll(hb1,hb2);
		
		
	}
	

}
	
