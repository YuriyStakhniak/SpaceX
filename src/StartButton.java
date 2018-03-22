
public class StartButton {

		public static void pushStartButton(int rocketPower, int rocketWeight, String destination) {
			
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
