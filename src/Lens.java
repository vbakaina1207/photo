public class Lens {
    private double minFocalLength;
    private double maxFocalLength;
    private static int lensCounter = 0;

    public Lens(double minFocalLength, double maxFocalLength) {
        if (maxFocalLength <= minFocalLength)
            throw new IllegalArgumentException("Max focal length must be greater than min focal length");
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        lensCounter++;
    }

    public double getMinFocalLength(){
        return minFocalLength;
    }

    public double getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMinFocalLength(double minFocalLength) {
        if (maxFocalLength <= minFocalLength)
            throw new IllegalArgumentException("Max focal length must be greater than min focal length");
        this.minFocalLength = minFocalLength;
    }

    public void  setMaxFocalLength(double maxFocalLength){
        if (maxFocalLength <= minFocalLength)
            throw new IllegalArgumentException("Max focal length must be greater than min focal length");
        this.maxFocalLength = maxFocalLength;
    }

    public static int getLensCounter() {
        return lensCounter;
    }

    @Override
    public String toString () {
        return "Lens {\n      " +
                "minFocalLength = " + minFocalLength +
                ",\n      maxFocalLength = " + maxFocalLength + "\n      }";
    }
}
