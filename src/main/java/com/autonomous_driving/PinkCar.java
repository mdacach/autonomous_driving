package com.autonomous_driving;

import javafx.scene.image.Image;

public class PinkCar extends Car {

  public PinkCar(Image image, Position start, long wait) {
    super(image, start, wait);
  }

  public void drive() {
    // starts at 28
    waitForSemaphore(2);
    waitForSemaphore(3);
    driveTo(80, "up");
    driveTo(14, "left");

    waitForSemaphore(8);
    waitForSemaphore(4);
    driveTo(79, "left");
    driveTo(21, "down");
    releaseSemaphore(3);

    driveTo(22, "down");
    waitForSemaphore(10);
    waitForSemaphore(9);
    driveTo(88, "down");
    driveTo(33, "right");
    releaseSemaphore(4);
    releaseSemaphore(2);
    driveTo(32, "right");

    waitForSemaphore(11);
    driveTo(31, "right");
    releaseSemaphore(9);
    releaseSemaphore(8);
    driveTo(87, "right");
    driveTo(29, "up");
    releaseSemaphore(11);
    releaseSemaphore(10);
    driveTo(28, "up");
  }
}
