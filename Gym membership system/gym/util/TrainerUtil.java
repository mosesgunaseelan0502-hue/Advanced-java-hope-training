package gym.util;

public class TrainerUtil {

    public static String assignTrainer(int validity) {

        if (validity == 1) {
            return "Trainer 1";
        }
        else if (validity == 6) {
            return "Trainer 2";
        }
        else {
            return "Trainer 3";
        }
    }
}