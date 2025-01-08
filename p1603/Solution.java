package p1603;

class ParkingSystem {
    int[] availableSpaces;

    public ParkingSystem(int big, int medium, int small) {
        availableSpaces = new int[] { big, medium, small };
    }

    public boolean addCar(int carType) {
        if (availableSpaces[carType - 1] > 0) {
            availableSpaces[carType - 1]--;
            return true;
        } else {
            return false;
        }
    }
}