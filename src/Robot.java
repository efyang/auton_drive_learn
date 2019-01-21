public class Robot {
    // assume that these are set/nonnull
    private Drivebase drivebase;
    private NavigationalState navigationalState;

    public void moveTo(float x, float y, float heading) {
        moveTo(new Vector2F(x, y), heading);
    }

    public void moveTo(Vector2F targetPosition, float targetHeading) {

        //Setting up rotation by subtracting their angles ccw from +x and normalizing it
        float angleDif = ExtendedMath.normalizeRadians(targetHeading - navigationalState.getHeading());

        //Seting up distance by subtracting the vectors, then finding the magnitude of the resulting vector
        float distDif = targetPosition.subtract(navigationalState.getPosition()).getMagnitude();

        //Making the drivebase actually implement it
        drivebase.rotate(angleDif);
        drivebase.forwardDrive(distDif);
    }
}
