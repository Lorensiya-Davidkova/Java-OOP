package PointInRectangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] coordinates=scanner.nextLine().split(" ");
        Point pointBL=new Point(Float.parseFloat(coordinates[0]),Float.parseFloat(coordinates[1]));
        Point pointTR=new Point(Float.parseFloat(coordinates[2]),Float.parseFloat(coordinates[3]));
        Rectangle rectangle=new Rectangle(pointBL,pointTR);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String[] searchPointCoordinates=scanner.nextLine().split(" ");
            Point searchPoint=new Point(Float.parseFloat(searchPointCoordinates[0]),Float.parseFloat(searchPointCoordinates[1]));
          System.out.println(rectangle.contains(searchPoint));
        }
    }
}
