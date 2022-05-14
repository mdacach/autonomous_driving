package com.autonomous_driving;

import javafx.application.Platform;
import javafx.scene.image.ImageView;

abstract class Helper {
    // Waiting is very common in this application. To avoid handling errors everytime
    // wrap it here.
    static void waitTime(long milis) {
        try {
            Thread.sleep(milis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public boolean same(Position lhs, Position rhs) {
        return lhs.x == rhs.x && lhs.y == rhs.y;
    }

    static public void addImageView(ImageView imageView, Position position) {
        // We must always defer changing the UI to when Java can spare us the time.
        Platform.runLater(() -> {
            Globals.root.getChildren().add(imageView);
            imageView.setX(position.x);
            imageView.setY(position.y);
        });
    }

    static public void updateImageView(ImageView imageView, Position position) {
        // We must always defer changing the UI to when Java can spare us the time.
        Platform.runLater(() -> {
            imageView.setX(position.x);
            imageView.setY(position.y);
        });
    }
}
