package com.mpaas.demo.hotpatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mpaas.hotpatch.adapter.api.MPHotpatch;

public class HotpatchActivity extends Activity {
    private Button mHotpatchNeedHotpatchBtn;
    private Button mHotpatchTriggerHotpatchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotpatch);
        findView();
        initView();
    }

    private void findView() {
        mHotpatchNeedHotpatchBtn = (Button) findViewById(R.id.hotpatch_need_hotpatch_btn);
        mHotpatchTriggerHotpatchBtn = (Button) findViewById(R.id.hotpatch_trigger_hotpatch_btn);
    }

    private void initView() {
        mHotpatchNeedHotpatchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 以下代码为需要被热修复的部分
                String content = "异常，当前点击事件未被热修复";
                //String content = "当前点击事件已被热修复";
                Toast.makeText(HotpatchActivity.this, content, Toast.LENGTH_SHORT).show();
            }
        });
        mHotpatchTriggerHotpatchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MPHotpatch.init();
            }
        });
    }
}
