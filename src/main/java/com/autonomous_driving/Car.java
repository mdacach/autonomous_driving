package com.autonomous_driving;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.function.Consumer;

/**
 * Represents a car on the grid.
 * \n
 * The car will interact with the semaphores defined on Globals. \n
 */
public class Car extends Thread {
    ImageView imageView;
    Position position;
    long wait;
    Consumer<Car> driveFunction;

    public Car(Image image, Position position, long wait, Consumer<Car> driveFunction) {
        this.position = position;
        this.imageView = new ImageView(image);
        this.wait = wait;
        this.driveFunction = driveFunction;
    }

    public void waitForSemaphore(int id) {
        try {
            Globals.semaphores[id].acquire();
        } catch (Exception e) {
        }
    }

    public void releaseSemaphore(int id) {
        Globals.semaphores[id].release();
    }

    // Smooth function for slider speed increase
    public void changeSpeed(double sliderValue) {
        this.wait = (int) (10 - sliderValue);
    }

    /**
     * Drives the car through pre-defined points on the interface.
     */
    public void driveTo(Position pos, DriverHelper.Direction dir) {
        while (!Helper.same(this.position(), pos)) {
            Helper.waitTime(this.wait);
            switch (dir) {
                case LEFT -> this.driveLeft();
                case RIGHT -> this.driveRight();
                case UP -> this.driveUp();
                case DOWN -> this.driveDown();
                default -> {
                }
                // Should probably raise an exception here, but relax
                // It's already working
            }

            Helper.updateImageView(this.imageView, this.position());
        }
    }

    // Wrapper to call position from id
    public void driveTo(int posID, DriverHelper.Direction dir) {
        Position pos = Globals.positions[posID];
        driveTo(pos, dir);
    }

    @Override
    public void run() {
        Helper.addImageView(imageView, position);
        while (true) {
            // I am actually not sure why this wait is needed
            // Maybe on slower computers?
            Helper.waitTime(wait);
            driveFunction.accept(this);
        }
    }

    public Position position() {
        return position;
    }

    // Helper functions for manipulating underlying Position
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
}
