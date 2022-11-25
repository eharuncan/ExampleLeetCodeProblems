package org.example;

public interface IResolvable {
    Object resolve(Object inputObject, Object expectedObject);
    Object resolve(Object inputObject);
}
