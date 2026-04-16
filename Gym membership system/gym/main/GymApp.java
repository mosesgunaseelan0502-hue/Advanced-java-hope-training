package gym.main;

import java.util.Scanner;
import gym.model.Member;
import gym.service.GymService;
import gym.util.TrainerUtil;

public class GymApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GymService service = new GymService();

        while (true) {

            System.out.println("\n----GYM MANAGEMENT SYSTEM----");
            System.out.println("1 Add Member");
            System.out.println("2 Delete Member");
            System.out.println("3 Show Members");
            System.out.println("4 Update Plan");
            System.out.println("5 Show Plan Members");
            System.out.println("6 Show Payment Status");
            System.out.println("7 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter plan (Basic/Premium): ");
                    String plan = sc.nextLine();

                    System.out.print("Enter validity (1/6/12 months): ");
                    int validity = sc.nextInt();
                    sc.nextLine();

                    String trainer = "No Trainer";

                    if (plan.equalsIgnoreCase("Premium")) {
                        trainer = TrainerUtil.assignTrainer(validity);
                    }

                    Member m = new Member(
                            name,
                            plan,
                            validity,
                            "Active",
                            "Completed",
                            trainer
                    );

                    service.addMember(m);
                    break;

                case 2:

                    System.out.print("Enter name: ");
                    String del = sc.nextLine();

                    service.deleteMember(del);
                    break;

                case 3:

                    service.showMembers();
                    break;

                case 4:

                    System.out.print("Enter name: ");
                    String up = sc.nextLine();

                    System.out.print("Enter new plan: ");
                    String newPlan = sc.nextLine();

                    service.updatePlan(up, newPlan);
                    break;

                case 5:

                    System.out.print("Enter plan: ");
                    String p = sc.nextLine();

                    service.showByPlan(p);
                    break;

                case 6:

                    System.out.print("Enter payment status (Completed/Pending): ");
                    String pay = sc.nextLine();

                    service.showPayment(pay);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}