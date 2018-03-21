/**
 * Created by yurezzz13 on 21.03.18.
 */
public class SpaceXRocket extends Rocket{


    public SpaceXRocket(long destination, int rocketPower, int rocketWeight) {
        super(destination, rocketPower, rocketWeight);
    }


    @Override
    public boolean readyToStart() {
        return false;
    }
}
