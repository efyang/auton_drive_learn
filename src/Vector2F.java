public class Vector2F {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Vector2F(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //Returns a new Vector with the imputed x and y subtracted from the stored ones
    public Vector2F subtract(Vector2F subtrahend) {
        return Vector2F(x - subtrahend.getX(),y - subtrahend.getY());
    }

    //Used Arctan to find the angle in polar (so from the +x axis)
    public float getAngle() {
        return Math.atan2(y,x);
    }

    //Used Pythag
    public float getMagnitude() {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
}
