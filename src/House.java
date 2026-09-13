public class House {
    private int floors;
    private int rooms;
    private int bedrooms;
    private int bathrooms;
    private boolean garage;
    private boolean garden;

    public House(int floors, int rooms, int bedrooms, int bathrooms,
                 boolean garage, boolean garden) {

        
        
        this.floors = floors;
        this.rooms = rooms;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.garage = garage;
        this.garden = garden;
    }
    public void showInfo() {
        System.out.println("House information:");
        System.out.println("Floors: " + floors);
        System.out.println("Rooms: " + rooms);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
        System.out.println("Garage: " + garage);
        System.out.println("Garden: " + garden);
    }
}
