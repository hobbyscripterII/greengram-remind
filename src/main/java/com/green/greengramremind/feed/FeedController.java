package com.green.greengramremind.feed;

import com.green.greengramremind.feed.model.*;
import com.green.greengramremind.user.model.ResVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/feed")
public class FeedController {
    private final FeedService feedService;

    @PostMapping
    public ResVo insFeed(@RequestBody FeedInsDto dto) {
        return new ResVo(0);
    }

    @GetMapping
    public List<FeedSelVo> getFeed(FeedGetDto dto) {
        return null;
    }

    @GetMapping("fav")
    public ResVo toggleFeedFav(FeedFavDto dto) {
        return null;
    }

    @PostMapping("comment")
    public ResVo insFeedComment(@RequestBody FeedCommentInsDto dto) {
        return null;
    }

    @GetMapping("comment")
    public List<FeedCommentGetVo> getFeedComment(FeedCommentGetDto dto) {
        return null;
    }
}
