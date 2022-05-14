package com.autonomous_driving;

/**
 * Helper class representing a position on the interface.
 * <p>
 * All positions are specified in image "all_points.png"
 * on images folder.
 */
class Position {
    int x, y;

    public Position(int x, int y) {
        this.x = x - Globals.OFFSET; // offset for image
        this.y = y - Globals.OFFSET;
    }

    // debug purposes
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // to be used inside Car
    public void left() {
        this.x--;
    }

    public void up() {
        this.y--;
    }

    public void right() {
        this.x++;
    }

    public void down() {
        this.y++;
    }

    // copy this position
    // as java is weird (not really pass by value nor reference)
    public Position copy() {
        return new Position(x + Globals.OFFSET, y + Globals.OFFSET);
    }
}
