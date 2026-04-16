package gym.service;

import java.util.*;
import gym.model.Member;
import gym.util.TrainerUtil;

public class GymService {

    private ArrayList<Member> members = new ArrayList<>();

    public void addMember(Member m) {
        members.add(m);
        System.out.println("Member added successfully");
    }

    public void deleteMember(String name) {

        Iterator<Member> it = members.iterator();

        while (it.hasNext()) {

            Member m = it.next();

            if (m.getName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Member deleted");
                return;
            }
        }

        System.out.println("Member not found");
    }

    public void updatePlan(String name, String newPlan) {

        for (Member m : members) {

            if (m.getName().equalsIgnoreCase(name)) {

                m.setPlan(newPlan);

                if (newPlan.equalsIgnoreCase("Premium")) {
                    m.setTrainer(TrainerUtil.assignTrainer(m.getValidity()));
                } else {
                    m.setTrainer("No Trainer");
                }

                System.out.println("Plan updated");
                return;
            }
        }

        System.out.println("Member not found");
    }

    public void showMembers() {

        for (Member m : members) {

            System.out.println("Name : " + m.getName());
            System.out.println("Plan : " + m.getPlan());
            System.out.println("Validity : " + m.getValidity());
            System.out.println("Status : " + m.getStatus());
            System.out.println("Payment : " + m.getPayment());
            System.out.println("Trainer : " + m.getTrainer());
            System.out.println("-------------------------");
        }
    }

    public void showByPlan(String plan) {

        for (Member m : members) {

            if (m.getPlan().equalsIgnoreCase(plan)) {

                System.out.println("Name : " + m.getName());
                System.out.println("Plan : " + m.getPlan());
                System.out.println("-------------------------");
            }
        }
    }

    public void showPayment(String status) {

        for (Member m : members) {

            if (m.getPayment().equalsIgnoreCase(status)) {

                System.out.println("Name : " + m.getName());
                System.out.println("Payment : " + m.getPayment());
                System.out.println("-------------------------");
            }
        }
    }
}