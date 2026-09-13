public class HouseBuilder {

    private int floors;
    private int rooms;
    private int bedrooms;
    private int bathrooms;
    private boolean garage;
    private boolean garden;


    public HouseBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
        return this;
    }
    public HouseBuilder setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    public HouseBuilder setGarage(boolean garage) {
        this.garage = garage;
        return this;
    }

    public HouseBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }

    public House build() {

        if (floors <= 0) {
            throw new IllegalStateException("House must have at least one floor.");
        }

        if (rooms <= 0) {
            throw new IllegalStateException("House must have at least one room.");
        }

        if (bedrooms > rooms) {
            throw new IllegalStateException("Bedrooms cannot exceed total rooms.");
        }

        if (bathrooms <= 0) {
            throw new IllegalStateException("House must have at least one bathroom.");
        }

        return new House(
                floors,
                rooms,
                bedrooms,
                bathrooms,
                garage,
                garden
        );
    }
}
