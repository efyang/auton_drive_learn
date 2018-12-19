public interface Drivebase {
    // assume that all of these functions work perfectly
    void rotate(float angle); // angle in radians
    void forwardDrive(float x); // x in mm
}
