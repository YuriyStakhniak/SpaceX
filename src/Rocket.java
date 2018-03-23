abstract class Rocket {

	static final int ORBITAL_SPEED = 800000000;

	static class Cabin {
		Engine engine = new Engine();
		void start(int destination, int rocketPower, int rocketWeight) {
			if (fuelEnoughCheck(rocketPower, rocketWeight)>= destination) {
				startConditionsInfo(rocketPower, rocketWeight);
			} else {
				startFailedConditionsInfo(rocketPower, rocketWeight);
			}
		}

		int fuelConsumptionCalculating(int rocketPower, int rocketWeight) {
			return rocketPower * rocketWeight;
		}

		void startConditionsInfo(int rocketPower, int rocketWeight) {
			System.out.println("You've got " + engine.getFuel() + " gallons of fuel");
			System.out.println("Value of fuel consumption " + fuelConsumptionCalculating(rocketPower, rocketWeight)
					+ " gallons per mile");
			System.out.println("We are going to Mars");
		}

		void startFailedConditionsInfo(int rocketPower, int rocketWeight) {
			System.out.println("Sorry, you stay at home");
			System.out.println("You've got " + engine.getFuel() + " gallons of fuel");
			System.out.println("You should know " + "value of fuel consumption in this case might be "
					+ fuelConsumptionCalculating(rocketPower, rocketWeight) + " gallons per mile");
		}

		long fuelEnoughCheck(int rocketPower, int rocketWeight){
			return engine.getFuel() / fuelConsumptionCalculating(rocketPower, rocketWeight);
		}
	}
}
