package assesment;

public class Monitor {

    Resolution resolution = new Resolution();
    String model;
    String manufacturer;
    public String color = "red";

    public void drawPixel(int x, int y){
        System.out.println("Drawing pixel at " + x + "," + y + " " + "in color " + color);
    }

}
