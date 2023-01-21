package com.techstack.generator;

import com.techstack.computers.Computer;
import com.techstack.computers.DesktopPC;
import com.techstack.computers.component.*;
import com.techstack.computers.component.cpu.*;
import com.techstack.computers.component.graphiccard.GPUInfo;
import com.techstack.computers.component.graphiccard.GraphicCard;
import com.techstack.computers.component.graphiccard.GraphicSoftware;
import com.techstack.computers.component.motherboard.*;

import java.util.List;
import java.util.UUID;

public class DesktopPCGenerator {

    private DesktopPCGenerator() {}

    static DesktopPC generate() {
        return DesktopPC.builder()
                .uuid(UUID.randomUUID())
                .nameAndModelInfo("Artline Gaming X55 White")
                .type(Computer.Type.DESKTOPPC)
                .psu(generatePSUForDesktopPC())
                .tower(generateTowerForDesktopPC())
                .cpu(generateCPUForDesktopPC())
                .ram(List.of(
                        generateRAMForDestopPC(),
                        generateRAMForDestopPC()))
                .hardDrive(List.of(generateHardDriveForDesktopPC()))
                .graphicCard(generateGraphicCardForDestopPC())
                .motherboard(generateotherboardForDesktopPC())
                .os(generateOsForDesktopPC())
                .build();
    }

    private static Os generateOsForDesktopPC() {
        return Os.builder()
                .operationalSystem(Os.Type.WINDOWS10)
                .price(90.0f).build();
    }

    private static Motherboard generateotherboardForDesktopPC() {
        return Motherboard.builder()
                .motherboardMainInfo(MotherboardMainInfo.builder()
                        .socket("Intel LGA 1200")
                        .formFactor("ATX").build())
                .motherboardChipset(MotherboardChipset.builder()
                        .chipset("Intel Z490")
                        .bios("Ami").build())
                .motherboardMemory(MotherboardMemory.builder()
                        .ramSlots(4)
                        .operationMode("DIMM")
                        .maxClockFrequencyInMHz(5000)
                        .maxMemoryInGb(128).build())
                .videoOutputs(VideoOutputs.builder()
                        .outputVGA(false)
                        .outputHDMI(true)
                        .outputDisplayPort(false).build())
                .integratedAudio(IntegratedAudio.builder()
                        .audioChip("Realtek ALC1220-VB")
                        .soundChannels(7.1f).build())
                .driveInterface(DriveInterface.builder()
                        .countOfSATA3(6)
                        .countOfM2Connectors(3).build())
                .networkInterface(NetworkInterface.builder()
                        .wifi("Wi-Fi 5 (802.11aс) / Intel Wi-Fi 6 AX201 /")
                        .bluetooth("Bluetooth v 5.0")
                        .lanController("Intel 2.5GbE")
                        .lanSpeedInGbps(2.5f).build())
                .expansionSlots(ExpansionSlots.builder()
                        .pciExpress16Slots(3).build())
                .externalConnections(ExternalConnections.builder()
                        .usb2Slots(6)
                        .usb3Slots(4).build())
                .powerConnectors(PowerConnectors.builder()
                        .mainPowerSocketPin(24)
                        .cpuPower("8+8 pin")
                        .fanPowerConnectorsCount(7).build())
                .price(200.0f)
                .build();
    }

    private static GraphicCard generateGraphicCardForDestopPC() {
        return GraphicCard.builder()
                .connectionInterface("PCI-E v4.0")
                .gpuInfo(GPUInfo.builder()
                        .gpuModel("NVIDIA GeForce RTX 3060")
                        .architecture("Ampere")
                        .memorySizeInGb(12)
                        .memoryType("DDR6")
                        .memoryBusBit(192)
                        .gpuClockSpeedInMHz(1837)
                        .memoryClockInMHz(15000)
                        .lithographyInNm(8)
                        .maxResolution("7680x4320 px").build())
                .graphicSoftware(GraphicSoftware.builder()
                        .directX("12 Ultimate")
                        .openGLVersion(4.6f)
                        .vrSupport(true).build())
                .price(300.0f)
                .build();
    }

    private static HardDrive generateHardDriveForDesktopPC() {
        return HardDrive.builder()
                .sizeGb(1000)
                .yearsOfWarranty(2)
                .connectionInterface("SATA 3")
                .cacheMemoryMb(64)
                .dataTransferRate("150 MB/s")
                .shockproofInG(30)
                .readingNoiseLevelInDb(30)
                .standByNoiseLevelInDb(29)
                .price(100.0f).build();
    }

    private static RAM generateRAMForDestopPC() {
        return RAM.builder()
                .sizeInGb(8)
                .memoryRank("two-rank")
                .memoryTiming("16-16-16-36")
                .moduleHeightInMm(44)
                .price(80.0f).build();
    }

    private static CPU generateCPUForDesktopPC() {
        return CPU.builder()
                .cpuMainInfo(CPUMainInfo.builder()
                        .series("Core i7")
                        .model("11700K")
                        .codeName("Rocket Lake")
                        .socket("Intel LGA 1200")
                        .lithographyNM(14).build())
                .coresAndThreads(CoresAndThreads.builder()
                        .cores(8)
                        .threads(16)
                        .multithreading(true).build())
                .cpuSpeed(CPUSpeed.builder()
                        .clockSpeedGHz(3.6f)
                        .boostClockSpeedGHz(5.0f).build())
                .cacheL3Mb(16)
                .cpuSpecs(CPUSpecs.builder()
                        .igpModel("UHD Graphics 750")
                        .frontSideBus("8 GT/s")
                        .tdp("125W")
                        .instructions("SSE4.1, SSE4.2, AVX2")
                        .freeMultiplier(true)
                        .pciExpressSupport(4.0f)
                        .maxOperatingTemperature(100).build())
                .cpuMemory(CPUMemory.builder()
                        .maxRAMSizeGB(128)
                        .maxRAMSpeedMHz(3200)
                        .countRAMChannels(2).build())
                .price(250.0f)
                .build();
    }

    private static Tower generateTowerForDesktopPC() {
        return Tower.builder()
                .towerType(Tower.Type.FULLTOWER)
                .price(70.0f)
                .build();
    }

    private static PSU generatePSUForDesktopPC() {
        return PSU.builder()
                .powerW(650)
                .fanBearing("hydrodynamic")
                .cpuPowerConnectors("24+8+8(4+4) pin")
                .sataConnectors(7)
                .pciExpressConnectors(4)
                .yearsOfWarranty(5)
                .price(100.0f).build();
    }
}
