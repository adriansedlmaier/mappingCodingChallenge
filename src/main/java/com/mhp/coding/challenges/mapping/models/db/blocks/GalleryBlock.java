package com.mhp.coding.challenges.mapping.models.db.blocks;

import com.mhp.coding.challenges.mapping.models.db.Image;
import com.mhp.coding.challenges.mapping.models.dto.blocks.ArticleBlockDto;
import com.mhp.coding.challenges.mapping.models.dto.blocks.GalleryBlockDto;

import java.util.List;
import java.util.stream.Collectors;

public class GalleryBlock extends ArticleBlock {

    private List<Image> images;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public GalleryBlockDto toDto() {
        GalleryBlockDto blockDto = new GalleryBlockDto();
        blockDto.setSortIndex(getSortIndex());
        blockDto.setImages(images.stream().map(Image::toDto).collect(Collectors.toList()));

        return blockDto;
    }
}
