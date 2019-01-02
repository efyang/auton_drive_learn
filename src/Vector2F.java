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
        float x = (this.x - subtrahend.getX());
        float y = (this.y - subtrahend.getY());
        return Vector2F(x, y);
    }

    // TODO: implement this
    public float getAngle() {
        return math.tan(y / x);
    }

    // TODO: implement this
    public float getMagnitude() {
        return math.sqrt(((x * x) + (y * y)));
    }
}