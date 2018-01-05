public class Rover {
    private Position position = null;
    /* remote users will run this function with the necessary commands to navigate the device */
    public enum Command {
        RIGHT, LEFT, MOVE;
        private void process(Position position) {
            switch (this) {
                case RIGHT:
                    position.setDirectionRight();
                    break;
                case LEFT:
                    position.setDirectionLeft();
                    break;
                case MOVE:
                    switch (position.getDirection()) {
                        case NORTH:
                            position.getY().increment();
                            break;
                        case EAST:
                            position.getX().increment();
                            break;
                        case SOUTH:
                            position.getY().decrement();
                            break;
                        case WEST:
                            position.getX().decrement();
                    }
            }
        }
    };

    public Rover(directionChange.Points x, directionChange.Points y, directionChange.Direction direction) {
        this.position = new Position(x, y, direction);
    }

    public void processCommands(Command[] commands) {
        for (int i = 0; i < commands.length; i++) {
            commands[i].process(position);
        }
    }

    public Position getPosition() {
        return position;
    }
}
