package PointAndMoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed=0;
    private float ySpeed=0;

    public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arrSpeed={this.xSpeed, this.ySpeed};
        return  arrSpeed;
    }
    @Override
    public String toString(){
        return "( " + super.getX()+ " , "+ super.getY()+ " ) "+ "speed=( "+xSpeed+" , "+ySpeed+" )";
    }

    public MoveablePoint move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
