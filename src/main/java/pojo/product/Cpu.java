package pojo.product;

/**
 * Created by jimin on 8/23/15.
 */
public class Cpu {
  public enum CpuType{
    I3,
    I5,
    I7,
    E3
  }

  private CpuType cpuType;
  private float price;
  private float baseFrequency;
  private float turboFrequency;

  public Cpu(CpuType cpuType) {
    this.cpuType = cpuType;
  }

  public float getPrice() {
    return price;
  }

  public float getBaseFrequency() {
    return baseFrequency;
  }

  public float getTurboFrequency() {
    return turboFrequency;
  }

  public void setCpuType(CpuType cpuType) {
    this.cpuType = cpuType;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public void setBaseFrequency(float baseFrequency) {
    this.baseFrequency = baseFrequency;
  }

  public void setTurboFrequency(float turboFrequency) {
    this.turboFrequency = turboFrequency;
  }
}
