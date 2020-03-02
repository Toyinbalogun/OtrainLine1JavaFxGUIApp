import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Line1 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane aPane = new Pane();

        //start location label
        Label StartLabel = new Label("Location:");
        StartLabel.relocate(20, 20);
        StartLabel.setPrefSize(80, 30);

        //combo box including all start stations
        ObservableList<String> StartLoc = FXCollections.observableArrayList(
                "Tunney's Pasture", "Bayview","Pimissi", "Lyon", "Parliament",
                "Rideau", "uOttawa", "Lees", "Hurdman", "Tremblay", "St-Laurent", "Cryville",
                "Blair"  );
        ComboBox StartCB = new ComboBox(StartLoc); //StartCB = StartLocations Combo Box
        StartCB.setValue("Please select your Location Station");
        StartCB.relocate(100,20);
        StartCB.setPrefSize(300,30);

        //destination location label
        Label DestinLabel = new Label("Destination:");
        DestinLabel.relocate(20, 60);
        DestinLabel.setPrefSize(80, 30);

        //combo box including all destination stations
        ObservableList<String> DestinLoc = FXCollections.observableArrayList(
                "Tunney's Pasture", "Bayview","Pimissi", "Lyon", "Parliament",
                "Rideau", "uOttawa", "Lees", "Hurdman", "Tremblay", "St-Laurent", "Cryville",
                "Blair"  );
        ComboBox DestinCB = new ComboBox(DestinLoc);  //DestinCB = DestinsationLocations Combo Box
        DestinCB.setValue("Please select your Destination Station");
        DestinCB.relocate(100,60);
        DestinCB.setPrefSize(300,30);

        //add go button
        Button goButton = new Button("Begin Trip");
        goButton.setStyle("-fx-font: 18 arial; -fx-base: GREEN; -fx-text-fill: rgb(255,255,255);");
        goButton.relocate(170, 100);
        goButton.setPrefSize(150, 30);


        // -fx-font tag- font size and foont type
        // -fx-base - background colour
        // -fx -text-fill - text colour

        //duration label
        Label DurationLabel = new Label("Trip Duration:");
        DurationLabel.relocate(20, 140);
        DurationLabel.setPrefSize(80, 30);

        //Duration textfield
        TextField DuraTextfield = new TextField();
        DuraTextfield.relocate(100, 140);
        DuraTextfield.setPrefSize(300, 30);

        //NumStops label
        Label NumStopsLabel = new Label("Num of Stops:");
        NumStopsLabel.relocate(20, 180);
        NumStopsLabel.setPrefSize(80, 30);

        //Numstops textfield
        TextField NumStopsTextfield = new TextField();
        NumStopsTextfield.relocate(100, 180);
        NumStopsTextfield.setPrefSize(300, 30);

        int time = 0;
        goButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                //tunneys to any location
                if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Bayview")||
                        StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stop");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Pimissi")||
                        StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Lyon")||
                        StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Parliament")||
                        StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Rideau")||
                        StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("10:00 mins");
                    NumStopsTextfield.setText("5 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("uOttawa")||
                        StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("12:00 mins");
                    NumStopsTextfield.setText("6 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Lees")||
                        StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("14:00 mins");
                    NumStopsTextfield.setText("7 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Hurdman")||
                        StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("16:00 mins");
                    NumStopsTextfield.setText("8 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("18:00 mins");
                    NumStopsTextfield.setText("9 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("20:00 mins");
                    NumStopsTextfield.setText("10 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("22:00 mins");
                    NumStopsTextfield.setText("11 stops");
                }
                else if (StartCB.getValue().equals("Tunney's Pasture") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Tunney's Pasture")){
                    DuraTextfield.setText("24:00 mins");
                    NumStopsTextfield.setText("12 stops");
                }

                //bayview to destination
                if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Pimissi")||
                        StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Lyon")||
                        StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Parliament")||
                        StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Rideau")||
                        StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("uOttawa")||
                        StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("10:00 mins");
                    NumStopsTextfield.setText("5 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Lees")||
                        StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("12:00 mins");
                    NumStopsTextfield.setText("6 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Hurdman")||
                        StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("14:00 mins");
                    NumStopsTextfield.setText("7 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("16:00 mins");
                    NumStopsTextfield.setText("8 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("18:00 mins");
                    NumStopsTextfield.setText("9 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("20:00 mins");
                    NumStopsTextfield.setText("10 stops");
                }
                else if (StartCB.getValue().equals("Bayview") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Bayview")){
                    DuraTextfield.setText("22:00 mins");
                    NumStopsTextfield.setText("11 stops");
                }

                //Pimissi to destination
                if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Lyon")||
                        StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Parliament")||
                        StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Rideau")||
                        StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("uOttawa")||
                        StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Lees")||
                        StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("10:00 mins");
                    NumStopsTextfield.setText("5 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Hurdman")||
                        StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("12:00 mins");
                    NumStopsTextfield.setText("6 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("14:00 mins");
                    NumStopsTextfield.setText("7 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("16:00 mins");
                    NumStopsTextfield.setText("8 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("18:00 mins");
                    NumStopsTextfield.setText("9 stops");
                }
                else if (StartCB.getValue().equals("Pimissi") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Pimissi")){
                    DuraTextfield.setText("20:00 mins");
                    NumStopsTextfield.setText("10 stops");
                }

                //Lyon to destination
                if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Parliament")||
                        StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Rideau")||
                        StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("uOttawa")||
                        StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Lees")||
                        StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }
                else if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Hurdman")||
                        StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("10:00 mins");
                    NumStopsTextfield.setText("5 stops");
                }
                else if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("12:00 mins");
                    NumStopsTextfield.setText("6 stops");
                }
                else if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("14:00 mins");
                    NumStopsTextfield.setText("7 stops");
                }
                else if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("16:00 mins");
                    NumStopsTextfield.setText("8 stops");
                }
                else if (StartCB.getValue().equals("Lyon") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Lyon")){
                    DuraTextfield.setText("18:00 mins");
                    NumStopsTextfield.setText("9 stops");
                }

                //Parliament to destination
                if (StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Rideau")||
                        StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Parliament")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("uOttawa")||
                        StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Parliament")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Lees")||
                        StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Parliament")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Hurdman")||
                        StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Parliament")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }
                else if (StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Parliament")){
                    DuraTextfield.setText("10:00 mins");
                    NumStopsTextfield.setText("5 stops");
                }
                else if (StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Parliament")){
                    DuraTextfield.setText("12:00 mins");
                    NumStopsTextfield.setText("6 stops");
                }
                else if (StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Parliament")){
                    DuraTextfield.setText("14:00 mins");
                    NumStopsTextfield.setText("7 stops");
                }
                else if (StartCB.getValue().equals("Parliament") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Parliament")){
                    DuraTextfield.setText("16:00 mins");
                    NumStopsTextfield.setText("8 stops");
                }

                //Rideau to destination
                if (StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("uOttawa")||
                        StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Rideau")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Lees")||
                        StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Rideau")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Hurdman")||
                        StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Rideau")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Rideau")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }
                else if (StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Rideau")){
                    DuraTextfield.setText("10:00 mins");
                    NumStopsTextfield.setText("5 stops");
                }
                else if (StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Rideau")){
                    DuraTextfield.setText("12:00 mins");
                    NumStopsTextfield.setText("6 stops");
                }
                else if (StartCB.getValue().equals("Rideau") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Rideau")){
                    DuraTextfield.setText("14:00 mins");
                    NumStopsTextfield.setText("7 stops");
                }

                //uOttawa to destination
                if (StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Lees")||
                        StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("uOttawa")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Hurdman")||
                        StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("uOttawa")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("uOttawa")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("uOttawa")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }
                else if (StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("uOttawa")){
                    DuraTextfield.setText("10:00 mins");
                    NumStopsTextfield.setText("5 stops");
                }
                else if (StartCB.getValue().equals("uOttawa") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("uOttawa")){
                    DuraTextfield.setText("12:00 mins");
                    NumStopsTextfield.setText("6 stops");
                }

                //Lees to destination
                if (StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Hurdman")||
                        StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Lees")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Lees")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Lees")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Lees")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }
                else if (StartCB.getValue().equals("Lees") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Lees")){
                    DuraTextfield.setText("10:00 mins");
                    NumStopsTextfield.setText("5 stops");
                }


                //Hurdman to destination
                if (StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Tremblay")||
                        StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Hurdman")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Hurdman")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Hurdman")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }
                else if (StartCB.getValue().equals("Hurdman") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Hurdman")){
                    DuraTextfield.setText("8:00 mins");
                    NumStopsTextfield.setText("4 stops");
                }

                //Tremblay to destination
                if (StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("St-Laurent")||
                        StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Tremblay")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Tremblay")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }
                else if (StartCB.getValue().equals("Tremblay") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Tremblay")){
                    DuraTextfield.setText("6:00 mins");
                    NumStopsTextfield.setText("3 stops");
                }


                //St-Laurent to destination
                if (StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Cryville")||
                        StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("St-Laurent")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
                else if (StartCB.getValue().equals("St-Laurent") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("St-Laurent")){
                    DuraTextfield.setText("4:00 mins");
                    NumStopsTextfield.setText("2 stops");
                }

                //Cryville to destination
                if (StartCB.getValue().equals("Cryville") && DestinCB.getValue().equals("Blair")||
                        StartCB.getValue().equals("Blair") && DestinCB.getValue().equals("Cryville")){
                    DuraTextfield.setText("2:00 mins");
                    NumStopsTextfield.setText("1 stops");
                }
            }
        });


        aPane.getChildren().addAll(StartLabel, StartCB, DestinLabel, DestinCB, goButton, DurationLabel, DuraTextfield, NumStopsLabel,NumStopsTextfield);

        //test to get selected val from combo box printed on
        StartCB.setOnAction(e -> System.out.println( StartCB.getValue()));
        DestinCB.setOnAction(e -> System.out.println( DestinCB.getValue()));


        primaryStage.setTitle("Line1 OTrain Transit"); // Set title of window
        primaryStage.setResizable(false); // Make it non-resizable
        primaryStage.setScene(new Scene(aPane, 400,220)); // Set size of window
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

