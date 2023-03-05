package by.teachmeskils.homeworks.hw_03032023.robot;

import by.teachmeskils.homeworks.hw_03032023.robot.hands.SamsungHand;
import by.teachmeskils.homeworks.hw_03032023.robot.hands.SonyHand;
import by.teachmeskils.homeworks.hw_03032023.robot.hands.ToshibaHand;
import by.teachmeskils.homeworks.hw_03032023.robot.heads.SamsungHead;
import by.teachmeskils.homeworks.hw_03032023.robot.heads.SonyHead;
import by.teachmeskils.homeworks.hw_03032023.robot.heads.ToshibaHead;
import by.teachmeskils.homeworks.hw_03032023.robot.legs.SamsungLeg;
import by.teachmeskils.homeworks.hw_03032023.robot.legs.SonyLeg;
import by.teachmeskils.homeworks.hw_03032023.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        IRobot robot1 = new Robot(new SamsungHead(200), new ToshibaHand(410), new SonyLeg(780));
        robot1.action();
        System.out.println("_________________________");
        IRobot robot2 = new Robot(new SonyHead(235), new SamsungHand(510), new ToshibaLeg(650));
        robot2.action();
        System.out.println("_________________________");
        IRobot robot3 = new Robot(new ToshibaHead(378), new SonyHand(447), new SamsungLeg(745));
        robot3.action();
        System.out.println("_________________________");
        if ((robot1.getPrice() > robot2.getPrice()) && (robot1.getPrice() > robot3.getPrice())) {
            System.out.println("Самый дорогой робот - Robot_1");
        } else if ((robot2.getPrice() > robot1.getPrice()) && (robot2.getPrice() > robot3.getPrice())) {
            System.out.println("Самый дорогой робот - Robot_2");
        } else {
            System.out.println("Самый дорогой робот - Robot_3");
        }
    }
}
