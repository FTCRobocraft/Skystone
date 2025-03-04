package org.firstinspires.ftc.teamcode.autonomous.executors;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.autonomous.sequences.FetchAndParkSequence;
import org.firstinspires.ftc.teamcode.hardware.BaseHardware;
import org.firstinspires.ftc.teamcode.hardware.SkyStoneRobotHardware;
import org.firstinspires.ftc.teamcode.playmaker.ActionSequence;
import org.firstinspires.ftc.teamcode.playmaker.AutonomousExecutor;
import org.firstinspires.ftc.teamcode.playmaker.RobotHardware;

@Autonomous(name="BL - Fetch and Park")
public class BLFetchAndParkExecutor extends AutonomousExecutor {

    SkyStoneRobotHardware robotHardware;

    @Override
    public RobotHardware getHardware() {
        robotHardware = new SkyStoneRobotHardware(this);
        return robotHardware;
    }

    @Override
    public ActionSequence getActionSequence() {
        return new FetchAndParkSequence(BaseHardware.Team.BLUE, BaseHardware.StartingPosition.RIGHT);
    }

    @Override
    public void init() {
        super.init();
        robotHardware.startTracking();
    }
}
