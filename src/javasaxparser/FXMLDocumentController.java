/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasaxparser;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import javafx.stage.FileChooser;
import java.io.File;
/**
 *
 * @author moe
 */
public class FXMLDocumentController implements Initializable {
    Stage stage;
    
    public void ready(Stage stage) {
        this.stage = stage;
    }
    
    @FXML
    private void buttonOpenFile(ActionEvent event) throws Exception {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open XML File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml"));
        File file = fileChooser.showOpenDialog(stage);
        
        XMLNode root = XMLParser.parse(file);
        System.out.println(root);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
}
