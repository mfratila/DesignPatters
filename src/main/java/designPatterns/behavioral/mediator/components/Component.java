package designPatterns.behavioral.mediator.components;

import designPatterns.behavioral.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
