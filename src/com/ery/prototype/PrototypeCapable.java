package com.ery.prototype;

public interface PrototypeCapable extends Cloneable {
    PrototypeCapable clone() throws CloneNotSupportedException;
}
