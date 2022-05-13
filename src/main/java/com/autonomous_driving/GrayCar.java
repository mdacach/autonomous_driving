package com.autonomous_driving;

import javafx.scene.image.Image;

public class GrayCar extends Car {

  public GrayCar(Image image, Position start, long wait) {
    super(image, start, wait);
  }

  public void drive() {
    // starts at 1
    waitForSemaphore(25);
    waitForSemaphore(26);
    driveTo(3, "left");

    waitForSemaphore(24);
    driveTo(4, "left");
    releaseSemaphore(26);

    driveTo(6, "left");
    releaseSemaphore(24);
    releaseSemaphore(25);

    driveTo(74, "left");
    driveTo(7, "up");

    waitForSemaphore(12);
    driveTo(10, "up");
    releaseSemaphore(12);

    driveTo(77, "up");
    driveTo(11, "right");

    waitForSemaphore(2);
    waitForSemaphore(1);
    driveTo(13, "right");

    waitForSemaphore(3);
    driveTo(14, "right");
    releaseSemaphore(1);

    driveTo(16, "right");
    releaseSemaphore(3);
    releaseSemaphore(2);

    driveTo(81, "right");
    driveTo(17, "down");
    waitForSemaphore(15);
    driveTo(20, "down");
    releaseSemaphore(15);

    driveTo(70, "down");
    driveTo(1, "left");
  }
}
