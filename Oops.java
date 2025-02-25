class Pen{
    String type;
    String colour;

    public void write(){
        System.out.println("writing something");
    }
}
public class Oops{
    public static void main(String[]args){
        Pen pen1=new Pen();
        pen1.type="jel";
        pen1.colour="blue";
pen1.write();

    }
}
