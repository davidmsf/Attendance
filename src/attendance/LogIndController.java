/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Hussain
 */
public class LogIndController implements Initializable {
    
    @FXML
    private Hyperlink hyperLinkGlemtAdgangskode;
    @FXML
    private JFXTextField txtFieldBrugernavn;
    @FXML
    private JFXTextField txtFieldAdgangskode;
    @FXML
    private JFXButton btnLogInd;
    @FXML
    private ImageView imageViewEASV;
    @FXML
    private AnchorPane anchorPane;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        loadImageEasv();
        // TODO
    }    
    
    /**
     * Log ind button
     * @param event 
     */
    @FXML
    private void logInd(ActionEvent event) 
    {
        System.out.println("faf");
    }
    /**
     * Image to be viewed, EASV.
     */
    private void loadImageEasv()
    {
        Image easvImage = new Image("resources/images/ea-sydvest-logo.png");    
        imageViewEASV.setImage(easvImage);
    }
    
}
