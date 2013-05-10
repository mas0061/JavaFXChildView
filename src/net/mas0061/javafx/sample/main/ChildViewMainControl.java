package net.mas0061.javafx.sample.main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import net.mas0061.javafx.sample.child.ChildView;

public class ChildViewMainControl implements Initializable {

  @FXML
  private Button childButton;

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
  }

  @FXML
  protected void child(ActionEvent event) {
	  ChildView childScreen = new ChildView();
	  Stage stage = new Stage();
	  childScreen.start(stage);
  }

}
