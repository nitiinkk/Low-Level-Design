package StructuralDesignPattern.FacadePattern.facade;

import StructuralDesignPattern.FacadePattern.*;

public class VideoConversionFacade {
    public void convertVideo(String filename, String format) {
        System.out.println("VideoConversionFacade: conversion started...");
        VideoFile file = new VideoFile(filename);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if(format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OGGCompresionCodec();
        }

        System.out.println("VideoConversionFacade: conversion completed !!");
    }
}
