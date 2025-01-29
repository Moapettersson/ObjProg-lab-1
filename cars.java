import java.awt.*;

public class cars implements movable{

    protected int nrDoors; // Number of doors on the car, only subclasses can access but you need to use getter and setter
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

    protected double x;
    protected double y;
    protected String direction;


    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public void setDirection(String dir) {direction = dir;}

    public String getDirection() {return direction;}


    public void move() {
        switch (direction) {
            case "North": y += currentSpeed;
            case "East": x+=currentSpeed;
            case "South": y -= currentSpeed;
            case "West": x-=currentSpeed;
        }

    }

    public void turnLeft() {
        switch (direction) {
            case "North":
                setDirection("West");
            case "East":
                setDirection("North");
            case "South":
                setDirection("East");
            case "West":
                setDirection("South");
        }

    }

    public void turnRight() {
            switch (direction) {
                case "North": setDirection("East");
                case "East": setDirection("South");
                case "South": setDirection("West");
                case "West": setDirection("North");
        }

    }
}

