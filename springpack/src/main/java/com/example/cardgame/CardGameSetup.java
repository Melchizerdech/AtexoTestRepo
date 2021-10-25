package com.example.cardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CardGameSetup {

    public static ArrayList<Card> cardList = new ArrayList<>();
    public ArrayList<String> cardColorStrengthOrder = new ArrayList<>();
    public ArrayList<String> cardValueStrengthOrder = new ArrayList<>();
    public static ArrayList<Card> unsortedHand = new ArrayList<>();

    public void CardGameSetup()
    {
    }

    public void startGame()
    {
        cardList.clear();
        setCardList();
    }

    private void setCardList()
    {
        cardColorStrengthOrder = setColorStrength();
        cardValueStrengthOrder = setValueStrength();
        int cardStrength = 0;
        for (int index = 0; index < CardSetConstant.CARD_NUMBER;index++)
        {
            for (String cardColor : cardColorStrengthOrder)
            {
                for (String cardValue : cardValueStrengthOrder)
                {
                    cardList.add(new Card(cardColor, cardValue, cardStrength));
                    cardStrength++;
                }
            }
        }
    }

    private ArrayList<String> setColorStrength()
    {
        ArrayList<String> randomizedStrength = new ArrayList<>(Arrays.asList(CardSetConstant.cardsColor));
        Collections.shuffle(randomizedStrength);
        return randomizedStrength;
    }

    private ArrayList<String> setValueStrength()
    {
        ArrayList<String> randomizedStrength = new ArrayList<>(Arrays.asList(CardSetConstant.cardsValue));
        Collections.shuffle(randomizedStrength);
        return randomizedStrength;
    }
}
