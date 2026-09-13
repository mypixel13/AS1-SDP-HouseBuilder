public class Main {

    public static void main(String[] args) {

        HouseDirector director = new HouseDirector();

        House smallHouse = director.buildSmallHouse();
        House familyHouse = director.buildFamilyHouse();
        House luxuryHouse = director.buildLuxuryHouse();

        System.out.println("Small House:");
        smallHouse.showInfo();

        System.out.println();

        System.out.println("Family House:");
        familyHouse.showInfo();

        System.out.println();

        System.out.println("Luxury House:");
        luxuryHouse.showInfo();
    }
}
