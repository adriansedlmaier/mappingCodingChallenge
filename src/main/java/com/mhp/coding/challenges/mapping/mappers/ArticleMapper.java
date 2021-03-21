package com.mhp.coding.challenges.mapping.mappers;

import com.mhp.coding.challenges.mapping.models.db.Article;
import com.mhp.coding.challenges.mapping.models.db.blocks.ArticleBlock;
import com.mhp.coding.challenges.mapping.models.dto.ArticleDto;
import com.mhp.coding.challenges.mapping.models.dto.blocks.ArticleBlockDto;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ArticleMapper {

    public ArticleDto map(Article article){
        ArticleDto articleDto = new ArticleDto();
        articleDto.setId(article.getId());
        articleDto.setTitle(article.getTitle());
        articleDto.setDescription(article.getDescription());
        articleDto.setAuthor(article.getAuthor());
        articleDto.setBlocks(mapBlock(article.getBlocks()));
        return articleDto;
    }

    private List<ArticleBlockDto> mapBlock(Set<ArticleBlock> blocks) {
        List<ArticleBlockDto> articleBlockDtos = new ArrayList<>();
        blocks.forEach(block -> articleBlockDtos.add(block.toDto()));
        // sort article blocks ascending
        articleBlockDtos.sort(Comparator.comparing(ArticleBlockDto::getSortIndex));

        return articleBlockDtos;
    }

    public Article map(ArticleDto articleDto) {
        // Nicht Teil dieser Challenge.
        return new Article();
    }
}
