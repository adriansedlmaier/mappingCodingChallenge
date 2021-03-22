package com.mhp.coding.challenges.mapping.models.db.blocks;

import com.mhp.coding.challenges.mapping.models.dto.blocks.VideoBlockDto;

public class VideoBlock extends ArticleBlock {

    private String url;

    private VideoBlockType type;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoBlockType getType() {
        return type;
    }

    public void setType(VideoBlockType type) {
        this.type = type;
    }

    @Override
    public VideoBlockDto toDto() {
        VideoBlockDto blockDto = new VideoBlockDto();
        blockDto.setSortIndex(getSortIndex());
        blockDto.setUrl(getUrl());
        blockDto.setType(getType());

        return blockDto;
    }
}
