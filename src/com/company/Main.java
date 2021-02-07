package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage primaryStage;
    private BorderPane root;

    private final ObservableList< Entry > entryData = FXCollections.observableArrayList();

    public Main() {
        entryData.add(new Entry("Ryan", "Kirk"));
        entryData.add(new Entry("Sawyer", "Test"));
        entryData.add(new Entry("Josh", "Test"));
        entryData.add(new Entry("Lila", "Test"));
        entryData.add(new Entry("Erik", "Test"));
    }
    public ObservableList<Entry> getEntryData() {
        return entryData;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Address Book");

        thisIsMyLayoutFunction();
        showEntry();
    }

    public void thisIsMyLayoutFunction() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Root.fxml"));
        root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showEntry() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EntryDisplay.fxml"));
        AnchorPane loadEntry = loader.load();
        root.setCenter(loadEntry);
        EntryController controller = loader.getController();
        controller.setMain(this);
    }

    public static void main(String[] args) {
        launch(args);
    }
}