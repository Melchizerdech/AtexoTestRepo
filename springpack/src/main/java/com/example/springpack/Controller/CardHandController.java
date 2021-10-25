package com.example.springpack.Controller;

import com.example.cardgame.CardGameSetup;
import com.example.cardgame.CardHand;
import com.example.cardgame.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@RestController
public class CardHandController {

    @GetMapping("/showHand")
    public ArrayList<Card> showHand()
    {
        if (CardGameSetup.cardList.isEmpty())
        {
            new CardGameSetup().startGame();
        }
        ArrayList<Card> unsortedList = new CardHand().getHand();
        ArrayList<String> cardName = new ArrayList<>();
        return unsortedList;
    }

    @GetMapping("sortedHand")
    public ArrayList<Card> showSortedHand()
    {
        if (CardGameSetup.unsortedHand.isEmpty())
        {
            ArrayList<Card> errorHand = new ArrayList<>();
            errorHand.add(new Card("No hand set", "", 0));
            return errorHand;
        }
        ArrayList<Card> sortedHand = new ArrayList<>(CardGameSetup.unsortedHand);
        Collections.sort(sortedHand, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getCardStrength() - (o2.getCardStrength());
            }
        });
        return sortedHand;
    }

    @GetMapping("/reset")
    public String resetGame()
    {
        new CardGameSetup().startGame();
        return "The game has been reset, you will get a new card strength order";
    }
}
