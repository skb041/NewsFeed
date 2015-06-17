package net.shaileshb.newsfeed;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private int imageArra[] = {
            R.drawable.image1, R.drawable.image2,
            R.drawable.image3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewsAdapter adapter = new NewsAdapter(this, imageArra);
        ViewPager myPager = (ViewPager) findViewById(R.id.pager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);
    }


}
