package net.shaileshb.newsfeed;

import android.app.Activity;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;

/**
 * Created by User on 6/15/2015.
 */
public class NewsAdapter extends PagerAdapter  {
    Activity activity;
    int imageArray[];

    public NewsAdapter(Activity act, int[] imgArra) {
        imageArray = imgArra;
        activity = act;
    }


    @Override
    public int getCount() {
        return imageArray.length;
    }

    public Object instantiateItem(ViewGroup collection, int position) {
        ImageView view = new ImageView(activity);
        view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
        view.setScaleType(ScaleType.FIT_XY);
        view.setBackgroundResource(imageArray[position]);
        collection.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((ImageView) view);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View) object);
    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}
