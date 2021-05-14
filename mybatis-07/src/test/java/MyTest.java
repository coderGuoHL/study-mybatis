import com.guo.Utils.MyBatisUtils;
import com.guo.dao.TeacherMapper;
import com.guo.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getTeacher() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        List<Teacher> list = sqlSession.getMapper(TeacherMapper.class).getTeacher(1);
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void getTeacher2() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        Teacher list = sqlSession.getMapper(TeacherMapper.class).getTeacher2(1);
        System.out.println(list);

        sqlSession.close();
    }
}
