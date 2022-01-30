package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_ARRAY_LENGTH = 12;
    private static final int FULL = 11;
    private static final int CALL = -1;
    private static final int CALL_CHECKED = -1;
    private static final int TOTAL_INITIAL_VALUE = -1;

    private final int[] numbers = new int[NUMBERS_ARRAY_LENGTH];
    private int total = TOTAL_INITIAL_VALUE;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CALL;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return CALL_CHECKED;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return CALL_CHECKED;
        return numbers[total--];
    }

}
