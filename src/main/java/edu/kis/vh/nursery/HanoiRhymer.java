package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
//alt+left select previous tab, alt+right select next tab
    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
