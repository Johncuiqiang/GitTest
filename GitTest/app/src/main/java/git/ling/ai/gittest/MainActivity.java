package git.ling.ai.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import git.ling.ai.gittest.model.UserBean;
import git.ling.ai.gittest.presenter.UserPresenter;
import git.ling.ai.gittest.view.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView {

    private View mBtnTest;
    private TextView mTvShow;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mBtnTest = findViewById(R.id.btn_test);
        mTvShow = findViewById(R.id.tv_show);

    }

    private void initData() {
        mUserPresenter = new UserPresenter(this);
        mUserPresenter.loadUserInfo();
    }

    @Override
    public String loadUserId() {
        return  "1000";//假设需要查询的用户信息的userId是1000
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "正在加载", Toast.LENGTH_LONG).show();
    }

    @Override
    public void dismissingLoading() {
        Toast.makeText(this, "加载完成", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showUserInfo(UserBean userBean) {
        if (null != userBean){
           mTvShow.setText(userBean.getName()+" "+userBean.getAge());
        }
    }
}
