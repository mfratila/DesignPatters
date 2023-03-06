package designPatterns.behavioral.visitor.visitor;

import designPatterns.behavioral.visitor.shapes.Circle;
import designPatterns.behavioral.visitor.shapes.CompoundShape;
import designPatterns.behavioral.visitor.shapes.Dot;
import designPatterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}

