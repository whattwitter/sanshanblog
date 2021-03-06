package xyz.sanshan.main.service.auth;

import xyz.sanshan.main.api.vo.user.UserInfo;
import xyz.sanshan.main.pojo.entity.UserDO;
import xyz.sanshan.common.vo.ResponseMsgVO;

public interface AuthService {
    boolean register(UserDO userToAdd, ResponseMsgVO responseMsgVO);

    boolean usernameIsDisabled(String username);

    public UserInfo validate(String username, String password);
}

