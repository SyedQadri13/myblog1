package com.myblog.myblog1.service.impl;

import com.myblog.myblog1.entity.Comment;
import com.myblog.myblog1.entity.Post;
import com.myblog.myblog1.exception.ResourceNotFoundException;
import com.myblog.myblog1.payload.CommentDto;
import com.myblog.myblog1.payload.PostDto;
import com.myblog.myblog1.repository.CommentRepository;
import com.myblog.myblog1.repository.PostRepository;
import com.myblog.myblog1.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {


    private PostRepository postRepository;

    private ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper) {

        this.postRepository = postRepository;
        this.modelMapper = modelMapper;

    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = modelMapper.map(postDto, Post.class);
        Post savedPost = postRepository.save(post);
        PostDto savedPostDto = modelMapper.map(savedPost, PostDto.class);
        return savedPostDto;
    }

    @Override
    public PostDto getPostById(long id) {

        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with ID : "+id)
        );
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }

    @Override
    public List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        Page<Post> pagePost = postRepository.findAll(pageable);
        List<Post> posts = pagePost.getContent();
        return posts.stream()
                .map(post -> {
                    PostDto dto = new PostDto();
                    dto.setId(post.getId());
                    dto.setTitle(post.getTitle());
                    dto.setDescription(post.getDescription());
                    dto.setContent(post.getContent());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    @Override
    public PostDto deletePostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with ID: " + id)
        );

        postRepository.deleteById(id);

        PostDto deletedPostDto = new PostDto();
        deletedPostDto.setId(post.getId());
        deletedPostDto.setTitle(post.getTitle());
        deletedPostDto.setDescription(post.getDescription());
        deletedPostDto.setContent(post.getContent());

        return deletedPostDto;
    }

    @Override
    public List<PostDto> getPostsByIds(List<Long> ids) {
        List<Post> posts = postRepository.findAllById(ids);
        return posts.stream()
                .map(post -> {
                    PostDto dto = new PostDto();
                    dto.setId(post.getId());
                    dto.setTitle(post.getTitle());
                    dto.setDescription(post.getDescription());
                    dto.setContent(post.getContent());
                    return dto;
                })
                .collect(Collectors.toList());
    }


}



