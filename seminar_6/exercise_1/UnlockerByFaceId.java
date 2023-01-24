package seminar_6.exercise_1;

public class UnlockerByFaceId implements Unlocker<String> {

    @Override
    public String howToUnlocked() {
        return "Разблокировка лицом.\n";
    }

}