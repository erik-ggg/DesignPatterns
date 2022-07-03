package abstractfactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        System.out.println(modernFurnitureFactory.createChair().getName());
        System.out.println(modernFurnitureFactory.createSofa().getName());
        System.out.println(victorianFurnitureFactory.createChair().getName());
        System.out.println(victorianFurnitureFactory.createSofa().getName());
    }
}
