package com.melissadata.globalip.view;

// import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import com.melissadata.globalip.Main;
import com.melissadata.globalip.model.GlobalIPTransaction;

public class GlobalIPController {

    private Main main;

    private GlobalIPTransaction Transaction;

    @FXML
    private Button buttonSend;
    @FXML
    private Button buttonClear;
    @FXML
    private TabPane tabPane;

    @FXML
    private TextField inputLicenseKeyText;
    @FXML
    private TextField inputIPText;

    @FXML
    private TextArea RequestTextArea;
    @FXML
    private TextArea ResponseTextArea;

    /**
     * The constructor. The constructor is called before the initialize()
     * method.
     */
    public GlobalIPController() {
        Transaction = new GlobalIPTransaction();
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        initializeTextFields();
        sendButtonAction();
        clearButtonAction();
        updateRequestText();
    }

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * //@param mainApp
     */
    public void setMainApp(Main main) {
        this.main = main;
    }

    public void sendButtonAction() {
        buttonSend.setOnAction((event) -> {
            ResponseTextArea.setText(Transaction.processTransaction(RequestTextArea.getText()));
        });
    }

    public void clearButtonAction(){
        buttonClear.setOnAction((event) -> {
            inputIPText.clear();
        });
    }

    public void initializeTextFields(){
        inputLicenseKeyText.textProperty().addListener((observable, oldvalue, newvalue) -> {
            Transaction.setIdentNumber(newvalue);
            updateRequestText();
        });

        inputIPText.textProperty().addListener((observable, oldvalue, newvalue) -> {
            Transaction.setIp(newvalue);
            updateRequestText();
        });

    }

    private void updateRequestText(){
        RequestTextArea.setText(Transaction.generateRequestString());
    }

    public TextField getInputLicenseKeyText() {
        return inputLicenseKeyText;
    }

    public void setInputLicenseKeyText(TextField inputLicenseKeyText) {
        this.inputLicenseKeyText = inputLicenseKeyText;
    }

    public TextField getInputEmailText() {
        return inputIPText;
    }

    public void setInputEmailText(TextField inputIPText) {
        this.inputIPText = inputIPText;
    }



}
