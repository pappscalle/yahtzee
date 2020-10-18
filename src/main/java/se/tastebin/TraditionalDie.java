package se.tastebin;

import java.util.Random;

public class TraditionalDie implements Die {

    private final Random r = new Random();
    private final int sides;
    private int value;
    private boolean hold = false;

    public TraditionalDie() {
        this(6, 1);
    }

    public TraditionalDie(int initialValue) {
        this(6, initialValue);
    }

    public TraditionalDie(int sides, int initialValue) {
        if (initialValue < 1 || initialValue > sides) {
            throw new IllegalArgumentException();
        }
        this.sides = sides;
        this.value = initialValue;
    }

    @Override
    public void roll() {
        if (!hold) {
            this.value = r.nextInt(this.sides) + 1;
        }
    }

    @Override
    public void hold() {
        hold = true;
    }

    @Override
    public void release() {
        hold = false;
    }

    @Override
    public int value() {
        return this.value;
    }

    @Override
    public String toString() {
        return "[" + this.value + "]";
    }

}
