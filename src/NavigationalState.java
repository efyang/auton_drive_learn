public class NavigationalState {
    private float heading;
    private Vector2F position;

    public NavigationalState(float heading, Vector2F position) {
        this.heading = heading;
        this.position = position;
    }

    public float getHeading() {
        return heading;
    }

    public Vector2F getPosition() {
        return position;
    }

    public void setHeading(float heading) {
        this.heading = heading;
    }

    public void setPosition(Vector2F position) {
        this.position = position;
    }
}
