import java.util.Scanner;
import java.util.Objects;

class card {
    private String rank;
    private String suit;
    
    public card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }

   
public boolean equals(Object o) {
    if (this == o)
        return true;
    if (o == null || getClass() != o.getClass())
        return false;

    card other = (card) o;
    return rank.equals(other.rank) && suit.equals(other.suit);
}
        public int hashCode() {
            return Objects.hash(rank, suit);
        }
}

public class Driver {

    public static void main(String[] args){
        Scanner S=new Scanner(System.in);

        System.out.println("Enter the number of cards: ");
        int n=S.nextInt();
        S.nextLine();

        card c[]=new card[n];
        for(int i=0;i<n;i++){


            System.out.println("Enter the rank of card " + (i+1) + ": ");
            String rank=S.nextLine();

            System.out.println("Enter the suit of card " + (i+1) + ": ");
            String suit=S.nextLine();

            c[i]=new card(rank, suit);

             boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (c[i].equals(c[j])) {
                    System.out.println("Duplicate found: " + c[i]);
                    duplicate = true;
                    break;
                }
            }

          //  c[i] = new card(rank, suit);
        }

        S.close();
    }
    
}
