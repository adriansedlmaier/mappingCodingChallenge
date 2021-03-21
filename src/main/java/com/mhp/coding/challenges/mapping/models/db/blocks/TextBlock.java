package com.mhp.coding.challenges.mapping.models.db.blocks;

import com.mhp.coding.challenges.mapping.models.dto.blocks.TextBlockDto;

public class TextBlock extends ArticleBlock {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public TextBlockDto toDto() {
        TextBlockDto textBlockDto = new TextBlockDto();
        textBlockDto.setSortIndex(this.getSortIndex());
        textBlockDto.setText(getText());

        return textBlockDto;
    }
}
