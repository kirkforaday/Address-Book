package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EntryController {
    @FXML
    private TableView<Entry> entryTable;
    @FXML
    private TableColumn<Entry, String> firstNameColumn;
    @FXML
    private TableColumn<Entry, String> lastNameColumn;
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label phoneNumberLabel;
    @FXML
    private Label emailAddressLabel;

    public Main main;


    public EntryController() {
    }

    private void initialize() {
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }
    public void setMain(Main main) {
        this.main = main;
        entryTable.setItems(main.getEntryData());
    }
    private void showInfo(Entry entry){
        if (entry != null) {
            firstNameLabel.setText(entry.getFirstName());
            lastNameLabel.setText(entry.getLastName());
            phoneNumberLabel.setText(Integer.toString(entry.getPhoneNumber()));
            emailAddressLabel.setText(entry.getEmailAddress());
        } else {
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            phoneNumberLabel.setText("");
            emailAddressLabel.setText("");
        }
    }
}
