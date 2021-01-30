package com.geilerscheiss.novaluna.model;

public class CardBoard {
    private Card[][] cardboard;

    public CardBoard(int x, int y) {
        cardboard = new Card[x][y];
    }

    public Card[][] getCardboard() {
        return cardboard;
    }

    public void setCardboard(Card[][] cardboard) {
        this.cardboard = cardboard;
    }

    public Card getCard(int x, int y){
        return this.cardboard[x][y];
    }

    public void setCard(Card card, int x, int y){
        this.cardboard[x][y] = card;
    }
}
