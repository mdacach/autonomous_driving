package com.autonomous_driving;

import javafx.scene.image.Image;

public class Gallery {
    private String pathToString(String path) {
        var c = this.getClass();
        var url = c.getResource(path);
        return url.toExternalForm();
    }

    // Paths on IntelliJ were different from what I was using before, so I've created this helper.
    private Image createImage(String path) {
        return new Image(pathToString(path));
    }

    final Image roadImage = createImage("images/road.png");
    final Image backgroundImage = createImage("images/background.png");
    final Image blackCarImage = createImage("images/black_car.png");
    final Image grayCarImage = createImage("images/gray_car.png");
    final Image brownCarImage = createImage("images/brown_car.png");
    final Image pinkCarImage = createImage("images/pink_car.png");
    final Image redCarImage = createImage("images/red_car.png");
    final Image yellowCarImage = createImage("images/yellow_car.png");
    final Image greenCarImage = createImage("images/green_car.png");
    final Image blueCarImage = createImage("images/blue_car.png");
}
