package git.ling.ai.gittest.view;

import git.ling.ai.gittest.model.UserBean;

/**
 * Created by cuiqiang on 17-11-26.
 *
 * @author cuiqiang
 */

public interface IUserView {

    String loadUserId();//假设接口请求需要一个userId

    void showLoading();//展示加载框

    void dismissingLoading();//取消加载框展示

    void showUserInfo(UserBean userBean);//将网络请求得到的用户信息回调
}
