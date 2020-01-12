package com.zhaohm.circlemenu;

import android.app.Activity;
import android.os.Bundle;
import view.CircleMenuLayout;

public class MainActivity extends Activity {

    private String[] mItemTexts = new String[]{"放大镜 ", "尺子", "分贝测试仪", "手电筒",
            "计算器", "SOS"};//圆盘菜单显示文字
    private int[] mItemImgs = new int[]{R.drawable.home_mbank_1_normal,
            R.drawable.home_mbank_2_normal, R.drawable.home_mbank_3_normal,
            R.drawable.home_mbank_4_normal, R.drawable.home_mbank_5_normal,
            R.drawable.home_mbank_6_normal};//圆盘菜单显示图片

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//导入布局
        //初始化圆盘控件
        CircleMenuLayout mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
        //初始化圆盘控件菜单
        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
    }
}
