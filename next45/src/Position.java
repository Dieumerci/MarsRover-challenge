public class Position extends directionChange {

    private Points x = null;
    private Points y = null;
    private directionChange.Direction direction = null;

    public Position(Points x, Points y, directionChange.Direction direction) {
        if (x == null || y == null || direction == null) {
            throw new IllegalArgumentException("Error the current position is presented as null");
        }
               /* overloaded constructor allows us to pass initial x,y as well as direction of this device */
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    protected void setDirectionRight() {
        direction = direction.right();
    }

    protected void setDirectionLeft() {
        direction = direction.left();
    }

    @Override
    public Points getX() {
        return x;
    }

    @Override
    public Points getY() {
        return y;
    }

    @Override
    public directionChange.Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return getX().getDirectionPoint() + " ''" + getY().getDirectionPoint() + " ''"
                + getDirection().name();
    }
}
