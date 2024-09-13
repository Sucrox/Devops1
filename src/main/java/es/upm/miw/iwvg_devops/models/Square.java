package es.upm.miw.iwvg_devops.models;

public class Square {

    private int side;

    public Square(int side){
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int area (){
        return side * side;
    }
}
