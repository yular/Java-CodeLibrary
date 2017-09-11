package com.yulartech.designpattern.proxypattern;

public class Main {
    public static void main(String[] args){
        String imageFileName = "test-image.png";
        ProxyImageService proxyImageService = new ProxyImageService(imageFileName);

        //Show image from actual service
        proxyImageService.showImage();
        System.out.println();

        //Show image from proxy service
        proxyImageService.showImage();
        System.out.println();
    }
}
