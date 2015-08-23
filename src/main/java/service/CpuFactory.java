package service;

import pojo.internal.MainOrder;
import pojo.product.Cpu;

import java.util.HashMap;

/**
 * Created by jimin on 8/23/15.
 */
public class CpuFactory {

  private static final HashMap<Cpu.CpuType, Cpu> cpuHashMap = new HashMap<>();

  public static synchronized Cpu getCpu(Cpu.CpuType cpuType) {
    Cpu cpu = cpuHashMap.get(cpuType);
    if (cpu == null) {
      cpuHashMap.put(cpuType, new Cpu(cpuType));
    }
    return cpu;
  }

}
