package com.yulartech.designpattern.proxypattern;

public class ProxyImageService implements ImageService{
    private RealImageService realImageService;
    private String imageFileName;
    private boolean isImageCached;

    public ProxyImageService(String imageFileName){
        this.imageFileName = imageFileName;
        this.isImageCached = false;
    }

    @Override
    public void showImage() {
        if (realImageService == null) {
            realImageService = new RealImageService(imageFileName);
        }

        if (isImageCached) {
            final String msg = String.format("Get image %s from cache in proxy. ", imageFileName);
            System.out.print(msg);
        }
        realImageService.showImage();
        cacheImageInProxy();
    }

    private void cacheImageInProxy() {
        isImageCached = true;
    }
}
