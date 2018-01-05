//this class is created to get and return
//the direction in which the mars rover can move
//line of rotational symmetry of the mars rover
public class directionChange {
    public static final class Points {

        int directionPoint = 0;

        public Points(int axis) {
            this.directionPoint = axis;
        }
        protected void increment() {
            directionPoint++;
        }
        protected void decrement() {
            directionPoint--;
        }
        public int getDirectionPoint() {
            return directionPoint;
        }
    }
// direction of forward motion for mars rover
// and the other directions to it and to each other
    public enum Direction {

        NORTH {
            @Override
            public Direction right() {
                return EAST;
            }
            @Override
            public Direction left() {
                return WEST;
            }
        },

        EAST {
            @Override
            public Direction right() {
                return SOUTH;
            }
            @Override
            public Direction left() {
                return NORTH;
            }
        },

        SOUTH {
            @Override
            public Direction right() {
                return WEST;
            }
            @Override
            public Direction left() {
                return EAST;
            }
        },

        WEST {
            @Override
            public Direction right() {
                return NORTH;
            }
            @Override
            public Direction left() {
                return SOUTH;
            }
        };

        public abstract Direction right();

        public abstract Direction left();
    }

    public Points getX() {
        return null;
    }

    public Points getY() {
        return null;
    }

    public Direction getDirection() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
