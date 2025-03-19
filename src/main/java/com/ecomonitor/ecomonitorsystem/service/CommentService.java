package com.ecomonitor.ecomonitorsystem.service;

import com.ecomonitor.ecomonitorsystem.model.Comment;
import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
    Comment getCommentById(Long id);
    Comment addComment(Comment comment);
    void deleteComment(Long id);
    void saveComment(Comment comment);
}
