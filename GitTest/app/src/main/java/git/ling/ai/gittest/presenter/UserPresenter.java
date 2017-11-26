package git.ling.ai.gittest.presenter;

import android.os.Handler;

import git.ling.ai.gittest.model.UserBean;
import git.ling.ai.gittest.view.IUserView;

/**
 * Created by cuiqiang on 17-11-26.
 *
 * @author cuiqiang 实现了一个模拟接口的请求
 */
public class UserPresenter {

    private IUserView mIUserView;

    public UserPresenter(IUserView iUserInfoView) {
        this.mIUserView = iUserInfoView;
    }

    public void loadUserInfo() {
        String userId = mIUserView.loadUserId();
        mIUserView.showLoading();//接口请求前显示loading
        //这里模拟接口请求回调-
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //模拟接口返回的json，并转换为javaBean
                UserBean userBean = new UserBean("小宝", 1);
                mIUserView.showUserInfo(userBean);
                mIUserView.dismissingLoading();
            }
        }, 3000);
    }
}
