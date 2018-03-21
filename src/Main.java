

/**
 * Created by yurezzz13 on 21.03.18.
 */
public class Main {

    public static void main(String[] args) {

        long destination = Long.parseLong(args[0]);
        int rocketPower = Integer.parseInt(args[1]);
        int rocketWeight = Integer.parseInt(args[2]);


        Rocket rocket = new SpaceXRocket(destination, rocketPower, rocketWeight);

    }

}
