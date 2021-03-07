package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application
{
    private HBox hBox;
    private VBox vBox;
    private Button btn1, btn2, btn3;
    private BorderPane bPane;
    private FlowPane fPane;
    private GridPane gPane;
    private AnchorPane aPane;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        CrearUI();
        primaryStage.setTitle("Proyecto de Clase TAP 2021");
        primaryStage.setScene(new Scene(fPane, 600, 500));
        primaryStage.show();
    }

    private void CrearUI()
    {
        btn1 = new Button("Botón 1");
        btn2 = new Button("Botón 2");
        btn3 = new Button("Botón 3");

        btn1.setPrefWidth(100);
        btn2.setPrefHeight(100);
        btn3.setPrefSize(75,75);

        btn1.setStyle("-fx-background-color: #ABCDEF;");
        btn2.setStyle("-fx-background-color: #CDEFAB;");
        btn3.setStyle("-fx-background-color: #EFABCD;");

        /*hBox = new HBox();
        vBox = new VBox();

        hBox.getChildren().addAll(btn1,btn2,btn3);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(20,20,20,20));

        vBox.getChildren().addAll(btn1,btn2,btn3);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20));

        bPane = new BorderPane();
        bPane.setTop(new Label("Top"));
        bPane.setBottom(new Label("Bottom"));
        bPane.setLeft(new Label("Left"));
        bPane.setRight(new Label("Right"));
        bPane.setCenter(new Label("Center"));*/

        fPane = new FlowPane(Orientation.VERTICAL);
        fPane.getChildren().addAll(btn1,btn2,btn3);
        fPane.setPadding(new Insets(10));
        fPane.setVgap(10);

        /*gPane = new GridPane();
        gPane.add(new Label("(0,0)"),0,0);
        gPane.add(new Label("(0,2)"),0,2);
        gPane.add(new Label("(1,1)"),1,1);
        gPane.add(new Label("(2,0)"),2,0);
        gPane.add(new Label("(2,2)"),2,2);
        gPane.setPadding(new Insets(20));
        gPane.setVgap(10);
        gPane.setHgap(20);

        aPane = new AnchorPane();
        AnchorPane.setTopAnchor(btn1,10.0);
        AnchorPane.setLeftAnchor(btn1,10.0);
        AnchorPane.setTopAnchor(btn2,20.0);
        AnchorPane.setRightAnchor(btn2,20.0);
        AnchorPane.setBottomAnchor(btn3,15.0);
        AnchorPane.setLeftAnchor(btn3,120.0);
        aPane.getChildren().addAll(btn1,btn2,btn3);*/
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}