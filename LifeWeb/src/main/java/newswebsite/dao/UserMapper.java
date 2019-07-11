package newswebsite.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import newswebsite.pojo.User;
import newswebsite.pojo.UserExample;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExampleWithBLOBs(UserExample example);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExampleWithBLOBs(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);


    User select_user(int userId);

    User confirm_user(Map map);



    int register_user(Map map);

    User select_registeruser(String telephone);

    int updatePassword (HashMap<String,Object> map);

    int updatePicture(HashMap<String,Object> map);
}