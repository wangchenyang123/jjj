package demo.example.lenovo.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    List<Fragment> list=new ArrayList<>();
ViewPager vip;
    MyFrag1 frag1;
    MyFrag2 frag2;
    MyFrag3 frag3;
    RadioGroup rdg;
    RadioButton rdb1;
    RadioButton rdb2;
    RadioButton rdb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        vip= (ViewPager) findViewById(R.id.vip_main);
        rdg= (RadioGroup) findViewById(R.id.rdg);
        rdb1= (RadioButton) findViewById(R.id.rdb1);
        rdb2= (RadioButton) findViewById(R.id.rdb2);
        rdb3= (RadioButton) findViewById(R.id.rdb3);
        rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rdb1:
                        vip.setCurrentItem(0,true);
                        break;
                    case R.id.rdb2:
                        vip.setCurrentItem(1,true);
                        break;
                    case R.id.rdb3:
                        vip.setCurrentItem(2,true);
                        break;
                }
            }
        });


        vip.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        rdb1.setChecked(true);
                        break;
                    case 1:
                        rdb2.setChecked(true);
                        break;
                    case 2:
                        rdb3.setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        frag1 =new MyFrag1();
         frag2=new MyFrag2();
         frag3=new MyFrag3();
        list.add(frag1);
        list.add(frag2);
        list.add(frag3);
        FragmentPagerAdapter adapter=new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position%list.size());
            }
            @Override
            public int getCount() {
                return list.size();
            }
        };
        vip.setAdapter(adapter);

    }
    //OnCheckedChangeListener

}
