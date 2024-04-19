package assesment;

public class PC {

 Monitor monitor = new Monitor();
 Motherboard motherboard = new Motherboard();
 Case aCase = new Case();

    int x = 4;
    int y = 6;
    String color= "red";


    public PC(Monitor monitor, Motherboard motherboard, Case aCase) {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.aCase = aCase;
    }

    public PC() {

    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor=" + monitor +
                ", motherboard=" + motherboard +
                ", aCase=" + aCase +
                '}';
    }


    private void drawLogo(int x, int y, String color){

        monitor.drawPixel(x, y);
    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today is a case, motherboard and monitor by AlienWare.");
    }

    public void powerUp(){
        Case.pressPowerButton();
        drawLogo(x, y, color);
        Motherboard.loadProgram(motherboard.toString());
    }





















}
