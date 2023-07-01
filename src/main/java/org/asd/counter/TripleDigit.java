package org.asd.counter;

public class TripleDigit extends CounterState{
    public TripleDigit(Counter counter) {
        super(counter);
    }

    @Override
    void increment() {
        counter.setCount(counter.getCount() + 3);
        upgradeCounter();

    }

    @Override
    void decrement() {
        counter.setCount(counter.getCount() - 3);
        upgradeCounter();
    }
}
