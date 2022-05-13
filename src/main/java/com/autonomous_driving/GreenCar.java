package com.autonomous_driving;

import javafx.scene.image.Image;

public class GreenCar extends Car {

  public GreenCar(Image image, Position start, long wait) {
    super(image, start, wait);
  }

  public void drive() {
    // starts at 59
    waitForSemaphore(25);
    waitForSemaphore(26);
    driveTo(71, "down");

    driveTo(3, "left");
    waitForSemaphore(19);
    waitForSemaphore(23);
    driveTo(72, "left");
    driveTo(54, "up");
    releaseSemaphore(26);

    driveTo(55, "up");
    waitForSemaphore(21);
    waitForSemaphore(20);
    driveTo(91, "up");
    driveTo(37, "right");
    releaseSemaphore(23);
    releaseSemaphore(25);
    driveTo(36, "right");

    waitForSemaphore(22);
    driveTo(45, "right");
    releaseSemaphore(19);
    releaseSemaphore(20);
    driveTo(84, "right");
    driveTo(59, "down");
    releaseSemaphore(22);
    releaseSemaphore(21);
  }

}
