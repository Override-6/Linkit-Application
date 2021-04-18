package fr.linkit.app.core.profile;

public class SimpleUserProfile implements UserProfile {
    @Override
    public void speak() {
        System.out.println("Hello !");
    }
}
