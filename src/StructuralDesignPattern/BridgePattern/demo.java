package StructuralDesignPattern.BridgePattern;

import StructuralDesignPattern.BridgePattern.devices.Device;
import StructuralDesignPattern.BridgePattern.devices.Radio;
import StructuralDesignPattern.BridgePattern.devices.TV;
import StructuralDesignPattern.BridgePattern.remotes.AdvancedRemote;
import StructuralDesignPattern.BridgePattern.remotes.BasicRemote;

public class demo {
    public static void main(String[] args) {
        System.out.println("--- Bridge Design Pattern ----");
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("-- Test Device with Basic Remote ---");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.volumeUp();
        device.printStatus();

        System.out.println("-- Test Device with Advanced Remote ---");
        AdvancedRemote advRemote = new AdvancedRemote(device);
        advRemote.power();
        advRemote.mute();
        device.printStatus();
    }
}
