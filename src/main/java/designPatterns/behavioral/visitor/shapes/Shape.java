package designPatterns.behavioral.visitor.shapes;

import designPatterns.behavioral.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
