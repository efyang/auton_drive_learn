public class Robot {
    // assume that these are set/nonnull
    private Drivebase drivebase;
    private NavigationalState navigationalState;

    public void moveTo(float x, float y, float heading) {
        moveTo(new Vector2F(x, y), heading);
    }

    // TODO: implement this
    public void moveTo(Vector2F targetPosition, float targetHeading) {
        // move to the given position and heading
        // you should only have to use things that are within these files
    }
}
