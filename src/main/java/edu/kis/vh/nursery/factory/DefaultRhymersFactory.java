package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * DefaultRhymersFactory - class that fallows factory pattern, implements RhymersFactory interface, responsible for creating and returning DefaultCountingOutRhymer class' objects
 */
public class DefaultRhymersFactory implements RhymersFactory {

    /**
     * creates and returns new DefaultCountingOutRhymer class' object
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * creates and returns new DefaultCountingOutRhymer class' object
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * creates and returns new FIFORhymer class' object as DefaultCountingOutRhymer type
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * creates and returns new HanoiRhymer class' object as DefaultCountingOutRhymer type
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
