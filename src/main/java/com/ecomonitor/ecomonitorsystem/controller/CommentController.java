package com.ecomonitor.ecomonitorsystem.controller;

import com.ecomonitor.ecomonitorsystem.model.Comment;
import com.ecomonitor.ecomonitorsystem.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @PostMapping("/add")
    public String addComment(@RequestBody Comment comment) {
        commentService.saveComment(comment);
        return "New comment is added";
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }
}
