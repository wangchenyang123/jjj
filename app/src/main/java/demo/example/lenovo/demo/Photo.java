package demo.example.lenovo.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by lenovo on 2016/6/17.
 */
public class Photo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);

    }

    void locality() {
        Intent intent = new Intent(Intent.ACTION_PICK);


    }

    void camera() {

    }

    void tailor(Uri uri) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
      /*  设置类型setputExtra
                * 裁剪功能 putExtra（"crop","true"）
        *  裁剪比例"aspectX","1"
         *          "aspectY","1"
         *裁剪大小"outPutX","100"
         *        "outPutX","100"
         * 保存图片"return_data","true"
   *start A F R启动*/
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "ture");
        intent.putExtra("aspectX", "1");
        intent.putExtra("aspectY", "1");
        intent.putExtra("outPutX", "100");
        intent.putExtra("outPutY", "100");
        intent.putExtra("return-data", "true");
        startActivityForResult(intent, 200);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == 200 && resultCode == RESULT_OK) {

        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
