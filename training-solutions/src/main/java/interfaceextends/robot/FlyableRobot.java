package interfaceextends.robot;

public interface FlyableRobot extends MovableRobot{
    void liftTo(long altitude);

    void setNewPositionAndAddToPath(Point position);
}
