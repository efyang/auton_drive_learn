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

    // for all of these functions, you are allowed to use java Math builtins only.
    // TODO: implement this
    public Vector2F subtract(Vector2F subtrahend) {
        // return this - subtrahend
        Vector2F result = new Vector2F(this.x - subtrahend.x, this.y - subtrahend.y);
        return result;
    }

    // TODO: implement this
    public float getAngle() {
        // get the angle CCW from the +x axis
        return (float) Math.atan(this.x/this.y);
    }

    // TODO: implement this
    public float getMagnitude() {
        // get the magnitude of the vector
        return (float) Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
