package com.autonomous_driving;

// Each car has a specific route and activates semaphores in a distinct way.
public class DriverFunctions {
    public static void black(Car car) {
        // starts at 41
        // semaphores 6, 13, 17 already acquired
        car.waitForSemaphore(8);
        car.waitForSemaphore(7);
        car.driveTo(89, "up");
        car.driveTo(27, "right");
        car.releaseSemaphore(13);
        car.releaseSemaphore(17);

        car.driveTo(23, "right");
        car.waitForSemaphore(10);
        car.waitForSemaphore(9);
        car.driveTo(33, "right");
        car.releaseSemaphore(7);
        car.releaseSemaphore(6);
        car.driveTo(32, "right");

        car.waitForSemaphore(21);
        car.waitForSemaphore(14);
        car.driveTo(86, "right");
        car.driveTo(34, "down");
        car.releaseSemaphore(9);
        car.releaseSemaphore(8);

        car.driveTo(35, "down");
        car.waitForSemaphore(19);
        car.waitForSemaphore(20);
        car.driveTo(85, "down");
        car.driveTo(36, "left");
        car.releaseSemaphore(14);
        car.releaseSemaphore(10);

        car.driveTo(37, "left");
        car.waitForSemaphore(17);
        car.waitForSemaphore(18);
        car.driveTo(38, "left");
        car.releaseSemaphore(20);
        car.releaseSemaphore(21);
        car.driveTo(39, "left");

        car.waitForSemaphore(6);
        car.waitForSemaphore(13);
        car.driveTo(90, "left");
        car.driveTo(40, "up");
        car.releaseSemaphore(18);
        car.releaseSemaphore(19);
        car.driveTo(41, "up");
    }

    public static void blue(Car car) {
        // starts at 53
        car.waitForSemaphore(12);
        car.driveTo(75, "left");
        car.driveTo(76, "up");
        car.driveTo(48, "right");
        car.releaseSemaphore(12);

        car.driveTo(49, "right");
        car.waitForSemaphore(6);
        car.waitForSemaphore(5);
        car.driveTo(99, "right");
        car.waitForSemaphore(17);
        car.waitForSemaphore(13);
        car.driveTo(89, "right");
        car.driveTo(41, "down");
        car.releaseSemaphore(5);

        car.driveTo(40, "down");
        car.waitForSemaphore(16);
        car.driveTo(90, "down");
        car.driveTo(50, "left");

        car.releaseSemaphore(6);
        car.releaseSemaphore(13);
        car.driveTo(52, "left");
        car.releaseSemaphore(16);
        car.releaseSemaphore(17);
        car.driveTo(53, "left");
    }

    public static void brown(Car car) {
        // starts at 26
        car.waitForSemaphore(2);
        car.waitForSemaphore(1);
        car.driveTo(78, "up");
        car.driveTo(13, "right");

        car.waitForSemaphore(8);
        car.waitForSemaphore(4);
        car.driveTo(79, "right");
        car.driveTo(21, "down");
        car.releaseSemaphore(1);

        car.driveTo(22, "down");
        car.waitForSemaphore(6);
        car.waitForSemaphore(7);
        car.driveTo(88, "down");
        car.driveTo(23, "left");
        car.releaseSemaphore(4);
        car.releaseSemaphore(2);

        car.driveTo(27, "left");
        car.waitForSemaphore(5);
        car.driveTo(24, "left");
        car.releaseSemaphore(7);
        car.releaseSemaphore(8);

        car.driveTo(93, "left");
        car.driveTo(25, "up");
        car.releaseSemaphore(5);
        car.releaseSemaphore(6);
        car.driveTo(26, "up");
    }

    public static void gray(Car car) {
        // starts at 1
        car.waitForSemaphore(25);
        car.waitForSemaphore(26);
        car.driveTo(3, "left");

        car.waitForSemaphore(24);
        car.driveTo(4, "left");
        car.releaseSemaphore(26);

        car.driveTo(6, "left");
        car.releaseSemaphore(24);
        car.releaseSemaphore(25);

        car.driveTo(74, "left");
        car.driveTo(7, "up");

        car.waitForSemaphore(12);
        car.driveTo(10, "up");
        car.releaseSemaphore(12);

        car.driveTo(77, "up");
        car.driveTo(11, "right");

        car.waitForSemaphore(2);
        car.waitForSemaphore(1);
        car.driveTo(13, "right");

        car.waitForSemaphore(3);
        car.driveTo(14, "right");
        car.releaseSemaphore(1);

        car.driveTo(16, "right");
        car.releaseSemaphore(3);
        car.releaseSemaphore(2);

        car.driveTo(81, "right");
        car.driveTo(17, "down");
        car.waitForSemaphore(15);
        car.driveTo(20, "down");
        car.releaseSemaphore(15);

        car.driveTo(70, "down");
        car.driveTo(1, "left");
    }

    public static void green(Car car) {
        // starts at 59
        car.waitForSemaphore(25);
        car.waitForSemaphore(26);
        car.driveTo(71, "down");

        car.driveTo(3, "left");
        car.waitForSemaphore(19);
        car.waitForSemaphore(23);
        car.driveTo(72, "left");
        car.driveTo(54, "up");
        car.releaseSemaphore(26);

        car.driveTo(55, "up");
        car.waitForSemaphore(21);
        car.waitForSemaphore(20);
        car.driveTo(91, "up");
        car.driveTo(37, "right");
        car.releaseSemaphore(23);
        car.releaseSemaphore(25);
        car.driveTo(36, "right");

        car.waitForSemaphore(22);
        car.driveTo(45, "right");
        car.releaseSemaphore(19);
        car.releaseSemaphore(20);
        car.driveTo(84, "right");
        car.driveTo(59, "down");
        car.releaseSemaphore(22);
        car.releaseSemaphore(21);
    }

    public static void pink(Car car) {
        // starts at 28
        car.waitForSemaphore(2);
        car.waitForSemaphore(3);
        car.driveTo(80, "up");
        car.driveTo(14, "left");

        car.waitForSemaphore(8);
        car.waitForSemaphore(4);
        car.driveTo(79, "left");
        car.driveTo(21, "down");
        car.releaseSemaphore(3);

        car.driveTo(22, "down");
        car.waitForSemaphore(10);
        car.waitForSemaphore(9);
        car.driveTo(88, "down");
        car.driveTo(33, "right");
        car.releaseSemaphore(4);
        car.releaseSemaphore(2);
        car.driveTo(32, "right");

        car.waitForSemaphore(11);
        car.driveTo(31, "right");
        car.releaseSemaphore(9);
        car.releaseSemaphore(8);
        car.driveTo(87, "right");
        car.driveTo(29, "up");
        car.releaseSemaphore(11);
        car.releaseSemaphore(10);
        car.driveTo(28, "up");
    }

    public static void red(Car car) {
        // starts at 46
        car.waitForSemaphore(15);
        car.driveTo(82, "right");
        car.driveTo(83, "down");
        car.driveTo(47, "left");
        car.releaseSemaphore(15);
        car.driveTo(43, "left");

        car.waitForSemaphore(21);
        car.waitForSemaphore(22);
        car.driveTo(45, "left");

        car.waitForSemaphore(10);
        car.waitForSemaphore(14);
        car.driveTo(85, "left");
        car.driveTo(35, "up");
        car.releaseSemaphore(22);

        car.driveTo(34, "up");
        car.waitForSemaphore(11);
        car.driveTo(86, "up");
        car.driveTo(31, "right");
        car.releaseSemaphore(14);
        car.releaseSemaphore(21);
        car.driveTo(42, "right");
        car.releaseSemaphore(11);
        car.releaseSemaphore(10);
        car.driveTo(46, "right");
    }

    public static void yellow(Car car) {
        // starts at 57

        car.waitForSemaphore(25);
        car.waitForSemaphore(24);
        car.driveTo(73, "down");
        car.driveTo(4, "right");

        car.waitForSemaphore(19);
        car.waitForSemaphore(23);
        car.driveTo(72, "right");
        car.driveTo(54, "up");
        car.releaseSemaphore(24);
        car.driveTo(55, "up");

        car.waitForSemaphore(17);
        car.waitForSemaphore(18);
        car.driveTo(91, "up");
        car.driveTo(38, "left");
        car.releaseSemaphore(23);
        car.releaseSemaphore(25);
        car.driveTo(39, "left");

        car.waitForSemaphore(16);
        car.driveTo(50, "left");
        car.releaseSemaphore(19);
        car.releaseSemaphore(18);
        car.driveTo(92, "left");
        car.driveTo(56, "down");
        car.releaseSemaphore(16);
        car.releaseSemaphore(17);

        car.driveTo(57, "down");
    }
}