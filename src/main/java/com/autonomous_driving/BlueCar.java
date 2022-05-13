package com.autonomous_driving;

import javafx.scene.image.Image;

public class BlueCar extends Car {

  public BlueCar(Image image, Position start, long wait) {
    super(image, start, wait);
  }

  public void drive() {
    // starts at 53
    waitForSemaphore(12);
    driveTo(75, "left");
    driveTo(76, "up");
    driveTo(48, "right");
    releaseSemaphore(12);

    driveTo(49, "right");
    waitForSemaphore(6);
    waitForSemaphore(5);
    driveTo(99, "right");
    waitForSemaphore(17);
    waitForSemaphore(13);
    driveTo(89, "right");
    driveTo(41, "down");
    releaseSemaphore(5);

    driveTo(40, "down");
    waitForSemaphore(16);
    driveTo(90, "down");
    driveTo(50, "left");

    releaseSemaphore(6);
    releaseSemaphore(13);
    driveTo(52, "left");
    releaseSemaphore(16);
    releaseSemaphore(17);
    driveTo(53, "left");
  }
}
