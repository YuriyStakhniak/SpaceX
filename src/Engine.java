/**
 * Created by yurezzz13 on 22.03.18.
 */
public class Engine {

    long minTankCapacity = 1000000000000000l;
    long maxTankCapacity = 2000000000000000l;
    long fuel;

    public long getFuel(){

        fuel = minTankCapacity + (long) (Math.random() * maxTankCapacity);


      return fuel;
    }

}
