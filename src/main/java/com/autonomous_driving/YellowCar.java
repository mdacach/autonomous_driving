package com.autonomous_driving;

import javafx.scene.image.Image;

public class YellowCar extends Car {

  public YellowCar(Image image, Position start, long wait) {
    super(image, start, wait);
  }

  public void drive() {
    // starts at 57

    waitForSemaphore(25);
    waitForSemaphore(24);
    driveTo(73, "down");
    driveTo(4, "right");

    waitForSemaphore(19);
    waitForSemaphore(23);
    driveTo(72, "right");
    driveTo(54, "up");
    releaseSemaphore(24);
    driveTo(55, "up");

    waitForSemaphore(17);
    waitForSemaphore(18);
    driveTo(91, "up");
    driveTo(38, "left");
    releaseSemaphore(23);
    releaseSemaphore(25);
    driveTo(39, "left");

    waitForSemaphore(16);
    driveTo(50, "left");
    releaseSemaphore(19);
    releaseSemaphore(18);
    driveTo(92, "left");
    driveTo(56, "down");
    releaseSemaphore(16);
    releaseSemaphore(17);
    
    driveTo(57, "down");
  }
}
