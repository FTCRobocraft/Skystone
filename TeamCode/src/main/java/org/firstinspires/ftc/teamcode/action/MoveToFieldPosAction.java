package org.firstinspires.ftc.teamcode.action;

import org.firstinspires.ftc.robotcore.external.matrices.VectorF;
import org.firstinspires.ftc.teamcode.hardware.SkyStoneRobotHardware;
import org.firstinspires.ftc.teamcode.playmaker.Action;
import org.firstinspires.ftc.teamcode.playmaker.RobotHardware;
import org.firstinspires.ftc.teamcode.util.EncoderDrive;

public class MoveToFieldPosAction implements Action {

    float X;
    float Y;
    float Z;
    double timeout;
    EncoderDrive encoderDrive;

    public MoveToFieldPosAction(float X, float Y, float Z, double timeout) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
        this.timeout = timeout;
    }

    @Override
    public void init(RobotHardware hardware) {
        if (hardware instanceof SkyStoneRobotHardware) {
            encoderDrive = new EncoderDrive(hardware.omniDrive);
            VectorF location = ((SkyStoneRobotHardware) hardware).cameraNavigation.getRobotPosition();
        }


    }


    @Override
    public boolean doAction(RobotHardware hardware) {

        return true;
    }

    public Double progress() {
        return null;
    }

    public String progressString() {
        return null;
    }
}
