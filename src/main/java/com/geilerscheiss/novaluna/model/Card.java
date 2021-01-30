package com.geilerscheiss.novaluna.model;

public class Card {
    private CardColor color;
    private ColorTask[] colorTasks;

    public Card() {
        colorTasks = new ColorTask[3];
    }

    public CardColor getColor() {
        return color;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public ColorTask[] getColorTasks() {
        return colorTasks;
    }

    public void setColorTasks(ColorTask[] colorTasks) {
        this.colorTasks = colorTasks;
    }
}
