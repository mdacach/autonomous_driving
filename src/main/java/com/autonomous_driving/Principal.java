package com.autonomous_driving;
/* ***************************************************************
 * Autor: Matheus Dacach M. R. Cardoso
 * Matricula: 201911760
 * Inicio: 16-09-2021
 * Ultima alteracao: 19-06-2021
 * Nome: Carros 8
 * Funcao: Simulacao de um transito autonomo com programacao concorrente.
 * Cada carro eh uma thread, e precisamos fazer que eles nao se choquem
 * nem exista espera desnecessaria. Semaforos sao utilizados nos pontos
 * de encruzilhada.
 *************************************************************** */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


/**
 * Initializes objects for main frame. \n
 * \n
 * Each car is a separate thread. \n
 */
public class Principal extends Application {
    @Override
    public void start(Stage stage) {
        Globals.initializePositions();
        Globals.initializeSemaphores();

        // initialize javaFX stuff
        stage.setTitle("Carros 8");

        Scene scene = new Scene(Globals.root, Globals.WIDTH, Globals.HEIGHT);
        stage.setScene(scene);

        // JavaFX non-resizable does not work on bspwm window manager
        stage.setWidth(Globals.WIDTH);
        stage.setHeight(Globals.HEIGHT);
        stage.setMaxWidth(Globals.WIDTH);
        stage.setMaxHeight(Globals.HEIGHT);
        stage.setMinWidth(Globals.WIDTH);
        stage.setMinHeight(Globals.HEIGHT);

        // Set background through css (there's probably a better way)
        Globals.root.setId("background");
        var cssAsString = this.getClass().getResource("Styles.css").toExternalForm();
        scene.getStylesheets().add(cssAsString);

        var g = new Gallery(); // As getResource depends on `this`, we need Gallery to be instantiated.

        // Ideally we would have better naming for those starting positions (Avoid magic numbers)
        var black = new Car(g.blackCarImage, Globals.positions[41].copy(), 10, DriverHelper::black);
        var blue = new Car(g.blueCarImage, Globals.positions[53].copy(), 5, DriverHelper::blue);
        var brown = new Car(g.brownCarImage, Globals.positions[26].copy(), 7, DriverHelper::brown);
        var gray = new Car(g.grayCarImage, Globals.positions[1].copy(), 3, DriverHelper::gray);
        var green = new Car(g.greenCarImage, Globals.positions[59].copy(), 10, DriverHelper::green);
        var pink = new Car(g.pinkCarImage, Globals.positions[28].copy(), 5, DriverHelper::pink);
        var red = new Car(g.redCarImage, Globals.positions[46].copy(), 10, DriverHelper::red);
        var yellow = new Car(g.yellowCarImage, Globals.positions[57].copy(), 5, DriverHelper::yellow);


        // initialize all sliders and icons
        Slider blackSlider = new Slider(1, 9, 1);
        blackSlider.setTranslateX(1030);
        blackSlider.setTranslateY(30);
        blackSlider.setPrefWidth(120);
        blackSlider.valueProperty().addListener((e) -> black.changeSpeed(blackSlider.getValue()));
        Globals.root.getChildren().add(blackSlider);
        ImageView blackIcon = new ImageView(g.blackCarImage);
        Helper.addImageView(blackIcon, new Position(1000, 40));

        Slider blueSlider = new Slider(1, 9, 1);
        blueSlider.setTranslateX(1030);
        blueSlider.setTranslateY(110);
        blueSlider.setPrefWidth(120);
        blueSlider.valueProperty().addListener((e) -> blue.changeSpeed(blueSlider.getValue()));
        Globals.root.getChildren().add(blueSlider);
        ImageView blueIcon = new ImageView(g.blueCarImage);
        Helper.addImageView(blueIcon, new Position(1000, 120));

        Slider brownSlider = new Slider(1, 9, 1);
        brownSlider.setTranslateX(1030);
        brownSlider.setTranslateY(190);
        brownSlider.setPrefWidth(120);
        brownSlider.valueProperty().addListener((e) -> brown.changeSpeed(brownSlider.getValue()));
        Globals.root.getChildren().add(brownSlider);
        ImageView brownIcon = new ImageView(g.brownCarImage);
        Helper.addImageView(brownIcon, new Position(1000, 200));

        Slider graySlider = new Slider(1, 9, 1);
        graySlider.setTranslateX(1030);
        graySlider.setTranslateY(270);
        graySlider.setPrefWidth(120);
        graySlider.valueProperty().addListener((e) -> gray.changeSpeed(graySlider.getValue()));
        Globals.root.getChildren().add(graySlider);
        ImageView grayIcon = new ImageView(g.grayCarImage);
        Helper.addImageView(grayIcon, new Position(1000, 280));

        Slider greenSlider = new Slider(1, 9, 1);
        greenSlider.setTranslateX(1030);
        greenSlider.setTranslateY(350);
        greenSlider.setPrefWidth(120);
        greenSlider.valueProperty().addListener((e) -> green.changeSpeed(greenSlider.getValue()));
        Globals.root.getChildren().add(greenSlider);
        ImageView greenIcon = new ImageView(g.greenCarImage);
        Helper.addImageView(greenIcon, new Position(1000, 360));

        Slider pinkSlider = new Slider(1, 9, 1);
        pinkSlider.setTranslateX(1030);
        pinkSlider.setTranslateY(430);
        pinkSlider.setPrefWidth(120);
        pinkSlider.valueProperty().addListener((e) -> pink.changeSpeed(pinkSlider.getValue()));
        Globals.root.getChildren().add(pinkSlider);
        ImageView pinkIcon = new ImageView(g.pinkCarImage);
        Helper.addImageView(pinkIcon, new Position(1000, 440));

        Slider redSlider = new Slider(1, 9, 1);
        redSlider.setTranslateX(1030);
        redSlider.setTranslateY(510);
        redSlider.setPrefWidth(120);
        redSlider.valueProperty().addListener((e) -> red.changeSpeed(redSlider.getValue()));
        Globals.root.getChildren().add(redSlider);
        ImageView redIcon = new ImageView(g.redCarImage);
        Helper.addImageView(redIcon, new Position(1000, 520));

        Slider yellowSlider = new Slider(1, 9, 1);
        yellowSlider.setTranslateX(1030);
        yellowSlider.setTranslateY(590);
        yellowSlider.setPrefWidth(120);
        yellowSlider.valueProperty().addListener((e) -> yellow.changeSpeed(yellowSlider.getValue()));
        Globals.root.getChildren().add(yellowSlider);
        ImageView yellowIcon = new ImageView(g.yellowCarImage);
        Helper.addImageView(yellowIcon, new Position(1000, 600));


        // run in another thread because JavaFX freezes GUI updates
        new Thread(() -> {
            // Start cars
            // initial acquires for black
            // black needs to already acquire semaphores when it spawns
            black.waitForSemaphore(6);
            black.waitForSemaphore(13);
            black.waitForSemaphore(17);
            black.start();

            gray.start();
            brown.start();
            pink.start();

            red.start();
            green.start();
            yellow.start();
            blue.start();
        }).start();


        stage.show();


    }
}
