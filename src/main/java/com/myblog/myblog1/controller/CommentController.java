package com.myblog.myblog1.controller;

import com.myblog.myblog1.payload.CommentDto;
import com.myblog.myblog1.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // http://localhost:8080/api/comments?postId=1
    @PostMapping("/post")
    public ResponseEntity<CommentDto> createComment(
            @RequestBody CommentDto commentDto,
            @RequestParam long postId
    ){

        CommentDto dto = commentService.createComment(commentDto, postId);

        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable long id){

        commentService.deleteComment(id);

        return new ResponseEntity<>("Comment is deleted",HttpStatus.OK);
    }

}
