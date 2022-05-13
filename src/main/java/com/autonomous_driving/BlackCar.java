package com.autonomous_driving;

import javafx.scene.image.Image;

public class BlackCar extends Car {

  public BlackCar(Image image, Position start, long wait) {
    super(image, start, wait);
  }

  public void drive() {
    // starts at 41
    // semaphores 6, 13, 17 already acquired
    
    waitForSemaphore(8);
    waitForSemaphore(7);
    driveTo(89, "up");
    driveTo(27, "right");
    releaseSemaphore(13);
    releaseSemaphore(17);

    driveTo(23, "right");
    waitForSemaphore(10);
    waitForSemaphore(9);
    driveTo(33, "right");
    releaseSemaphore(7);
    releaseSemaphore(6);
    driveTo(32, "right");
    
    waitForSemaphore(21);
    waitForSemaphore(14);
    driveTo(86, "right");
    driveTo(34, "down");
    releaseSemaphore(9);
    releaseSemaphore(8);

    driveTo(35, "down");
    waitForSemaphore(19);
    waitForSemaphore(20);
    driveTo(85, "down");
    driveTo(36, "left");
    releaseSemaphore(14);
    releaseSemaphore(10);

    driveTo(37, "left");
    waitForSemaphore(17);
    waitForSemaphore(18);
    driveTo(38, "left");
    releaseSemaphore(20);
    releaseSemaphore(21);
    driveTo(39, "left");

    waitForSemaphore(6);
    waitForSemaphore(13);
    driveTo(90, "left");
    driveTo(40, "up");
    releaseSemaphore(18);
    releaseSemaphore(19);
    driveTo(41, "up");
  }
}
