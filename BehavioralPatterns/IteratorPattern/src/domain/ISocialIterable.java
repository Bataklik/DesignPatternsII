package domain;

public interface ISocialIterable {

    IProfileIterator createProfileIterator();

    void addProfile(Profile profile);
}