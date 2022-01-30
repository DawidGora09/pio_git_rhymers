package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

// TODO: needs refactoring - redundant public modifiers
public interface RhymersFactory {

    public DefaultCountingOutRhymer getStandardRhymer();

    public DefaultCountingOutRhymer getFalseRhymer();

    public DefaultCountingOutRhymer getFIFORhymer();

    public DefaultCountingOutRhymer getHanoiRhymer();

}
