public class Ball {

    int x, y, speed;

    public Ball(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(){

        this.x += this.speed;
    }
}
