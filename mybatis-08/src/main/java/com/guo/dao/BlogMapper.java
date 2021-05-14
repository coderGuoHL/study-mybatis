package com.guo.dao;

import com.guo.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);

    //更新博客
    int updateBlog(Map map);

    List<Blog> queryBlogChoose(Map map);

    // 查询1-2-3号的博客
    List<Blog> queryBlogForeach(Map map);
}
