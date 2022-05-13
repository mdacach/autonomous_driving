package com.autonomous_driving;

import javafx.scene.image.Image;

public class RedCar extends Car {

  public RedCar(Image image, Position start, long wait) {
    super(image, start, wait);
  }

  public void drive() {
    // starts at 46
    waitForSemaphore(15);
    driveTo(82, "right");
    driveTo(83, "down");
    driveTo(47, "left");
    releaseSemaphore(15);
    driveTo(43, "left");

    waitForSemaphore(21);
    waitForSemaphore(22);
    driveTo(45, "left");

    waitForSemaphore(10);
    waitForSemaphore(14);
    driveTo(85, "left");
    driveTo(35, "up");
    releaseSemaphore(22);

    driveTo(34, "up");
    waitForSemaphore(11);
    driveTo(86, "up");
    driveTo(31, "right");
    releaseSemaphore(14);
    releaseSemaphore(21);
    driveTo(42, "right");
    releaseSemaphore(11);
    releaseSemaphore(10);
    driveTo(46, "right");
  }

}
