public class SpaceX extends Rocket implements RocketParamCalculating {

	@Override

	public void getTimeToOrbitalSpeed(int rocketPower, int rocketWeight) {

		System.out.println("Time to orbital speed " + Rocket.ORBITAL_SPEED / (rocketWeight + rocketPower));
	}
}
