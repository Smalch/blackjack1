/**
 * Created by student1 on 11.11.16.
 */
public class Main {

    public static void main(String[] args) {
        for (Suit s : Suit.values())
            for (Value v : Value.values()) {
                Card c = new Card(s,v);
                System.out.println(c);
            }
    }
}
