package Circle;

public class CircleTwo 
{
    private double radius;


    // public CircleTwo()
    // {

    //     radius = 2.0;
    // }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return (3.14 * this.radius * this.radius);
    }

}
