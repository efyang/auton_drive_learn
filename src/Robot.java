public class Robot {
    // assume that these are set/nonnull
    private Drivebase drivebase;
    private NavigationalState navigationalState;

    public void moveTo(float x, float y, float heading) {
        moveTo(new Vector2F(x, y), heading);
    }

    // TODO: implement this
    public void moveTo(Vector2F targetPosition, float targetHeading) {

        Vector2F movementVect = new Vector2F(); //makes new vect
        movementVect = targetPosition.subtract(navigationalState.position); //use it to point where to move
        float angleDiff = normalizeRadians(movementVect.getAngle() - navigationalState.getAngle());
        rotate(angleDiff);//rotate to proper heading
        navigationalState.heading = movementVect.getAngle;//change navigationalState to proper angle of where roboti s going
        forwardDrive(movementVect.getMagnitude());
        navigationalState.position = targetPosition; //move and update targetPosition
        float angleToTarget = normalizeRadians(targetHeading - navigationalState.getAngle());
        rotate(angleToTarget);
        navigationalState.heading = targetHeading;
    }
}
//these comments were all added as an afterthought because i wrote this at like 8pm and didnt read the grading criteria until later