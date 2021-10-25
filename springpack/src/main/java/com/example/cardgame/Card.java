package com.example.cardgame;

public class Card {

    public String cardName;
    public int cardStrength;
    public String cardColor;
    //card img?

    public Card(String cardColor, String cardName, int cardStrength)
    {
        this.cardName = cardName;
        this.cardStrength = cardStrength;
        this.cardColor = cardColor;
    }

    public String getCardName()
    {
        return cardName;
    }

    public String getCardColor()
    {
        return cardColor;
    }

    public int getCardStrength()
    {
        return cardStrength;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardColor(String cardColor)
    {
        this.cardColor = cardColor;
    }

    public void setCardStrength(int cardStrength) {
        this.cardStrength = cardStrength;
    }
}
