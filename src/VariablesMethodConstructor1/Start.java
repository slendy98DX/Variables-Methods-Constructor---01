package VariablesMethodConstructor1;

public class Start {
    public static void main(String[] args) {
        House house1,house2;
        house1 = new House();
        house1.address = "Via Roma 1";
        house1.numberOfFloors = 3;
        System.out.println("Created house at address " + house1.address + " with " + house1.numberOfFloors + " floors");
        house2 = new House();
        house2.address = "Via Vittoria 5";
        house2.numberOfFloors = 2;
        System.out.println("Created house at address " + house2.address + " with " + house2.numberOfFloors + " floors");
    }
}
