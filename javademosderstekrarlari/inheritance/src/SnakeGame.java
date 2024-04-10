import java.util.Random;
public class SnakeGame
{
    private int foodX, foodY;
    public void generateFood()
    {
        Random random = new Random();
        foodX = random.nextInt(10);
        foodY = random.nextInt(10);
    }
    public static void main(String[] args)
    {
        SnakeGame game = new SnakeGame();
        game.generateFood();
        System.out.println("Food location: (" + game.foodX + ", " + game.foodY + ")");
    }
}