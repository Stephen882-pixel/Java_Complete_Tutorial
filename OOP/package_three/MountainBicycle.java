package package_three;

class MountainBicycle extends Bicycle {
    public int seatHeight;
    public MountainBicycle(int startHeight,int startSpeed,int startGear){
        super(startSpeed,startGear);
        this.seatHeight = startHeight;
    }
    public  void setHeight(int newValue){

    }

}
