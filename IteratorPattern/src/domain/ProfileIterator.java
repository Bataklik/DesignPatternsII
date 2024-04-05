package domain;

import java.util.ArrayList;

public class ProfileIterator implements IProfileIterator {

    private ArrayList<Profile> profiles;
    private int currentProfile = 0;

    public ProfileIterator(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }

    public boolean hasNext() {
        return currentProfile < profiles.size();
    }

    public Profile next() {
        Profile profile = profiles.get(currentProfile);
        currentProfile = currentProfile + 1;
        return profile;
    }

    public void reset() {
        currentProfile = 0;
    }

}