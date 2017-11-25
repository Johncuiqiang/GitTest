package git.ling.ai.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View mBtnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        checkPermission();
    }

    private void initView() {
        mBtnTest = findViewById(R.id.btn_test);
    }

    private void initData() {
        mBtnTest.clearFocus();
    }
    private void checkPermission() {

    }

}
