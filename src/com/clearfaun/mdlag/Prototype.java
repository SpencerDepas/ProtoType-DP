package com.clearfaun.mdlag;

/**
 * Created by SpencerDepas on 6/14/16.
 */
public interface Prototype<T> extends Cloneable {

    public T clone() throws CloneNotSupportedException;
}