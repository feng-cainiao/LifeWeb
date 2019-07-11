package newswebsite.service;

import newswebsite.dao.UserMapper;
import newswebsite.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserMapper mapper;
    public User getUser(int userId)
    {
        return mapper.select_user(userId);
    }

    public User getUser(Map map){
        return mapper.confirm_user(map);
    }

    public int getRegister(Map map){ return mapper.register_user(map); }

    public User getUser(String userTelephone) { return mapper.select_registeruser(userTelephone);}

   public int updatePassword(HashMap<String,Object> map){
       return  mapper.updatePassword(map);
   }

   public int updatePhoto(HashMap<String,Object> map){
        return mapper.updatePicture(map);
   }
}
