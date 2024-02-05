package com.myblog.myblog1.service;

import com.myblog.myblog1.payload.CommentDto;
import com.myblog.myblog1.payload.PostDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);

    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);


    PostDto deletePostById(long id);

    List<PostDto> getPostsByIds(List<Long> ids);


}
