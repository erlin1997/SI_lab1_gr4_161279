import java.util.ArrayList;

public class Canvas {

    private String color;
    private ArrayList<Points> points;

    public Points(String color){
        this.color = color;
        points = new ArrayList<Points>();
    }

    public String getColor() {
        return color;
    }

   

    public boolean add(Points points){

        if (!points.contains(points)){
        	points.add(points);
            return true;
        }
        return false;
    }


    public void remove(Points points){
        points.remove(points);
    }


    public void remove(int i){
        points.remove(i);
    }


    public Points getPoints(int i){
        return points.get(i);
    }

    public static void main(String[] args) {

    }