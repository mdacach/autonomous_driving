package com.autonomous_driving;

import javafx.scene.image.ImageView;
import javafx.application.Platform;

/**
* Helper class with various utility functions.
* */
abstract class Helper {
  /**
  * Wait wrapper.
  * */
  static void waitTime(long milis) {
    try {
      Thread.sleep(milis);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
  * Check if two positions are the same.
  * */
  static public boolean same(Position lhs, Position rhs) {
    return lhs.x == rhs.x && lhs.y == rhs.y;
  }

  /**
  * Adds image view to frame, when possible.
  * */
  static public void addImageView(ImageView imageView, Position position) {
    Platform.runLater(() -> {
      Globals.root.getChildren().add(imageView);
      imageView.setX(position.x);
      imageView.setY(position.y);
    });
  }

  /**
  * Updates an image view on frame, when possible.
  * */
  static public void updateImageView(ImageView imageView, Position position) {
    Platform.runLater(() -> {
      imageView.setX(position.x);
      imageView.setY(position.y);
    });
  }

}
