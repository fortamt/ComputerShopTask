package com.techstack.generator;

import com.techstack.computers.Computer;
import com.techstack.computers.Laptop;
import com.techstack.computers.component.*;
import com.techstack.computers.component.cpu.*;
import com.techstack.computers.component.graphiccard.GPUInfo;
import com.techstack.computers.component.graphiccard.GraphicCard;
import com.techstack.computers.component.graphiccard.GraphicSoftware;
import com.techstack.computers.component.motherboard.*;

import java.util.List;
import java.util.UUID;

public class LaptopGenerator {

    private LaptopGenerator() {}

    static Laptop generate() {
        return Laptop.builder()
                .uuid(UUID.randomUUID())
                .nameAndModelInfo("Asus ROG Strix G15 G513IM")
                .type(Computer.Type.LAPTOP)
                .screen(generateScreenForLaptop())
                .cpu(generateCPUorLaptop())
                .ram(List.of(
                        generateRAMForLaptop(),
                        generateRAMForLaptop()))
                .hardDrive(List.of(generateHardDriveForLaptop()))
                .graphicCard(generateGraphicCardForLaptop())
                .motherboard(generateMotherboardForLaptop())
                .battery(generateBatteryForLaptop())
                .weightInKg(3.2f)
                .os(generateOsForLaptop())
                .build();
    }

    private static Os generateOsForLaptop() {
        return Os.builder()
                .operationalSystem(Os.Type.ABSENT).build();
    }

    private static Battery generateBatteryForLaptop() {
        return Battery.builder()
                .batteryCapacity("90 W*h")
                .operatingTime("3 hours")
                .fastCharge(true)
                .chargingTime("50% in 30 min")
                .price(150.0f).build();
    }

    private static Motherboard generateMotherboardForLaptop() {
        return Motherboard.builder()
                .motherboardMainInfo(MotherboardMainInfo.builder()
                        .socket("FP6")
                        .formFactor("laptop").build())
                .motherboardChipset(MotherboardChipset.builder()
                        .chipset("N/A")
                        .bios("ASUS ROG gaming").build())
                .motherboardMemory(MotherboardMemory.builder()
                        .ramSlots(2)
                        .operationMode("SO-DIMM")
                        .maxClockFrequencyInMHz(3200)
                        .maxMemoryInGb(32).build())
                .videoOutputs(VideoOutputs.builder()
                        .outputVGA(false)
                        .outputHDMI(true)
                        .outputDisplayPort(true).build())
                .integratedAudio(IntegratedAudio.builder()
                        .audioChip("Realtek")
                        .soundChannels(7.1f).build())
                .driveInterface(DriveInterface.builder()
                        .countOfSATA3(1)
                        .countOfM2Connectors(2).build())
                .networkInterface(NetworkInterface.builder()
                        .wifi("Wi-Fi 6(802.11ax) (Dual band) 2*2")
                        .bluetooth("Bluetooth 5.1")
                        .lanController("asus")
                        .lanSpeedInGbps(1.0f).build())
                .expansionSlots(ExpansionSlots.builder()
                        .pciExpress16Slots(0).build())
                .externalConnections(ExternalConnections.builder()
                        .usb2Slots(1)
                        .usb3Slots(3).build())
                .powerConnectors(PowerConnectors.builder()
                        .cpuPower("plug")
                        .fanPowerConnectorsCount(2).build())
                .price(300.0f)
                .build();
    }

    private static GraphicCard generateGraphicCardForLaptop() {
        return GraphicCard.builder()
                .connectionInterface("embedded in motherboard")
                .gpuInfo(GPUInfo.builder()
                        .gpuModel("NVIDIA GeForce RTX 3060")
                        .architecture("Ampere")
                        .memorySizeInGb(6)
                        .memoryType("GDDR6")
                        .memoryBusBit(192)
                        .gpuClockSpeedInMHz(1802)
                        .memoryClockInMHz(9000)
                        .lithographyInNm(8)
                        .maxResolution("1920x1080 px").build())
                .graphicSoftware(GraphicSoftware.builder()
                        .directX("12")
                        .openGLVersion(4.6f)
                        .vrSupport(true).build())
                .price(300.0f)
                .build();
    }

    private static HardDrive generateHardDriveForLaptop() {
        return HardDrive.builder()
                .sizeGb(512)
                .yearsOfWarranty(1)
                .connectionInterface("SATA 3")
                .cacheMemoryMb(64)
                .dataTransferRate("150 MB/s")
                .shockproofInG(30)
                .readingNoiseLevelInDb(30)
                .standByNoiseLevelInDb(29)
                .price(50.0f).build();
    }

    private static RAM generateRAMForLaptop() {
        return RAM.builder()
                .sizeInGb(8)
                .memoryRank("two-rank")
                .memoryTiming("16-16-16-36")
                .moduleHeightInMm(25)
                .price(75.0f).build();
    }

    private static CPU generateCPUorLaptop() {
        return CPU.builder()
                .cpuMainInfo(CPUMainInfo.builder()
                        .series("Ryzen 7")
                        .model("4800H")
                        .codeName("Renoir (Zen 2)")
                        .socket("FP6")
                        .lithographyNM(7).build())
                .coresAndThreads(CoresAndThreads.builder()
                        .cores(8)
                        .threads(16)
                        .multithreading(true).build())
                .cpuSpeed(CPUSpeed.builder()
                        .clockSpeedGHz(2.9f)
                        .boostClockSpeedGHz(4.2f).build())
                .cacheL3Mb(12)
                .cpuSpecs(CPUSpecs.builder()
                        .igpModel("AMD Radeon™ Graphics")
                        .frontSideBus("N/A")
                        .tdp("45W")
                        .instructions("SSE4.1, SSE4.2, AVX2")
                        .freeMultiplier(true)
                        .maxOperatingTemperature(95).build())
                .cpuMemory(CPUMemory.builder()
                        .maxRAMSizeGB(32)
                        .maxRAMSpeedMHz(3200)
                        .countRAMChannels(2).build())
                .price(300.0f)
                .build();
    }

    private static Screen generateScreenForLaptop() {
        return Screen.builder()
                .screenSizeInch(15.6f)
                .surfaceTreatment("anti-reflective")
                .screenResolution("1920x1080 (16:9)")
                .refreshRateInHz(144)
                .brightness("250 cd/m2")
                .price(250.0f).build();
    }
}
