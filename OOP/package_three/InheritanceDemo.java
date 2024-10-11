package package_three;

class InheritanceDemo {
    public static void main(String[] args){
        MountainBicycle mountainBicycle = new MountainBicycle(20,10,1);
        System.out.println("Gear is: " + mountainBicycle.gear);
        System.out.println("Seat height is: " + mountainBicycle.seatHeight);
        System.out.println("Bike speed is: " + mountainBicycle.speed);
        mountainBicycle.applyBreak(1);
        System.out.println("Bike speed after applying break is :" + mountainBicycle.speed);
    }
}
