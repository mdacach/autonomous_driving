package com.autonomous_driving;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
* Abstract class to represent a Car.
*
* The car has various helper functions, including waiting
* for concurrency solutions.
* Each specific car *must* implement a "drive" function
* with its path.
* */
abstract class Car extends Thread {
  ImageView imageView;
  Image image;
  Position position;
  long wait;

  public void waitForSemaphore(int id) {
    //System.out.println(this.getClass() + " waiting for semaphore " + id);
    try {
      Globals.semaphores[id].acquire();
    } catch (Exception e) {}
  }

  public void releaseSemaphore(int id) {
    //System.out.println("releasing " + id);
    Globals.semaphores[id].release();
  }

  // so that increasing the slider increases the speed,
  // but still we have smooth animations
  public void changeSpeed(double sliderValue) {
    //this.wait = (int) (100 / sliderValue);
    this.wait = (int) (10 - sliderValue);
  }

  // default car constructor
  public Car(Image image, Position position, long wait) {
    this.position = position;
    this.imageView = new ImageView(image);
    this.wait = wait;
  }

  /**
  * Drives the car through pre-defined points on the interface.
  */
  public void driveTo(Position pos, String dir) {
    while (!Helper.same(this.position(), pos)) {
      Helper.waitTime(this.wait);
      if (dir.equals("right"))
        this.driveRight();
      else if (dir.equals("left"))
        this.driveLeft();
      else if (dir.equals("down"))
        this.driveDown();
      else if (dir.equals("up"))
        this.driveUp();
      else  // this should never happen if I'm smart
        System.out.println("direction does not exist!");

      //System.out.println(car.position());
      Helper.updateImageView(this.imageView, this.position());
    }
  }

  // wrapper so we can call with a defined position more easily
  public void driveTo(int posID, String dir) {
    Position pos = Globals.positions[posID];
    driveTo(pos, dir);
  }

  // drive directions
  public void driveLeft() {
    this.position.left();
  }

  public void driveUp() {
    this.position.up();
  }

  public void driveRight() {
    this.position.right();
  }

  public void driveDown() {
    this.position.down();
  }

  // when we start this thread, it will run forever
  @Override
  public void run() {
    Helper.addImageView(imageView, position);
    while (true) {
      Helper.waitTime(wait);
      drive();
    }
  }

  // position getter
  public Position position() {
    return position;
  }

  // each car must implement its own drive path
  public abstract void drive();
}
