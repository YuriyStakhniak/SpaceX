class Engine {

	long getFuel() {

		long minTankCapacity = 1000000000000000L;
		long maxTankCapacity = 2000000000000000L;
		return minTankCapacity + (long) (Math.random() * maxTankCapacity);
	}
}
