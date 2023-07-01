package org.asd.counter;

public class DoubleDigit extends CounterState{
    public DoubleDigit(Counter counter) {
        super(counter);
    }

    @Override
    void increment() {
        counter.setCount(counter.getCount() + 2);
        upgradeCounter();
    }

    @Override
    void decrement() {
        counter.setCount(counter.getCount() - 2);
        upgradeCounter();
    }
}
