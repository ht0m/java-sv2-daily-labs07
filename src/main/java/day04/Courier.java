package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride ride) {

            if ((rides.size() == 0 && ride.getNth() == 1)
                    || rides.size() != 0 && rides.get(rides.size() - 1).getDay() == ride.getDay() && rides.get(rides.size() - 1).getNth() + 1 == ride.getNth()
                    || rides.size() != 0 && rides.get(rides.size() - 1).getDay() < ride.getDay() && ride.getNth() == 1) {
                rides.add(ride);
            } else {
                throw new IllegalArgumentException("Illegal Data!");
            }
        }

//        if (rides.size() == 0) {
//            if(ride.getNth() == 1) {
//                rides.add(ride);
//            } else {
//                throw new IllegalArgumentException("Illegal nth for new day.");
//            }
//        } else if (rides.get(rides.size() - 1).getDay() > ride.getDay()) {
//            throw new IllegalArgumentException("Illegal day.");
//        } else if (rides.get(rides.size() - 1).getDay() < ride.getDay()) {
//            if(ride.getNth() == 1) {
//                rides.add(ride);
//            } else {
//                throw new IllegalArgumentException("Illegal nth for new day.");
//            }
//        } else if (/* rides.get(rides.size() - 1).getDay() == ride.getDay() && */
//                rides.get(rides.size() - 1).getNth() + 1 != ride.getNth()) {
//            throw new IllegalArgumentException("Illegal nth.");
//        } else {
//            rides.add(ride);
//        }

}
