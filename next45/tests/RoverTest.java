import org.junit.Test;
public class RoverTest {
    @Test
    public void processCommands() throws Exception {
    }

    @Test
    public void getPosition() throws Exception {
        Rover rover2   = new Rover(new directionChange.Points(3),
                new directionChange.Points(3), directionChange.Direction.EAST);
        rover2.processCommands(new Rover.Command[] { Rover.Command.MOVE, Rover.Command.MOVE,
                Rover.Command.RIGHT, Rover.Command.MOVE, Rover.Command.MOVE, Rover.Command.RIGHT,
                Rover.Command.MOVE, Rover.Command.RIGHT, Rover.Command.RIGHT, Rover.Command.MOVE });
        System.out.println(rover2.getPosition());
    }

}