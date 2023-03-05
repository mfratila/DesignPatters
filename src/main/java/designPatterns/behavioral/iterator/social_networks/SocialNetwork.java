package designPatterns.behavioral.iterator.social_networks;

import designPatterns.behavioral.iterator.iterators.ProfileIterator;


public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}