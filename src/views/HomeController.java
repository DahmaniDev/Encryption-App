/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import encryption.*;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Dahmani
 */
public class HomeController implements Initializable {

    @FXML
    private TextField toEncryptTextField;
    @FXML
    private TextField toDecryptTextField;
    
    @FXML
    private Button encryptButton;
    @FXML
    private Button decryptButton;
    @FXML
    private TextField encryptResult;
    @FXML
    private TextField decryptResult;
    @FXML
    private Button emptyBt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void encryptOnClick(ActionEvent event) {
        if (event.getSource() == encryptButton) {
            //Value entered from TextField
            String value = toEncryptTextField.getText();
            //Value encrypted intialized
            String cipherText = "";

            Random rn = new Random();
            //Integer Key (First Key) 1-->4 Change it to 47-55-88-91
            int intKey = rn.nextInt(3 - 1 + 1) + 1;
            
            cipherText = encrypt(value, intKey);
            encryptResult.setText(cipherText);
        }
    }

    @FXML
    private void decryptOnClick(ActionEvent event) {
        String value = toDecryptTextField.getText();
        String cipherText="";
        if(value.charAt(3) == '4'){
            FourtySevenAlgorithm enc = new FourtySevenAlgorithm();
            cipherText = enc.decryptFourtySevenP(value);
        }else{
            if(value.charAt(3) == '5'){
                FiftyFiveAlgorithm enc = new FiftyFiveAlgorithm();
                cipherText = enc.decryptFiftyFiveP(value);
            } else {
                if(value.charAt(value.indexOf('.')+1) == '8'){
                    EightyEightAlgorithm enc = new EightyEightAlgorithm();
                    cipherText = enc.decryptEightyEightP(value);
                } else {
                  cipherText = "Error decrypting your entry";  
                }
            }
        }
        decryptResult.setText(cipherText);
    }

    private String encrypt(String value, int key) {
        //Insurance for success (The decryption result must have the same length)//Leave it later for database
        //int ln = value.length();
        switch(key){
            case 1 :
                FourtySevenAlgorithm enc47 = new FourtySevenAlgorithm();
                return enc47.encryptFourtySevenP(value);
            case 2 :
                FiftyFiveAlgorithm enc55 = new FiftyFiveAlgorithm();
                return enc55.encryptFiftyFiveP(value);
            case 3 :
                EightyEightAlgorithm enc88 = new EightyEightAlgorithm();
                return enc88.encryptEightyEightP(value);
            default :
                return "Error encrypting your entry";
        }
    }

    @FXML
    private void emptyFields(ActionEvent event) {
        toDecryptTextField.setText("");
        decryptResult.setText("");
    }

}
