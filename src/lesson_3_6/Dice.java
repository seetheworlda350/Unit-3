package lesson_3_6;

public class Dice {
    private int value;

    public Dice(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public boolean equals(Dice otherDice){
        return this.value == otherDice.getValue();
    }

    @Override
    public String toString() {
        return "Dice{" +
                "value=" + value +
                '}';
    }
}
