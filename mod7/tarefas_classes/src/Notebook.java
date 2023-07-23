public class Notebook {

    //Info Notebook
    private String brand;

    private String processor;
    private String memory;
    private String hd;
    private String color;
    private Double value;

    //Constructor Methods
    public Notebook(String brand, String processor, String memory, String hd, String color, Double value) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.value = value;
    }

    /**
     * Getter Brand information
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getValue() {
        return value;
    }

}
