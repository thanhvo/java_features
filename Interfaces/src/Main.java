public class Main {
    public static void main(String[] args) {
        String producer = Vehicle.producer();
        System.out.println(producer);
        Vehicle vehicle = new VehicleImpl();
        String overview = vehicle.getOverview();
        System.out.println(overview);
    }
}
