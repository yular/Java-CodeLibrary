package com.yulartech.designpattern.proxypattern;

public class RealImageService implements ImageService {
    private String imageFileName;

    RealImageService(String imageFileName){
        this.imageFileName = imageFileName;
        upLoadImage();
    }

    private void upLoadImage() {
        final String msg = String.format("Successfully upload image %s to the service.", imageFileName);
        System.out.println(msg);
    }

    @Override
    public void showImage() {
        final String msg = String.format("Show the image %s.", imageFileName);
        System.out.println(msg);
    }
}
