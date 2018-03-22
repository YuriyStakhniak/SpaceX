public class SpaceX extends Rocket implements RocketParamCalculating {

    @Override

    public void getTimeToOrbitalSpeed(int rocketPower, int rocketWeight) {

        int timeToOrbitalSpeed;

        timeToOrbitalSpeed = Rocket.ORBITAL_SPEED / (rocketWeight + rocketPower);

        System.out.println("Time to orbital speed " + timeToOrbitalSpeed);
    }
}




