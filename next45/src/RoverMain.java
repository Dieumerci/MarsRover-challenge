public class RoverMain {

    public static final int N = 0;
    public static final int E = 1;
    public static final int S = 2;
    public static final int W = 3;

    public static void main(String args[])
    {
        //user can change position
        //as well as direction
        MarsRover rover = new MarsRover();
        rover.setPosition(1, 2, N);
        rover.process("MMLMLMLMM");
        rover.printPosition();
        //print the commands
        rover.setPosition(3, 3, E);
        rover.process("MMRMMRMRRM");
        rover.printPosition();
    }
}
