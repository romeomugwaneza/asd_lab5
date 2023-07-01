package org.asd.counter;

public abstract class CounterState {
    protected final Counter counter;

    public CounterState(Counter counter) {
        this.counter = counter;
    }
    abstract void increment();
    abstract void decrement();
    void upgradeCounter(){
        if (counter.getCount() < 10)
            counter.setCounterState(new SingleDigit(counter));
        else if (counter.getCount() >= 10 && counter.getCount() < 100)
            counter.setCounterState(new DoubleDigit(counter));
        else if (counter.getCount() >= 100)
            counter.setCounterState(new TripleDigit(counter));
    }
}
