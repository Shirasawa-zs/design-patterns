package test.java.design.principle.LoD;

import main.java.design.principle.LoD.Boss;
import main.java.design.principle.LoD.TeamLeader;

public class LoDTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandChecknum(teamLeader);
    }
}
