public class Main {
    public static void main(String[] args) {
        Lens lens1 = new Lens(24, 70);
        Lens lens2 = new Lens(800, 700);

        Camera camera1 = new Camera("Nikon", 24, 3.2, false, lens1);
        Camera camera2 = new Camera("Canon", 36, 3.0, true, lens1);

        System.out.println("Camera1");
        System.out.println(camera1);

        System.out.println("Camera2");
        System.out.println(camera2);

        System.out.println("Change lens for camera1");
        camera1.setLens(lens2);
        System.out.println(camera1);
        System.out.println("Total cameras created: " + Camera.getCameraCounter());
        System.out.println("Total lenses created: " + Lens.getLensCounter());
    }
}
