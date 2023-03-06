package designPatterns.behavioral.iterator.iterators;

import designPatterns.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
