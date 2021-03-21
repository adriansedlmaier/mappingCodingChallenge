package com.mhp.coding.challenges.mapping.models.db;

import com.mhp.coding.challenges.mapping.models.dto.ImageDto;

public class Image extends DBEntity {

    private String url;

    private ImageSize imageSize;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = imageSize;
    }

    public ImageDto toDto() {
        ImageDto imageDto = new ImageDto();
        imageDto.setId(getId());
        imageDto.setUrl(this.url);
        imageDto.setImageSize(this.imageSize);

        return imageDto;
    }
}
