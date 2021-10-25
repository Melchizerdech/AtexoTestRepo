package com.example.cardgame;

import java.util.ArrayList;
import java.util.Random;

public class CardHand {

    public ArrayList<Card> unsortedHand = new ArrayList<>();

    public void CardHand()
    {

    }

    public ArrayList<Card> getHand()
    {
        Random rand = new Random();

        for (int index = 0;index < CardSetConstant.NUMBER_OF_CARD_IN_HAND;index++)
        {
            int randomNumber = rand.nextInt(CardSetConstant.CARD_NUMBER);
            unsortedHand.add(CardGameSetup.cardList.get(randomNumber));
        }
        CardGameSetup.unsortedHand = unsortedHand;
        return unsortedHand;
    }

}
