import java.util.Objects;

class Point {

    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object o){
        if(this==o)
            return true;
        else
            return false;
    }
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }


public class Driver{

    public static void main(String[] args){

        Point p[]={
            new Point(1,2),
            new Point(1,2),
            new Point(2,3),
            new Point(3,4),
            new Point(3,4),
            new Point(5,6),
            new Point(7,8),
            new Point(7,8), 
            new Point(9,10)
        };

        int count=0;
        for(int i=0;i<p.length;i++){
            boolean isDistinct=true;
            for(int j=0;j<i;j++){
                if(p[i].equals(p[j])){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct){
                count++;
            }
        }
        System.out.println("Number of distinct points: " + count);
    }
}

    
