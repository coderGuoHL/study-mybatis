import com.guo.Utils.MyBatisUtils;
import com.guo.dao.StudentMapper;
import com.guo.dao.TeacherMapper;
import com.guo.pojo.Student;
import com.guo.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getTeacherList(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> list =  teacherMapper.getTeacherList();
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }


        sqlSession.close();
    }

    @Test
    public void testAssociation1() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list =  studentMapper.getStudent();
        for (Student student : list) {
            System.out.println(student);
        }


        sqlSession.close();
    }

    @Test
    public void testAssociation2() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list =  studentMapper.getStudent2();
        for (Student student : list) {
            System.out.println(student);
        }


        sqlSession.close();
    }
}
