package com.techstack.generator;

import com.techstack.computers.AllInOne;
import com.techstack.computers.Computer;
import com.techstack.computers.component.*;
import com.techstack.computers.component.cpu.*;
import com.techstack.computers.component.graphiccard.GPUInfo;
import com.techstack.computers.component.graphiccard.GraphicCard;
import com.techstack.computers.component.graphiccard.GraphicSoftware;
import com.techstack.computers.component.motherboard.*;

import java.util.List;

public class AllInOneGenerator {

    private AllInOneGenerator(){}

    static AllInOne generate() {
        return AllInOne.builder()
                .nameAndModelInfo("Artline Gaming G77 G77v45Win")
                .type(Computer.Type.ALLINONE)
                .screen(generateScreenForAllInOne())
                .psu(generatePSUForAllInOne())
                .cpu(generateCPUForAllInOne())
                .ram(List.of(
                        generateRamForAllInOne()))
                .hardDrive(List.of(generateHardDriveForAllInOne()))
                .graphicCard(generateGraphicCardForAllInOne())
                .motherboard(generateMotherboardForAllInOne())
                .os(generateOsForAllInOne())
                .build();
    }

    private static Os generateOsForAllInOne() {
        return Os.builder().operationalSystem(Os.Type.WINDOWS11).build();
    }

    private static Motherboard generateMotherboardForAllInOne() {
        return Motherboard.builder()
                .motherboardMainInfo(MotherboardMainInfo.builder()
                        .socket("Intel 1700")
                        .formFactor("All-in-one PC").build())
                .motherboardChipset(MotherboardChipset.builder()
                        .chipset("asus")
                        .bios("UEFI").build())
                .motherboardMemory(MotherboardMemory.builder()
                        .ramSlots(2)
                        .operationMode("SO-DIMM")
                        .maxClockFrequencyInMHz(3200)
                        .maxMemoryInGb(64).build())
                .videoOutputs(VideoOutputs.builder()
                        .outputVGA(false)
                        .outputHDMI(true)
                        .outputDisplayPort(true).build())
                .integratedAudio(IntegratedAudio.builder()
                        .audioChip("embedded").build())
                .driveInterface(DriveInterface.builder()
                        .countOfSATA3(1)
                        .countOfM2Connectors(2).build())
                .networkInterface(NetworkInterface.builder()
                        .wifi("Wi-Fi 5 (802.11aс)")
                        .bluetooth("is")
                        .lanController("RJ-45")
                        .lanSpeedInGbps(1.0f).build())
                .expansionSlots(ExpansionSlots.builder()
                        .pciExpress16Slots(1).build())
                .externalConnections(ExternalConnections.builder()
                        .usb2Slots(2)
                        .usb3Slots(4).build())
                .powerConnectors(PowerConnectors.builder()
                        .cpuPower("directly")
                        .fanPowerConnectorsCount(2).build())
                .price(150.0f)
                .build();
    }

    private static GraphicCard generateGraphicCardForAllInOne() {
        return GraphicCard.builder()
                .connectionInterface("PCI-E v4.0")
                .gpuInfo(GPUInfo.builder()
                        .gpuModel("NVIDIA GeForce RTX 3050")
                        .architecture("Ampere")
                        .memorySizeInGb(8)
                        .memoryType("GDDR6")
                        .memoryBusBit(128)
                        .gpuClockSpeedInMHz(1780)
                        .memoryClockInMHz(12000)
                        .lithographyInNm(8)
                        .maxResolution("7680x4320 px").build())
                .graphicSoftware(GraphicSoftware.builder()
                        .directX("12 Ultimate")
                        .openGLVersion(4.6f)
                        .vrSupport(true).build())
                .price(350.0f)
                .build();
    }

    private static HardDrive generateHardDriveForAllInOne() {
        return HardDrive.builder()
                .sizeGb(1000)
                .yearsOfWarranty(1)
                .connectionInterface("SATA 3")
                .cacheMemoryMb(64)
                .dataTransferRate("170 MB/s")
                .shockproofInG(30)
                .readingNoiseLevelInDb(35)
                .standByNoiseLevelInDb(32)
                .price(70.0f).build();
    }

    private static RAM generateRamForAllInOne() {
        return RAM.builder()
                .sizeInGb(64)
                .memoryRank("two-rank")
                .memoryTiming("16-16-16-36")
                .moduleHeightInMm(25)
                .price(50.0f).build();
    }

    private static CPU generateCPUForAllInOne() {
        return CPU.builder()
                .cpuMainInfo(CPUMainInfo.builder()
                        .series("Core i5")
                        .model("12400F")
                        .codeName("Alder Lake (12th Gen)")
                        .socket("Intel 1700")
                        .lithographyNM(14).build())
                .coresAndThreads(CoresAndThreads.builder()
                        .cores(6)
                        .threads(12)
                        .multithreading(true).build())
                .cpuSpeed(CPUSpeed.builder()
                        .clockSpeedGHz(2.5f)
                        .boostClockSpeedGHz(4.4f).build())
                .cacheL3Mb(18)
                .cpuSpecs(CPUSpecs.builder()
                        .igpModel("absent")
                        .frontSideBus("8 GT/s")
                        .tdp("65W")
                        .instructions("Intel® SSE4.1, Intel® SSE4.2, Intel® AVX2, Intel® AVX-512")
                        .freeMultiplier(true)
                        .pciExpressSupport(4.0f)
                        .maxOperatingTemperature(100).build())
                .cpuMemory(CPUMemory.builder()
                        .maxRAMSizeGB(128)
                        .maxRAMSpeedMHz(3200)
                        .countRAMChannels(2).build())
                .price(350.0f)
                .build();
    }

    private static PSU generatePSUForAllInOne() {
        return PSU.builder()
                .powerW(300)
                .fanBearing("N/A")
                .cpuPowerConnectors("directly")
                .sataConnectors(1)
                .pciExpressConnectors(1)
                .yearsOfWarranty(1)
                .price(100.0f).build();
    }

    private static Screen generateScreenForAllInOne() {
        return Screen.builder()
                .screenSizeInch(27)
                .surfaceTreatment("N/A")
                .screenResolution("1920x1080 (16:9) px")
                .refreshRateInHz(144)
                .brightness("245 cd/m2")
                .price(340.0f).build();
    }
}
