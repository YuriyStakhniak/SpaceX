class Engine {

    long getFuel() {

        long minTankCapacity = 1000000000000000L;
        long maxTankCapacity = 2000000000000000L;
        long fuel;

        fuel = minTankCapacity + (long) (Math.random() * maxTankCapacity);

        return fuel;
    }
}
