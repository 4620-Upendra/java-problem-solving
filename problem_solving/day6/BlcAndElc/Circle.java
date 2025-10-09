public class Circle{
    private double radius;
    
    public void setRadius(double r){
        this.radius=r;
    }
    public double  getRadius(){
        return this.radius;
    }
    public double areaOfCircle(){            //A=πr2
        return Math.PI*radius*radius;
    }
    public double DiameterOfCircle(){         //d=2r
        return 2*radius;
    }
    public double perimeterOfCircle(){      //p=2πr
        return 2*Math.PI*radius;
    }

}
