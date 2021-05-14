import com.guo.Utils.MyBatisUtils;
import com.guo.dao.UserMapper;
import com.guo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession1 = MyBatisUtils.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper1.selectById(1);
        System.out.println(user);
        sqlSession1.close();
        System.out.println("================================");

        User user2 = mapper2.selectById(1);
        System.out.println(user2);
        sqlSession2.close();


    }
}
