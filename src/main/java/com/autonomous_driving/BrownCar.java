package com.autonomous_driving;

import javafx.scene.image.Image;

public class BrownCar extends Car {

  public BrownCar(Image image, Position start, long wait) {
    super(image, start, wait);
  }

  public void drive() {
    // starts at 26
    waitForSemaphore(2);
    waitForSemaphore(1);
    driveTo(78, "up");
    driveTo(13, "right");

    waitForSemaphore(8);
    waitForSemaphore(4);
    driveTo(79, "right");
    driveTo(21, "down");
    releaseSemaphore(1);

    driveTo(22, "down");
    waitForSemaphore(6);
    waitForSemaphore(7);
    driveTo(88, "down");
    driveTo(23, "left");
    releaseSemaphore(4);
    releaseSemaphore(2);

    driveTo(27, "left");
    waitForSemaphore(5);
    driveTo(24, "left");
    releaseSemaphore(7);
    releaseSemaphore(8);

    driveTo(93, "left");
    driveTo(25, "up");
    releaseSemaphore(5);
    releaseSemaphore(6);
    driveTo(26, "up");
  }
}
