import java.util.Scanner;

public class RectangleArea {
    private double length, width, area=0;
    public RectangleArea(){
    getData();
    }
    public void getData(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter length");
        this.length=input.nextDouble();
        System.out.println("enter width");
        this.width=input.nextDouble();
    }
    public void computeData(){
        area=length*width;
    }
    public void fieldDisplay(){
        System.out.println("Length "+length+" Width "+width+" Area = "+area);
    }
}
