package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return snake.get(0).getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		Location nextXYPos = new Location(0,0);
		switch (this.currentDirection) {
		
		case UP:{
			nextXYPos = new Location(snake.get(0).getLocation().x,snake.get(0).getLocation().y-1);
			break;
		}
		
		case LEFT:{
			nextXYPos = new Location(snake.get(0).getLocation().x-1,snake.get(0).getLocation().y);
			break;
		}
		
		case DOWN:{
			nextXYPos = new Location(snake.get(0).getLocation().x,snake.get(0).getLocation().y+1);
			break;
		}
		
		case RIGHT:{
			nextXYPos = new Location(snake.get(0).getLocation().x+1,snake.get(0).getLocation().y);
			break;
		}
		
		}
		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		for(int i = snake.size()-1; i > 0; i--) {
			this.snake.get(i).setLocation(this.snake.get(i-1).getLocation());
		}
		
		//3. set the location of the head to the new location calculated in step 1
		this.snake.get(0).setLocation(nextXYPos);

		//4. set canMove to true
		this.canMove = true;
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
		if(this.canMove) {
			if((currentDirection == Direction.UP && d != Direction.DOWN)||(currentDirection == Direction.LEFT && d != Direction.RIGHT)||(currentDirection == Direction.DOWN && d != Direction.UP)||(currentDirection == Direction.RIGHT && d != Direction.LEFT)) {
				currentDirection = d;
				canMove = false;
			}
		}
	}

	public void reset(Location loc) {
		//1. clear the snake
		this.snake.clear();
		//2. set the location of the head
		Location l = new Location(0,0);
		this.head.setLocation(l);
		//3. add the head to the snake
		this.snake.add(this.head);
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		if(this.snake.get(0).getLocation().x < 0 || this.snake.get(0).getLocation().y < 0 || this.snake.get(0).getLocation().x > 14 || this.snake.get(0).getLocation().y > 11) {
			return true;
		}
		return false;
	}
	
	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		for(int i = 1; i < this.snake.size(); i++) {
			if(this.snake.get(0).getLocation().x == this.snake.get(i).getLocation().x && this.snake.get(0).getLocation().y == this.snake.get(i).getLocation().y) {
				return true;
			}
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		for(int i = 0; i < this.snake.size(); i++) {
			if(loc.x == this.snake.get(i).getLocation().x && loc.y == this.snake.get(i).getLocation().y) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
