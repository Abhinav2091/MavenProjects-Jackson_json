package com.luv2code.samplePractice.lists;

public class IntegerSingleLinkListNode {

    private int value;
    private IntegerSingleLinkListNode integerSingleLinkListNode;

    public IntegerSingleLinkListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntegerSingleLinkListNode getIntegerSingleLinkListNode() {
        return integerSingleLinkListNode;
    }

    public void setIntegerSingleLinkListNode(IntegerSingleLinkListNode integerSingleLinkListNode) {
        this.integerSingleLinkListNode = integerSingleLinkListNode;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
