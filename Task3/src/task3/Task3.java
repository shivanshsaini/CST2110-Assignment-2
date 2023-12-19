/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.awt.Panel;
import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 *
 * @author Anonymous
 */
public class Task3 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        btn.setTranslateX(80);
        btn.setTranslateY(20);
        StackPane root = new StackPane();
        //root.setTranslateX(300);
        //root.setTranslateY(250);
        root.setBorder(Border.EMPTY);
        //root.setBackground(new Background(new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        initialize(root);
        

        Scene scene = new Scene(root, 900, 660);

        primaryStage.setTitle("Smart App");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static void initialize(StackPane root) {
        try {
            //the image
            String dir = System.getProperty("user.dir");
            String path1 = dir + "\\src\\task3.PNG";
            String path_i = dir + "\\src\\images\\";
            File file = new File(path1);
            File file1 = new File(path_i);
            System.out.println("Path: " + file.getAbsolutePath());
            String path = file.toURI().toString();
            String pathi = file1.toURI().toString();
            AnchorPane pnl = new AnchorPane();
            AnchorPane pnm = new AnchorPane();
            double width = root.getWidth();

            double height = root.getHeight();
            width = 600;
            height = 250;

            System.out.println("height: " + height);
            double x = -width / 2 + 5, y = -height / 2 - 20;

            //now the pane
            //y = y+50;
            root.setBorder(Border.EMPTY);
            javafx.scene.layout.AnchorPane ap = new AnchorPane();
            //javafx.scene.layout.Pane pnl = new Pane();
            //pn.getChildren().add(cir8);
            pnl.setTranslateX(x);
            System.out.println("setting Y = " + y);
            pnl.setTranslateY(y);
            pnl.setMaxWidth(300);
            pnl.setMaxHeight(302);
            pnl.setBorder(new Border(new BorderStroke(Color.DARKGREY,
                    BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

            //end left pane
            //right/main pane
            pnm.setTranslateX(x + 430);
            System.out.println("setting Y = " + y);
            pnm.setTranslateY(y + 160);
            pnm.setMaxWidth(510);
            pnm.setMaxHeight(620);
            pnm.setBorder(new Border(new BorderStroke(Color.DARKGREY,
                    BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            //now the pane bottom
            double resety = y;
            y = y + 310;
            root.setBorder(Border.EMPTY);
            javafx.scene.layout.AnchorPane pnb = new AnchorPane();
            //pn.getChildren().add(cir8);
            pnb.setTranslateX(x);
            System.out.println("setting Y = " + y);
            pnb.setTranslateY(y);
            pnb.setMaxWidth(300);
            pnb.setMaxHeight(302);
            //pnb.setBackground(new Background(new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            pnb.setBorder(new Border(new BorderStroke(Color.DARKGREY,
                    BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            //end bottom pane

            y = resety;

            //lbl.setTranslateX(x);
            //lbl.setTranslateY(y);
            y = 20.0;
            x = 20;
            ObservableList list = pnl.getChildren();
            Label labelLighting = new Label("Lighting");
            labelLighting.setStyle("-fx-font-weight: bold; -fx-font-size: 18px");
            AnchorPane.setTopAnchor(labelLighting, y);
            AnchorPane.setLeftAnchor(labelLighting, x);
            Slider sliderhall = new Slider();
            sliderhall.setMax(255);
            sliderhall.setValue(255);
            sliderhall.setMaxWidth(100);
            list.addAll(labelLighting);

            y += 30;
            x = 20;
            Label lbl = new Label("Hall");
            //the circle
            Circle cir2 = new Circle(10, 10, 10);
            cir2.setStroke(Color.SEAGREEN);
            Image im = new Image(path, false);
            cir2.setFill(Color.web("ffffff"));
            cir2.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

            AnchorPane.setTopAnchor(lbl, y);
            AnchorPane.setLeftAnchor(lbl, x);
            AnchorPane.setTopAnchor(sliderhall, y);
            AnchorPane.setLeftAnchor(sliderhall, x + 80 + 20);
            AnchorPane.setTopAnchor(cir2, y);
            AnchorPane.setLeftAnchor(cir2, x + 100 + 120);

            list.addAll(cir2, sliderhall, lbl);

            Label lbl2 = new Label("Kitchen");
            Slider sliderkitchen = new Slider();
            sliderkitchen.setMax(255);
            sliderkitchen.setMaxWidth(100);
            sliderkitchen.setValue(255);
            Circle cir3 = new Circle(x, y / 2, 10);
            cir3.setStroke(Color.SEAGREEN);
            cir3.setFill(Color.web("ffffff"));
            cir3.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
            y += 30;
            AnchorPane.setTopAnchor(lbl2, y);
            AnchorPane.setLeftAnchor(lbl2, x);
            AnchorPane.setTopAnchor(sliderkitchen, y);
            AnchorPane.setLeftAnchor(sliderkitchen, x + 80 + 20);
            AnchorPane.setTopAnchor(cir3, y);
            AnchorPane.setLeftAnchor(cir3, x + 100 + 120);
            list.addAll(lbl2, sliderkitchen, cir3);

            Label lbl3 = new Label("Dinning Room");
            Slider sliderdinning = new Slider();
            sliderdinning.setMaxWidth(100);
            sliderdinning.setMax(255);
            sliderdinning.setValue(255);
            Circle cir4 = new Circle(x, y / 2, 10);
            cir4.setStroke(Color.SEAGREEN);
            cir4.setFill(Color.web("ffffff"));
            cir4.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
            y += 30;
            AnchorPane.setTopAnchor(lbl3, y);
            AnchorPane.setLeftAnchor(lbl3, x);
            AnchorPane.setTopAnchor(sliderdinning, y);
            AnchorPane.setLeftAnchor(sliderdinning, x + 80 + 20);
            AnchorPane.setTopAnchor(cir4, y);
            AnchorPane.setLeftAnchor(cir4, x + 100 + 120);
            list.addAll(lbl3, sliderdinning, cir4);

            Label lbl4 = new Label("Living Room");
            Slider sliderLiving = new Slider();
            sliderLiving.setMaxWidth(100);
            sliderLiving.setMax(255);
            sliderLiving.setValue(255);
            Circle cir5 = new Circle(x, y / 2, 10);
            cir5.setStroke(Color.SEAGREEN);
            cir5.setFill(Color.web("ffffff"));
            cir5.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
            y += 30;
            AnchorPane.setTopAnchor(lbl4, y);
            AnchorPane.setLeftAnchor(lbl4, x);
            AnchorPane.setTopAnchor(sliderLiving, y);
            AnchorPane.setLeftAnchor(sliderLiving, x + 80 + 20);
            AnchorPane.setTopAnchor(cir5, y);
            AnchorPane.setLeftAnchor(cir5, x + 100 + 120);
            list.addAll(lbl4, sliderLiving, cir5);

            Label lbl5 = new Label("Landing");
            Slider sliderLanding = new Slider();
            sliderLanding.setMaxWidth(100);
            sliderLanding.setMax(255);
            sliderLanding.setValue(255);
            Circle cir6 = new Circle(x, y / 2, 10);
            cir6.setStroke(Color.SEAGREEN);
            cir6.setFill(Color.web("ffffff"));
            cir6.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
            y += 30;
            AnchorPane.setTopAnchor(lbl5, y);
            AnchorPane.setLeftAnchor(lbl5, x);
            AnchorPane.setTopAnchor(sliderLanding, y);
            AnchorPane.setLeftAnchor(sliderLanding, x + 80 + 20);
            AnchorPane.setTopAnchor(cir6, y);
            AnchorPane.setLeftAnchor(cir6, x + 100 + 120);
            list.addAll(lbl5, sliderLanding, cir6);

            Label lbl6 = new Label("Bedroom 1");
            Slider sliderBed1 = new Slider();
            sliderBed1.setMaxWidth(100);
            sliderBed1.setMax(255);
            sliderBed1.setValue(255);
            Circle cir7 = new Circle(x, y / 2, 10);
            cir7.setStroke(Color.SEAGREEN);
            cir7.setFill(Color.web("ffffff"));
            cir7.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
            y += 30;
            AnchorPane.setTopAnchor(lbl6, y);
            AnchorPane.setLeftAnchor(lbl6, x);
            AnchorPane.setTopAnchor(sliderBed1, y);
            AnchorPane.setLeftAnchor(sliderBed1, x + 80 + 20);
            AnchorPane.setTopAnchor(cir7, y);
            AnchorPane.setLeftAnchor(cir7, x + 100 + 120);
            list.addAll(lbl6, sliderBed1, cir7);

            Label lbl7 = new Label("Bedroom 2");
            Slider sliderBed2 = new Slider();
            sliderBed2.setMaxWidth(100);
            sliderBed2.setMax(255);
            sliderBed2.setValue(255);
            Circle cir8 = new Circle(x, y / 2, 10);
            cir8.setStroke(Color.SEAGREEN);
            cir8.setFill(Color.web("ffffff"));
            cir8.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
            y += 30;
            AnchorPane.setTopAnchor(lbl7, y);
            AnchorPane.setLeftAnchor(lbl7, x);
            AnchorPane.setTopAnchor(sliderBed2, y);
            AnchorPane.setLeftAnchor(sliderBed2, x + 80 + 20);
            AnchorPane.setTopAnchor(cir8, y);
            AnchorPane.setLeftAnchor(cir8, x + 100 + 120);
            list.addAll(lbl7, sliderBed2, cir8);

            //end of the top pane
            //bottom pane
            y = 20;
            Label labelHeating = new Label("Central Heating");
            AnchorPane.setTopAnchor(labelHeating, y);
            AnchorPane.setLeftAnchor(labelHeating, x);
            labelHeating.setStyle("-fx-font-weight: bold; -fx-font-size: 18px");

            y += 30;
            double slidertop = y;
            double sliderheight = 150;
            double sliderleft = x + 80 + 20;
            Slider slider = new Slider();
            slider.setOrientation(Orientation.VERTICAL);
            slider.setMax(30);
            slider.setValue(15);
            slider.setMaxHeight(sliderheight + 15);//for the zero label
            slider.setMinHeight(sliderheight + 15);
            AnchorPane.setTopAnchor(slider, slidertop);
            AnchorPane.setLeftAnchor(slider, sliderleft);

            RadioButton radio1 = new RadioButton();
            radio1.setText("Off");

            AnchorPane.setTopAnchor(radio1, y);
            AnchorPane.setLeftAnchor(radio1, x);
            RadioButton radio2 = new RadioButton();
            radio2.setText("Auto");
            y += 30;
            AnchorPane.setTopAnchor(radio2, y);
            AnchorPane.setLeftAnchor(radio2, x);
            RadioButton radio3 = new RadioButton();
            radio3.setText("Once");
            y += 30;
            AnchorPane.setTopAnchor(radio3, y);
            AnchorPane.setLeftAnchor(radio3, x);
            RadioButton radio4 = new RadioButton();
            radio4.setText("Cont");
            y += 30;
            AnchorPane.setTopAnchor(radio4, y);
            AnchorPane.setLeftAnchor(radio4, x);
            TextField textfield = new TextField();
            textfield.setText("20");
            textfield.setMaxWidth(100);
            AnchorPane.setTopAnchor(textfield, 250.0 / 2 - 40);
            AnchorPane.setLeftAnchor(textfield, x + 80 + 80);

            //now the labelling
            Label label1 = new Label();
            label1.setText("-30.0 C");
            label1.setMaxWidth(50);
            AnchorPane.setTopAnchor(label1, slidertop);
            AnchorPane.setLeftAnchor(label1, sliderleft + 10);
            Label label2 = new Label();
            label2.setText("-25.0 C");
            label2.setMaxWidth(50);
            AnchorPane.setTopAnchor(label2, slidertop + (sliderheight / 6) * 1);
            AnchorPane.setLeftAnchor(label2, sliderleft + 10);
            Label label3 = new Label();
            label3.setText("-20.0 C");
            label3.setMaxWidth(50);
            AnchorPane.setTopAnchor(label3, slidertop + (sliderheight / 6) * 2);
            AnchorPane.setLeftAnchor(label3, sliderleft + 10);
            Label label4 = new Label();
            label4.setText("-15.0 C");
            label4.setMaxWidth(50);
            AnchorPane.setTopAnchor(label4, slidertop + (sliderheight / 6) * 3);
            AnchorPane.setLeftAnchor(label4, sliderleft + 10);
            Label label5 = new Label();
            label5.setText("-10.0 C");
            label5.setMaxWidth(50);
            AnchorPane.setTopAnchor(label5, slidertop + (sliderheight / 6) * 4);
            AnchorPane.setLeftAnchor(label5, sliderleft + 10);
            Label label6 = new Label();
            label6.setText("-5.0 C");
            label6.setMaxWidth(50);
            AnchorPane.setTopAnchor(label6, slidertop + (sliderheight / 6) * 5);
            AnchorPane.setLeftAnchor(label6, sliderleft + 10);
            Label label7 = new Label();
            label7.setText("-0.0 C");
            label7.setMaxWidth(50);
            AnchorPane.setTopAnchor(label7, slidertop + (sliderheight / 6) * 6);
            AnchorPane.setLeftAnchor(label7, sliderleft + 10);
            ObservableList list2 = pnb.getChildren();
            list2.addAll(radio1, radio2, radio3, radio4, slider, textfield,
                    label1, label2, label3, label4, label5, label6, label7,
                    labelHeating);

            //end of the bottom pane
            //the cctv section
            Label labelCCTV = new Label("CCTV");
            labelCCTV.setStyle("-fx-font-weight: bold; -fx-font-size: 18px");
            AnchorPane.setTopAnchor(labelCCTV, 10.0);
            AnchorPane.setLeftAnchor(labelCCTV, 20.0);
            //left top
            Canvas canvas = new Canvas();
            GraphicsContext gc1 = canvas.getGraphicsContext2D();
            gc1.setFill(Color.RED);
            gc1.setStroke(Color.BLACK);
            gc1.setLineWidth(2);
            gc1.fill();
            Image image1;
            System.out.println("canvas path: " + pathi);
            image1 = new Image(pathi + "front.jpg");
            canvas.setWidth(250);
            canvas.setHeight(250);
            gc1.drawImage(image1, 0, 0, 250, 250);
            AnchorPane.setTopAnchor(canvas, 48.0);
            AnchorPane.setLeftAnchor(canvas, 2.0);
            ObservableList list3 = pnm.getChildren();
            list3.add(canvas);

            //righttop
            final Canvas canvas2 = new Canvas();
            GraphicsContext gc2 = canvas2.getGraphicsContext2D();
            gc2.setFill(Color.RED);
            gc2.setStroke(Color.BLACK);
            gc2.setLineWidth(2);
            gc2.fill();
            Image image2;
            System.out.println("canvas path: " + pathi);
            image2 = new Image(pathi + "back.jpg");
            canvas2.setWidth(250);
            canvas2.setHeight(250);
            gc2.drawImage(image2, 0, 0, 250, 250);
            AnchorPane.setTopAnchor(canvas2, 48.0);
            AnchorPane.setLeftAnchor(canvas2, 2.0 + 252);
            //rightbottom
            Canvas canvas3 = new Canvas();
            GraphicsContext gc3 = canvas3.getGraphicsContext2D();
            gc3.setFill(Color.RED);
            gc3.setStroke(Color.BLACK);
            gc3.setLineWidth(2);
            gc3.fill();
            Image image3;
            System.out.println("canvas path: " + pathi);
            image3 = new Image(pathi + "mute-screen.gif");
            canvas3.setWidth(250);
            canvas3.setHeight(250);
            gc3.drawImage(image3, 0, 0, 250, 250);
            AnchorPane.setTopAnchor(canvas3, 48.0 + 252);
            AnchorPane.setLeftAnchor(canvas3, 2.0);
            //rightbottom
            Canvas canvas4 = new Canvas();
            GraphicsContext gc4 = canvas4.getGraphicsContext2D();
            gc4.setFill(Color.RED);
            gc4.setStroke(Color.BLACK);
            gc4.setLineWidth(2);
            gc4.fill();
            Image image4;
            System.out.println("canvas path: " + pathi);
            image4 = new Image(pathi + "drive.jpg");
            canvas4.setWidth(250);
            canvas4.setHeight(250);
            gc4.drawImage(image4, 0, 0, 250, 250);
            AnchorPane.setTopAnchor(canvas4, 48.0 + 252);
            AnchorPane.setLeftAnchor(canvas4, 2.0 + 252);

            //the buttons
            Button buttonFront = new Button("Front");
            Button buttonRear = new Button("Rear");
            Button buttonSide = new Button("Side");
            Button buttonDrive = new Button("Drive");
            x = 150;
            AnchorPane.setBottomAnchor(buttonFront, 2.0);
            AnchorPane.setLeftAnchor(buttonFront, x);
            AnchorPane.setBottomAnchor(buttonRear, 2.0);
            AnchorPane.setLeftAnchor(buttonRear, (x += 60.0));
            AnchorPane.setBottomAnchor(buttonSide, 2.0);
            AnchorPane.setLeftAnchor(buttonSide, (x += 60.0));
            AnchorPane.setBottomAnchor(buttonDrive, 2.0);
            AnchorPane.setLeftAnchor(buttonDrive, (x += 60.0));
            list3.addAll(canvas2, canvas3, canvas4, labelCCTV,
                    buttonFront, buttonSide, buttonDrive, buttonRear);
        //end of the cctv section

            //controls
            buttonRear.setOnAction(new EventHandler<ActionEvent>() {
                boolean hide = false;

                @Override
                public void handle(ActionEvent event) {
                    GraphicsContext g = canvas2.getGraphicsContext2D();
                    if (!hide) {
                        //button clicked
                        hide = !hide;
                        g.setFill(Color.web(Color.BLACK.toString()));
                        g.fillRect(0, 0, canvas2.getWidth(), canvas2.getHeight());
                    } else {
                        hide = !hide;
                        canvas2.getGraphicsContext2D().drawImage(image2, 0, 0, 250, 250);
                    }

                }
            });
            buttonFront.setOnAction(new EventHandler<ActionEvent>() {
                boolean hide = false;

                @Override
                public void handle(ActionEvent event) {
                    GraphicsContext g = canvas.getGraphicsContext2D();
                    if (!hide) {
                        //button clicked
                        hide = !hide;
                        g.setFill(Color.web(Color.BLACK.toString()));
                        g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                    } else {
                        hide = !hide;
                        canvas.getGraphicsContext2D().drawImage(image1, 0, 0, 250, 250);
                    }

                }
            });
            buttonSide.setOnAction(new EventHandler<ActionEvent>() {
                boolean hide = false;

                @Override
                public void handle(ActionEvent event) {
                    GraphicsContext g = canvas3.getGraphicsContext2D();
                    if (!hide) {
                        //button clicked
                        hide = !hide;
                        g.setFill(Color.web(Color.BLACK.toString()));
                        g.fillRect(0, 0, canvas3.getWidth(), canvas3.getHeight());
                    } else {
                        hide = !hide;
                        canvas3.getGraphicsContext2D().drawImage(image3, 0, 0, 250, 250);
                    }

                }
            });
            buttonDrive.setOnAction(new EventHandler<ActionEvent>() {
                boolean hide = false;

                @Override
                public void handle(ActionEvent event) {
                    GraphicsContext g = canvas4.getGraphicsContext2D();
                    if (!hide) {
                        //button clicked
                        hide = !hide;
                        g.setFill(Color.web(Color.BLACK.toString()));
                        g.fillRect(0, 0, canvas4.getWidth(), canvas4.getHeight());
                    } else {
                        hide = !hide;
                        canvas4.getGraphicsContext2D().drawImage(image4, 0, 0, 250, 250);
                    }

                }
            });

            slider.valueProperty().addListener(new ChangeListener<Number>(){

                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                   //get the slider location
                    double value = slider.getValue();
                    //now set it in the text
                    DecimalFormat dec = new DecimalFormat("#0.00");
                    String output1 = dec.format(value);
                    textfield.setText(output1);
                }
                
            });
            
            sliderhall.valueProperty().addListener(new ChangeListener<Number>(){

                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                   //get the slider location
                    double value = sliderhall.getValue();

                    //now set it in the text
                    DecimalFormat dec = new DecimalFormat("#0");
                    

                    String output = dec.format(value);
                    Integer inte = Integer.parseInt(output);

                    output = increaseColor(inte);
                    
                    System.out.println("Value: " + value);
                    cir2.setStroke(Color.SEAGREEN);
                    cir2.setFill(Color.web(output));
                    cir2.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
                }
                
            });
          
             sliderkitchen.valueProperty().addListener(new ChangeListener<Number>(){

                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                   //get the slider location
                    double value = sliderkitchen.getValue();

                    //now set it in the text
                    DecimalFormat dec = new DecimalFormat("#0");

                    String output = dec.format(value);
                    Integer inte = Integer.parseInt(output);

                    output = increaseColor(inte);
                    
                    System.out.println("Value: " + value);
                    cir3.setStroke(Color.SEAGREEN);
                    cir3.setFill(Color.web(output));
                    cir3.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
                }
                
            });
          
            sliderdinning.valueProperty().addListener(new ChangeListener<Number>(){

                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    //get the slider location
                    double value = sliderdinning.getValue();

                    //now set it in the text
                    DecimalFormat dec = new DecimalFormat("#0");

                    String output = dec.format(value);
                    Integer inte = Integer.parseInt(output);

                    output = increaseColor(inte);
                    
                    System.out.println("Value: " + value);
                    cir4.setStroke(Color.SEAGREEN);
                    cir4.setFill(Color.web(output));
                    cir4.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
                }
                
            });
            sliderLiving.valueProperty().addListener(new ChangeListener<Number>(){

                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                     //get the slider location
                    double value = sliderLiving.getValue();

                    //now set it in the text
                    DecimalFormat dec = new DecimalFormat("#0");

                    String output = dec.format(value);
                    Integer inte = Integer.parseInt(output);

                    output = increaseColor(inte);
                    
                    System.out.println("Value: " + value);
                    cir5.setStroke(Color.SEAGREEN);
                    cir5.setFill(Color.web(output));
                    cir5.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
                }
                
            });
            sliderLanding.valueProperty().addListener(new ChangeListener<Number>(){

                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                     //get the slider location
                    double value = sliderLanding.getValue();

                    //now set it in the text
                    DecimalFormat dec = new DecimalFormat("#0");

                    String output = dec.format(value);
                    Integer inte = Integer.parseInt(output);

                    output = increaseColor(inte);
                    
                    System.out.println("Value: " + value);
                    cir6.setStroke(Color.SEAGREEN);
                    cir6.setFill(Color.web(output));
                    cir6.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
                }
                
            });

            sliderBed1.valueProperty().addListener(new ChangeListener<Number>(){

                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    //get the slider location
                    double value = sliderBed1.getValue();

                    //now set it in the text
                    DecimalFormat dec = new DecimalFormat("#0");

                    String output = dec.format(value);
                    Integer inte = Integer.parseInt(output);

                    output = increaseColor(inte);
                    
                    System.out.println("Value: " + value);
                    cir7.setStroke(Color.SEAGREEN);
                    cir7.setFill(Color.web(output));
                    cir7.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
                }
                
            });
           sliderBed2.valueProperty().addListener(new ChangeListener<Number>(){

                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    //get the slider location
                    double value = sliderBed2.getValue();

                    //now set it in the text
                    DecimalFormat dec = new DecimalFormat("#0");

                    String output = dec.format(value);
                    Integer inte = Integer.parseInt(output);

                    output = increaseColor(inte);
                    
                    System.out.println("Value: " + value);
                    cir8.setStroke(Color.SEAGREEN);
                    cir8.setFill(Color.web(output));
                    cir8.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
                }
                
            });
            
            
            radio1.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent event) {
                    //disable all others
                    radio2.setSelected(false);
                    radio3.setSelected(false);
                    radio4.setSelected(false);
                }
            });
             radio4.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent event) {
                    //disable all others
                    radio2.setSelected(false);
                    radio3.setSelected(false);
                    radio1.setSelected(false);
                }
            });
              radio2.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent event) {
                    //disable all others
                    radio1.setSelected(false);
                    radio3.setSelected(false);
                    radio4.setSelected(false);
                }
            });
               radio3.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent event) {
                    //disable all others
                    radio2.setSelected(false);
                    radio1.setSelected(false);
                    radio4.setSelected(false);
                }
            });
            //end controls
            //add the panes
            root.getChildren().add(pnl);
            root.getChildren().add(pnb);
            root.getChildren().add(pnm);

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static String increaseColor(int val) {
        int r, g, b;
        r = 0;
        g = 0;
        b = 0;

        g += val;
        r += val;
        b += val;
        // increment g by 1 until it reaches 255
        /*for (int i = 0; i <= 255; i++) {
         g = i;
         /* Do whatever you
         * want with this
         * color here *
         } */

        // de-increment r by 1 until it's 0
        /*for (int i = 254; i >= 0; i--) {
         r = i;
         /* Do whatever you
         * want with this
         * color here 
         } */
        String sf = String.format("#%02x", r & 0xFFFFF) + String.format("%02x", g & 0xFFFFF) + String.format("%02x", b & 0xFFFFF);
        return sf;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
