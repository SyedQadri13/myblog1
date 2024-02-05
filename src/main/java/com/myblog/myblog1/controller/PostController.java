package com.myblog.myblog1.controller;

import com.myblog.myblog1.payload.CommentDto;
import com.myblog.myblog1.payload.PostDto;
import com.myblog.myblog1.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/posts?id=1
    @GetMapping
    public ResponseEntity<PostDto> getPostById(@RequestParam long id) {
        PostDto dto = postService.getPostById(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

        // http://localhost:8080/api/posts/all?pageNo=0&pageSize=1&sortBy=title&sortDir=desc
    @GetMapping("/all")
    public ResponseEntity<List<PostDto>> getAllPosts(
            @RequestParam(name = "pageNo", required = false, defaultValue = "0") int pageNo,
            @RequestParam(name = "pageSize", required = false, defaultValue = "3") int pageSize,
            @RequestParam(name = "sortBy", required = false, defaultValue = "id") String sortBy,
            @RequestParam(name = "sortDir", required = false, defaultValue = "id") String sortDir
    ) {
        List<PostDto> allPosts = postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
        return new ResponseEntity<>(allPosts, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PostDto> deletePostById(@PathVariable long id) {
        PostDto deletedPost = postService.deletePostById(id);
        return new ResponseEntity<>(deletedPost, HttpStatus.OK);
    }

    @GetMapping("/mul")
    public ResponseEntity<List<PostDto>> getPostsByIds(@RequestParam List<Long> ids) {
        List<PostDto> dtos = postService.getPostsByIds(ids);
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
}
