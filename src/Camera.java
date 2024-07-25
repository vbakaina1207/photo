public class Camera {
    private String brand;
    private int megaPixels;
    private double displaySize;
    private boolean isBlackWhite;
    private Lens lens;
    private static int cameraCounter = 0;

    public Camera (String brand, int megaPixels, double displaySize, boolean isBlackWhite, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.isBlackWhite = isBlackWhite;
        this.lens = lens;
        cameraCounter++;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public  int getMegaPixels(){
        return megaPixels;
    }

    public  void  setMegaPixels(int megaPixels){
        this.megaPixels = megaPixels;
    }

    public double getDisplaySize(){
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public boolean  getIsBlackWhite () {
       return isBlackWhite;
    }

    public void setIsBlackWhite(boolean isBlackWhite) {
        this.isBlackWhite = isBlackWhite;
    }

    public Lens getLens(){
        return lens;
    }

    public void setLens (Lens lens) {
        this.lens = lens;
    }

    public static int getCameraCounter(){
        return cameraCounter;
    }

    @Override
    public String toString(){
        return  "Camera { \n" +
                " brand = " + brand +
                ",\n megaPixels = " + megaPixels +
                ",\n displaySize = " + displaySize +
                ",\n isBlackWhite = " + isBlackWhite +
                ",\n lens = " + lens +
                "\n}";
    }
}
