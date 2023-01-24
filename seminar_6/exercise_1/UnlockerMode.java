package seminar_6.exercise_1;

public class UnlockerMode implements Unlocker<String> {

    @Override
    public String howToUnlocked() {
        return "Режим без пароля.\n";
    }

}