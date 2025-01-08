package p1603;

public class Test {
    public static void main(String[] args) {
        /*
         * Input ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"] [[1,
         * 1, 0], [1], [2], [3], [1]]
         * Output
         * [null, true, true, false, false]
         */
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        System.out.println(obj.addCar(1)); // true
        System.out.println(obj.addCar(2)); // true
        System.out.println(obj.addCar(3)); // false
        System.out.println(obj.addCar(1)); // false
    }
}
