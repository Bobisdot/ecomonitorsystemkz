package com.ecomonitor.ecomonitorsystem.controller;

import com.ecomonitor.ecomonitorsystem.model.News;
import com.ecomonitor.ecomonitorsystem.service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/{id}")
    public News getNewsById(@PathVariable Long id) {
        return newsService.getNewsById(id);
    }

    @PostMapping
    public News createNews(@RequestBody News news) {
        return newsService.createNews(news);
    }

    @DeleteMapping("/{id}")
    public void deleteNews(@PathVariable Long id) {
        newsService.deleteNews(id);
    }

    @PostMapping("/add")
    public String addNews(@RequestBody News news) {
        newsService.saveNews(news);
        return "New news is added";
    }
}
