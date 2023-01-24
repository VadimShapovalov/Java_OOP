package seminar_6.exercise_1;

public class UnlockerByFingerprint implements Unlocker<String> {

    @Override
    public String howToUnlocked() {
        return "Разблокировка отпечатком пальца.\n";
    }

}