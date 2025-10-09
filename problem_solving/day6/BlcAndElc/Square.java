public class Square {
    private int side;

    public void setSide(int side){
        this.side=side;
    }
    public int getSide(){
        return side;
    }
    public int areOfSquare(){
        return side*side;               //A=a2
    }
    public int PerimeterOfSquare(){
        return 4*side;               //p=4s
    }

}
