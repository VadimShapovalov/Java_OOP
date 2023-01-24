package seminar_6.exercise_1;

import java.util.Arrays;

/*
Пользователь выбирает способ разблокировки телефона: без пароля; пин; 
отпечаток пальца; лицо.
class Unlocker {
 	private int mode;  // режим
 	private int pin;  // на случай пин-кода
 	private String fingerprint;  // на случай отпечатка пальца
 	private String faceID;  // на случай лица
}
Найдите решение, которое отвечает SRP и OCP 
*/

public class Main {
    public static void main(String[] args) {
        Iterable<Unlocker<String>> unlockerList = Arrays.asList(new UnlockerMode(), new UnlockerByPin(),
                new UnlockerByFingerprint(), new UnlockerByFaceId());
        for (Unlocker<String> unlocker : unlockerList) {
            System.out.println(unlocker.howToUnlocked());
        }
    }
}