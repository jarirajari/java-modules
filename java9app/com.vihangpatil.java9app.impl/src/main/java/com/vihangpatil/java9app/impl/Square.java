package com.vihangpatil.java9app.impl;

import com.vihangpatil.java9app.api.Shape;

/**
 * @author Vihang Patil <vihang.patil@gmail.com>
 */
public class Square implements Shape {

    final int side;

    public Square(final int side) {
        this.side = side;
    }

    @Override
    public long getArea() {
        return Math.round(1.0 * side * side);
    }
}
