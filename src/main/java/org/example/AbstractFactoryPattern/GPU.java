package org.example.AbstractFactoryPattern;

/**
 * hume actually mei GPU ka assemble method call krna hai, lekin kyuki kaafi types ke GPU hp skte hai
 * hence interface bnaya, and individual type ke GPU, isko implement kr lenge
 *
 * now problem is, jo required GPU hai, sorf ussi ka assemble method call krna hai, hence iske liye factoryMethod pattern
 */
public interface GPU {
    void assemble();
}
