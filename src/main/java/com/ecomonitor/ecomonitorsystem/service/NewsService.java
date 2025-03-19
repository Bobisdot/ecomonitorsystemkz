package com.ecomonitor.ecomonitorsystem.service;

import com.ecomonitor.ecomonitorsystem.model.News;
import java.util.List;

public interface NewsService {
    List<News> getAllNews();
    News getNewsById(Long id);
    News createNews(News news);
    void deleteNews(Long id);
    void saveNews(News news);
}
