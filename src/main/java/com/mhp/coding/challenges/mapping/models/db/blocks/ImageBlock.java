package com.mhp.coding.challenges.mapping.models.db.blocks;

import com.mhp.coding.challenges.mapping.models.db.Image;
import com.mhp.coding.challenges.mapping.models.dto.blocks.ImageBlockDto;

public class ImageBlock extends ArticleBlock {

    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public ImageBlockDto toDto() {
        ImageBlockDto imageBlockDto = new ImageBlockDto();
        imageBlockDto.setSortIndex(getSortIndex());
        imageBlockDto.setImage(getImage().toDto());

        return imageBlockDto;
    }
}
