package org.asd.counter;

public class SingleDigit extends CounterState{
    public SingleDigit(Counter counter) {
        super(counter);
    }

    @Override
    void increment() {
        counter.setCount(counter.getCount() + 1);
        upgradeCounter();
    }

    @Override
    void decrement() {
        counter.setCount(counter.getCount() - 1);
        upgradeCounter();
    }
}
