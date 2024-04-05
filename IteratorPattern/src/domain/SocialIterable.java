package domain;

import java.util.ArrayList;

public class SocialIterable implements ISocialIterable {

    private ArrayList<Profile> profiles;

    public SocialIterable() {
        profiles = new ArrayList<>();
    }

    @Override
    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public IProfileIterator createProfileIterator() {
        return new ProfileIterator(profiles);
    }

}