package com.autonomous_driving;


// Each car has a specific route and activates semaphores in a distinct way.
public class DriverHelper {
    public static void black(Car car) {
        // starts at 41
        // semaphores 6, 13, 17 already acquired
        car.waitForSemaphore(8);
        car.waitForSemaphore(7);
        car.driveTo(89, Direction.UP);
        car.driveTo(27, Direction.RIGHT);
        car.releaseSemaphore(13);
        car.releaseSemaphore(17);

        car.driveTo(23, Direction.RIGHT);
        car.waitForSemaphore(10);
        car.waitForSemaphore(9);
        car.driveTo(33, Direction.RIGHT);
        car.releaseSemaphore(7);
        car.releaseSemaphore(6);
        car.driveTo(32, Direction.RIGHT);

        car.waitForSemaphore(21);
        car.waitForSemaphore(14);
        car.driveTo(86, Direction.RIGHT);
        car.driveTo(34, Direction.DOWN);
        car.releaseSemaphore(9);
        car.releaseSemaphore(8);

        car.driveTo(35, Direction.DOWN);
        car.waitForSemaphore(19);
        car.waitForSemaphore(20);
        car.driveTo(85, Direction.DOWN);
        car.driveTo(36, Direction.LEFT);
        car.releaseSemaphore(14);
        car.releaseSemaphore(10);

        car.driveTo(37, Direction.LEFT);
        car.waitForSemaphore(17);
        car.waitForSemaphore(18);
        car.driveTo(38, Direction.LEFT);
        car.releaseSemaphore(20);
        car.releaseSemaphore(21);
        car.driveTo(39, Direction.LEFT);

        car.waitForSemaphore(6);
        car.waitForSemaphore(13);
        car.driveTo(90, Direction.LEFT);
        car.driveTo(40, Direction.UP);
        car.releaseSemaphore(18);
        car.releaseSemaphore(19);
        car.driveTo(41, Direction.UP);
    }

    public static void blue(Car car) {
        // starts at 53
        car.waitForSemaphore(12);
        car.driveTo(75, Direction.LEFT);
        car.driveTo(76, Direction.UP);
        car.driveTo(48, Direction.RIGHT);
        car.releaseSemaphore(12);

        car.driveTo(49, Direction.RIGHT);
        car.waitForSemaphore(6);
        car.waitForSemaphore(5);
        car.driveTo(99, Direction.RIGHT);
        car.waitForSemaphore(17);
        car.waitForSemaphore(13);
        car.driveTo(89, Direction.RIGHT);
        car.driveTo(41, Direction.DOWN);
        car.releaseSemaphore(5);

        car.driveTo(40, Direction.DOWN);
        car.waitForSemaphore(16);
        car.driveTo(90, Direction.DOWN);
        car.driveTo(50, Direction.LEFT);

        car.releaseSemaphore(6);
        car.releaseSemaphore(13);
        car.driveTo(52, Direction.LEFT);
        car.releaseSemaphore(16);
        car.releaseSemaphore(17);
        car.driveTo(53, Direction.LEFT);
    }

    public static void brown(Car car) {
        // starts at 26
        car.waitForSemaphore(2);
        car.waitForSemaphore(1);
        car.driveTo(78, Direction.UP);
        car.driveTo(13, Direction.RIGHT);

        car.waitForSemaphore(8);
        car.waitForSemaphore(4);
        car.driveTo(79, Direction.RIGHT);
        car.driveTo(21, Direction.DOWN);
        car.releaseSemaphore(1);

        car.driveTo(22, Direction.DOWN);
        car.waitForSemaphore(6);
        car.waitForSemaphore(7);
        car.driveTo(88, Direction.DOWN);
        car.driveTo(23, Direction.LEFT);
        car.releaseSemaphore(4);
        car.releaseSemaphore(2);

        car.driveTo(27, Direction.LEFT);
        car.waitForSemaphore(5);
        car.driveTo(24, Direction.LEFT);
        car.releaseSemaphore(7);
        car.releaseSemaphore(8);

        car.driveTo(93, Direction.LEFT);
        car.driveTo(25, Direction.UP);
        car.releaseSemaphore(5);
        car.releaseSemaphore(6);
        car.driveTo(26, Direction.UP);
    }

    public static void gray(Car car) {
        // starts at 1
        car.waitForSemaphore(25);
        car.waitForSemaphore(26);
        car.driveTo(3, Direction.LEFT);

        car.waitForSemaphore(24);
        car.driveTo(4, Direction.LEFT);
        car.releaseSemaphore(26);

        car.driveTo(6, Direction.LEFT);
        car.releaseSemaphore(24);
        car.releaseSemaphore(25);

        car.driveTo(74, Direction.LEFT);
        car.driveTo(7, Direction.UP);

        car.waitForSemaphore(12);
        car.driveTo(10, Direction.UP);
        car.releaseSemaphore(12);

        car.driveTo(77, Direction.UP);
        car.driveTo(11, Direction.RIGHT);

        car.waitForSemaphore(2);
        car.waitForSemaphore(1);
        car.driveTo(13, Direction.RIGHT);

        car.waitForSemaphore(3);
        car.driveTo(14, Direction.RIGHT);
        car.releaseSemaphore(1);

        car.driveTo(16, Direction.RIGHT);
        car.releaseSemaphore(3);
        car.releaseSemaphore(2);

        car.driveTo(81, Direction.RIGHT);
        car.driveTo(17, Direction.DOWN);
        car.waitForSemaphore(15);
        car.driveTo(20, Direction.DOWN);
        car.releaseSemaphore(15);

        car.driveTo(70, Direction.DOWN);
        car.driveTo(1, Direction.LEFT);
    }

    public static void green(Car car) {
        // starts at 59
        car.waitForSemaphore(25);
        car.waitForSemaphore(26);
        car.driveTo(71, Direction.DOWN);

        car.driveTo(3, Direction.LEFT);
        car.waitForSemaphore(19);
        car.waitForSemaphore(23);
        car.driveTo(72, Direction.LEFT);
        car.driveTo(54, Direction.UP);
        car.releaseSemaphore(26);

        car.driveTo(55, Direction.UP);
        car.waitForSemaphore(21);
        car.waitForSemaphore(20);
        car.driveTo(91, Direction.UP);
        car.driveTo(37, Direction.RIGHT);
        car.releaseSemaphore(23);
        car.releaseSemaphore(25);
        car.driveTo(36, Direction.RIGHT);

        car.waitForSemaphore(22);
        car.driveTo(45, Direction.RIGHT);
        car.releaseSemaphore(19);
        car.releaseSemaphore(20);
        car.driveTo(84, Direction.RIGHT);
        car.driveTo(59, Direction.DOWN);
        car.releaseSemaphore(22);
        car.releaseSemaphore(21);
    }

    public static void pink(Car car) {
        // starts at 28
        car.waitForSemaphore(2);
        car.waitForSemaphore(3);
        car.driveTo(80, Direction.UP);
        car.driveTo(14, Direction.LEFT);

        car.waitForSemaphore(8);
        car.waitForSemaphore(4);
        car.driveTo(79, Direction.LEFT);
        car.driveTo(21, Direction.DOWN);
        car.releaseSemaphore(3);

        car.driveTo(22, Direction.DOWN);
        car.waitForSemaphore(10);
        car.waitForSemaphore(9);
        car.driveTo(88, Direction.DOWN);
        car.driveTo(33, Direction.RIGHT);
        car.releaseSemaphore(4);
        car.releaseSemaphore(2);
        car.driveTo(32, Direction.RIGHT);

        car.waitForSemaphore(11);
        car.driveTo(31, Direction.RIGHT);
        car.releaseSemaphore(9);
        car.releaseSemaphore(8);
        car.driveTo(87, Direction.RIGHT);
        car.driveTo(29, Direction.UP);
        car.releaseSemaphore(11);
        car.releaseSemaphore(10);
        car.driveTo(28, Direction.UP);
    }

    public static void red(Car car) {
        // starts at 46
        car.waitForSemaphore(15);
        car.driveTo(82, Direction.RIGHT);
        car.driveTo(83, Direction.DOWN);
        car.driveTo(47, Direction.LEFT);
        car.releaseSemaphore(15);
        car.driveTo(43, Direction.LEFT);

        car.waitForSemaphore(21);
        car.waitForSemaphore(22);
        car.driveTo(45, Direction.LEFT);

        car.waitForSemaphore(10);
        car.waitForSemaphore(14);
        car.driveTo(85, Direction.LEFT);
        car.driveTo(35, Direction.UP);
        car.releaseSemaphore(22);

        car.driveTo(34, Direction.UP);
        car.waitForSemaphore(11);
        car.driveTo(86, Direction.UP);
        car.driveTo(31, Direction.RIGHT);
        car.releaseSemaphore(14);
        car.releaseSemaphore(21);
        car.driveTo(42, Direction.RIGHT);
        car.releaseSemaphore(11);
        car.releaseSemaphore(10);
        car.driveTo(46, Direction.RIGHT);
    }

    public static void yellow(Car car) {
        // starts at 57

        car.waitForSemaphore(25);
        car.waitForSemaphore(24);
        car.driveTo(73, Direction.DOWN);
        car.driveTo(4, Direction.RIGHT);

        car.waitForSemaphore(19);
        car.waitForSemaphore(23);
        car.driveTo(72, Direction.RIGHT);
        car.driveTo(54, Direction.UP);
        car.releaseSemaphore(24);
        car.driveTo(55, Direction.UP);

        car.waitForSemaphore(17);
        car.waitForSemaphore(18);
        car.driveTo(91, Direction.UP);
        car.driveTo(38, Direction.LEFT);
        car.releaseSemaphore(23);
        car.releaseSemaphore(25);
        car.driveTo(39, Direction.LEFT);

        car.waitForSemaphore(16);
        car.driveTo(50, Direction.LEFT);
        car.releaseSemaphore(19);
        car.releaseSemaphore(18);
        car.driveTo(92, Direction.LEFT);
        car.driveTo(56, Direction.DOWN);
        car.releaseSemaphore(16);
        car.releaseSemaphore(17);

        car.driveTo(57, Direction.DOWN);
    }

    public enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN,
    }
}