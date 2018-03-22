public class Main {

    public static void main(String[] args) {

        int rocketPower = Integer.parseInt(args[0]);
        int rocketWeight = Integer.parseInt(args[1]);
        String destination = args[2];

      StartButton.pushStartButton(rocketPower, rocketWeight, destination);
      
    }
}