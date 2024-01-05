public class magicPiano {
  private int keyCount = 88;
  private String brand = "Steinway";
  private String model = "Model D";
  
  // constructors
  public magicPiano() {
    System.out.println("A new piano was created.");
  }
  public magicPiano(int keyCount, String brand, String model) {
    this.keyCount = keyCount;
    this.brand = brand;
    this.model = model;
    System.out.println("A new piano was created.");
  }

  // getters and setters
  public int getKeyCount() {
    return keyCount;
  }
  public void setKeyCount(int keyCount) {
    this.keyCount = keyCount;
  }
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
}
