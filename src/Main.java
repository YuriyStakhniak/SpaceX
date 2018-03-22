

/**
 * Created by yurezzz13 on 21.03.18.
 */
public class Main {

    public static void main(String[] args) {


        int rocketPower = Integer.parseInt(args[0]);
        int rocketWeight = Integer.parseInt(args[1]);
        String destination = args[2];

        Rocket.Cabin cabin = new Rocket.Cabin();
        SpaceX spaceX = new SpaceX();


        switch (destination) {
            case "Mars":
                cabin.start(rocketPower, rocketWeight, Planets.MARS.destination);
                spaceX.getTimeToOrbitalSpeed(rocketPower, rocketWeight);
                break;
            default:
                System.out.println("Sorry we can't get here");
                break;
        }
    }

}