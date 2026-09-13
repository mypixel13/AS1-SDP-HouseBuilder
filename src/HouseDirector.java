public class HouseDirector {

    public House buildSmallHouse() {
        return new HouseBuilder()
                .setFloors(1)
                .setRooms(3)
                .setBedrooms(1)
                .setBathrooms(1)
                .setGarage(false)
                .setGarden(true)
                .build();
    }

    public House buildFamilyHouse() {
        return new HouseBuilder()
                .setFloors(2)
                .setRooms(6)
                .setBedrooms(3)
                .setBathrooms(2)
                .setGarage(true)
                .setGarden(true)
                .build();
    }

    public House buildLuxuryHouse() {
        return new HouseBuilder()
                .setFloors(3)
                .setRooms(10)
                .setBedrooms(5)
                .setBathrooms(4)
                .setGarage(true)
                .setGarden(true)
                .build();
    }
}
