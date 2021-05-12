package chapters1.pkg7;

public class Cup {

    private String color;
    private int maxVolumeInMililiters;
    private int currentVolumeInMililiters;

    public Cup() {
        color = "";
        maxVolumeInMililiters = 0;
        currentVolumeInMililiters = 0;
    }

    public Cup(String color, int maxVolumeInMililiters, int currentVolumeInMililiters) {
        this.color = color;
        this.maxVolumeInMililiters = maxVolumeInMililiters;
        this.currentVolumeInMililiters = currentVolumeInMililiters;
    }

    public String getColor() {
        return color;
    }

    public int getMaxVolumeInMililiters() {
        return maxVolumeInMililiters;
    }

    public int getCurrentVolumeInMililiters() {
        return currentVolumeInMililiters;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxVolumeInMililiters(int maxVolumeInMililiters) {
        this.maxVolumeInMililiters = maxVolumeInMililiters;
    }

    public void setCurrentVolumeInMililiters(int currentVolumeInMililiters) {
        this.currentVolumeInMililiters = currentVolumeInMililiters;
    }
    
    
    @Override
    public String toString(){
        return String.format("Color: %s -  Max Volume: %dml - Current Volume: %dml"
                , color, maxVolumeInMililiters, currentVolumeInMililiters);
    }
}
