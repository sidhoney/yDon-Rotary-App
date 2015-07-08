package com.sidhartha.rotary.adapter;

import com.sidhartha.rotary.LocationFragment;
import com.sidhartha.rotary.ContactUsFragment;
import com.sidhartha.rotary.WebSiteFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new WebSiteFragment();
		case 1:
			// Games fragment activity
			return new LocationFragment();
		case 2:
			// Movies fragment activity
			return new ContactUsFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
