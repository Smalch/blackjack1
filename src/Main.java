import Command.Command;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by student1 on 11.11.16.
 */
public class Main {

    public static void main(String[] args) {
        List<Player> players = new LinkedList<>();
        players.add(new Computer());
        players.add(new Computer());
        players.add(new Human());
        Dealer dealer = new Dealer();
        players.add(dealer);

        for(Player player: players){
            dealer.deal(player);
            dealer.deal(player);
            System.out.println(player.hand);
        }


        for(Player player: players){
            while(true){
                Command command = player.decision(); //decision-решение
                if(command==Command.STAND)
                    break;
                if (command ==Command.HIT)
                    dealer.deal(player);
            }
        }
    }
}
