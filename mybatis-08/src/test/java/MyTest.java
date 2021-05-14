import com.guo.Utils.IDutils;
import com.guo.Utils.MyBatisUtils;
import com.guo.dao.BlogMapper;
import com.guo.pojo.Blog;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
    public void addBlog() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("mybatis一点点简单");
        blog.setAuthor("Coder Guo");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);

        blog.setTitle("spring一点点简单");
        mapper.addBlog(blog);

        blog.setTitle("微服务一点点简单");
        mapper.addBlog(blog);

        session.close();
    }

    @Test
    public void queryBlogIf() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper blogMapper = session.getMapper(BlogMapper.class);
        Map map = new HashMap();

        map.put("author", "Coder Guo");

        for (Blog blog : blogMapper.queryBlogIf(map)) {
            System.out.println(blog);
        }

        session.close();

    }

    @Test
    public void queryBlogChoose() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper blogMapper = session.getMapper(BlogMapper.class);
        Map map = new HashMap();
//        map.put("title", "mybatis一点点简单");
//        map.put("author", "Coder Guo");
        map.put("views", "10000");
        for (Blog blog : blogMapper.queryBlogChoose(map)) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void update() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper blogMapper = session.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("author", "1");
        map.put("title", "1");
        map.put("id", "a40ea21ab5374449908e7a29d7ca09f6");

        blogMapper.updateBlog(map);
        session.close();
    }

    @Test
    public void queryBlogForeach() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Map map = new HashMap();
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);

        map.put("list", list);
        for (Blog blog : blogMapper.queryBlogForeach(map)) {
            System.out.println(blog);
        }
        session.close();
    }
}
