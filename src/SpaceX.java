/**
 * Created by yurezzz13 on 22.03.18.
 */
public class SpaceX extends Rocket implements RocketParamCalculating {

    int timeToOrbitalSpeed;

        @Override

        public void getTimeToOrbitalSpeed(int rocketPower, int rocketWeight){

            timeToOrbitalSpeed = (int) (Rocket.ORBITAL_SPEED/(rocketWeight+rocketPower));


            System.out.println("Time to orbital speed " + timeToOrbitalSpeed);
        }

    }




