package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) throws IllegalArgumentException{
        if (imageTypes == ImageTypes.BMP){
            return new BmpReader();
        }
        if (imageTypes == ImageTypes.PNG){
            return new PngReader();
        }
        if (imageTypes == ImageTypes.JPG) {
            return new JpgReader();
        }
        throw new IllegalArgumentException("Input incorrect");
    }

}
