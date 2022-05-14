package com.autonomous_driving;

import javafx.scene.layout.Pane;

import java.util.concurrent.Semaphore;

/**
 * Class to handle global state.
 * <p>
 * Semaphores and positions are global, as we need to access
 * them on multiple other classes. This isn't good, but I am no GUI specialist, so...
 */
public class Globals {
    static final int WIDTH = 1160;
    static final int HEIGHT = 669; // 29 pixels for title

    // as I get images relative to center, offset regarding image size
    static final int OFFSET = 20; // offset from images

    static final int SLEEP = 3;
    static final int POSITIONS = 100;
    static final int SEMAPHORES = 27;
    // global semaphores
    static final Semaphore[] semaphores = new Semaphore[SEMAPHORES];
    static final Position[] positions = new Position[POSITIONS];
    static Pane root = new Pane();

    // each semaphore has an id, based on the image "semaphores.png" on images folder
    // (thanks to Lucas for the image)
    static void initializeSemaphores() {
        for (int i = 1; i < SEMAPHORES; i++) {
            semaphores[i] = new Semaphore(1);
        }
        // this is a general solution, for any path
        //
        // some semaphores are not needed depending on the car paths
        // those are initiated with 3 permits, so that it won't block
        // any passages
        semaphores[2] = new Semaphore(3);
        semaphores[6] = new Semaphore(2);
        semaphores[8] = new Semaphore(3);
        semaphores[10] = new Semaphore(3);
        semaphores[17] = new Semaphore(3);
        semaphores[19] = new Semaphore(3);
        semaphores[21] = new Semaphore(2);
        semaphores[25] = new Semaphore(3);
    }

    // each position has an id, based on the image "all_points.png" on images folder
    static void initializePositions() {
        // a lot of points are needed so that the car can
        // allow other passages as soon as possible
        //
        // specifically, every cruise, before cruise, after cruise
        // in all directions are points
        // bottom line
        positions[1] = new Position(810, 620);
        positions[2] = new Position(730, 620);
        positions[3] = new Position(524, 620);
        positions[4] = new Position(444, 620);
        positions[5] = new Position(244, 620);
        positions[6] = new Position(166, 620);

        // left line
        positions[7] = new Position(20, 462);
        positions[8] = new Position(20, 382);
        positions[9] = new Position(20, 262);
        positions[10] = new Position(20, 181);

        // top line
        positions[11] = new Position(164, 20);
        positions[12] = new Position(246, 20);
        positions[13] = new Position(444, 20);
        positions[14] = new Position(524, 20);
        positions[15] = new Position(726, 20);
        positions[16] = new Position(808, 20);

        // right line
        positions[17] = new Position(940, 182);
        positions[18] = new Position(940, 262);
        positions[19] = new Position(940, 382);
        positions[20] = new Position(940, 462);

        // from brown
        positions[21] = new Position(484, 60);
        positions[22] = new Position(484, 182);
        positions[23] = new Position(444, 222);
        positions[24] = new Position(244, 222);
        positions[25] = new Position(204, 182);
        positions[26] = new Position(204, 60);
        positions[27] = new Position(358, 222);

        // from pink
        positions[28] = new Position(768, 60);
        positions[29] = new Position(768, 182);
        positions[30] = new Position(728, 222);
        positions[31] = new Position(666, 222);
        positions[32] = new Position(586, 222);
        positions[33] = new Position(524, 222);

        // from black
        positions[34] = new Position(626, 262);
        positions[35] = new Position(626, 382);
        positions[36] = new Position(586, 422);
        positions[37] = new Position(524, 422);
        positions[38] = new Position(444, 422);
        positions[39] = new Position(358, 422);
        positions[40] = new Position(318, 382);
        positions[41] = new Position(318, 262);

        // from red
        positions[42] = new Position(808, 222);
        positions[43] = new Position(810, 422);
        positions[44] = new Position(730, 422);
        positions[45] = new Position(666, 422);
        positions[46] = new Position(900, 222);
        positions[47] = new Position(900, 422);

        // from blue
        positions[48] = new Position(60, 222);
        positions[49] = new Position(164, 222);
        positions[50] = new Position(278, 422);
        positions[51] = new Position(244, 422);
        positions[52] = new Position(164, 422);
        positions[53] = new Position(60, 422);

        // from yellow
        positions[54] = new Position(484, 580);
        positions[55] = new Position(484, 462);
        positions[56] = new Position(204, 462);
        positions[57] = new Position(204, 580);

        // from green
        positions[58] = new Position(770, 462);
        positions[59] = new Position(770, 580);

        // differentiate between those

        // corner points
        positions[70] = new Position(940, 620);
        positions[71] = new Position(770, 620);
        positions[72] = new Position(484, 620);
        positions[73] = new Position(204, 620);
        positions[74] = new Position(20, 620);
        positions[75] = new Position(20, 422);
        positions[76] = new Position(20, 222);
        positions[77] = new Position(20, 20);
        positions[78] = new Position(204, 20);
        positions[79] = new Position(484, 20);
        positions[80] = new Position(768, 20);
        positions[81] = new Position(940, 20);
        positions[82] = new Position(940, 222);
        positions[83] = new Position(940, 422);

        positions[84] = new Position(770, 422);
        positions[85] = new Position(626, 422);
        positions[86] = new Position(626, 222);
        positions[87] = new Position(768, 222);
        positions[88] = new Position(484, 222);
        positions[89] = new Position(318, 222);
        positions[90] = new Position(318, 422);
        positions[91] = new Position(484, 422);
        positions[92] = new Position(204, 422);
        positions[93] = new Position(204, 222);

        // missing one tiny spot for blue
        positions[99] = new Position(278, 222);
    }
}
