package com.geilerscheiss.novaluna.model;

import java.util.List;

public class ColorTask {
    List<CardColor> cardColors;

    public ColorTask(List<CardColor> cardColors) {
        this.cardColors = cardColors;
    }

    public List<CardColor> getCardColors() {
        return cardColors;
    }

    public void setCardColors(List<CardColor> cardColors) {
        this.cardColors = cardColors;
    }
}
