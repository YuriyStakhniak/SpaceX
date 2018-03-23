
public class StartButton {

	public static void pushStartButton(int rocketPower, int rocketWeight, String planetName) {

		Rocket.Cabin cabin = new Rocket.Cabin();
		SpaceX spaceX = new SpaceX();

		if (planetName.equals(Planets.MARS.name)) {
			cabin.start(rocketPower, rocketWeight, Planets.MARS.destination);
			spaceX.getTimeToOrbitalSpeed(rocketPower, rocketWeight);

		} else {
			System.out.println("Sorry we can't get here");
		}

	}

}
