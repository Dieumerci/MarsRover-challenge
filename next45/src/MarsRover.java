public class MarsRover  {

        public static final int N = 0;
        public static final int E = 1;
        public static final int S = 2;
        public static final int W = 3;

        int xCoordinate = 0;
        int yCoordinate =0;

        int facingDirection = N;

        public MarsRover()
        {

        }

        public void setPosition(int x, int y, int facingDirection)
        {
            this.xCoordinate = x;
            this.yCoordinate = y;
            this.facingDirection = facingDirection;

        }

        public void printPosition()
        {
            char direction = 'N';
            if(facingDirection == 0)
            {
                direction = 'N';

            }else if(facingDirection == 1)
            {
                direction = 'E';
            }
            else if(facingDirection == 2)
            {
                direction = 'S';
            }
            else if(facingDirection == 3)
            {
                direction = 'W';
            }
            System.out.println(xCoordinate + "" + yCoordinate + "" + direction);
        }

        public void process(String commands)
        {
            for(int i = 0; i < commands.length(); i++)
            {
                process(commands.charAt(i));
            }
        }

        private void process(Character command)
        {
            if(command.equals('L'))
            {
                turnLeft();
            }else if(command.equals('R'))
            {
                turnRight();
            }else if(command.equals('M'))
            {
                move();
            }else
            {
                throw new IllegalArgumentException("There is no such command" + command);
            }
        }
//providing the mars rover with direction of movement
        private void move()
        {
            if (facingDirection == N)
            {
                this.yCoordinate++;
            }else if (facingDirection == E)
            {
                this.xCoordinate++;
            } else if (facingDirection == S)
            {
                this.yCoordinate--;
            } else if (facingDirection == W)
            {
                this.xCoordinate--;
            }
        }

        private void turnRight()
        {
            facingDirection = (facingDirection + 1) < N ? W : facingDirection + 1;
        }

        private void turnLeft()
        {
            facingDirection = (facingDirection - 1) < N ? W : facingDirection - 1;
        }
}
