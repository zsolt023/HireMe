package com.nagy.hireme.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.nagy.hireme.R;
import com.nagy.hireme.fragment.EducationFragment;
import com.nagy.hireme.fragment.HobbiesFragment;
import com.nagy.hireme.fragment.LanguageFragment;
import com.nagy.hireme.fragment.PersonalInfoFragment;
import com.nagy.hireme.fragment.ProfessionalKnowledgeFragment;
import com.nagy.hireme.fragment.ProfessionalExperienceFragment;
import com.nagy.hireme.fragment.ReferencesFragment;
import com.nagy.hireme.util.SPConstants;
import com.nagy.hireme.util.SPUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @BindView(R.id.main_fragment)
    FrameLayout fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int menuItemId = SPUtil.getInt(SPConstants.SELECTED_MENU_ITEM, 1);
        switch (menuItemId) {
            case 1:
                onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_personal_info));
                break;
            case 2:
                onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_professional_experience));
                break;
            case 3:
                onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_education));
                break;
            case 4:
                onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_language));
                break;
            case 5:
                onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_professional_knowledge));
                break;
            case 7:
                onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_hobbies));
                break;
        }

    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        getSupportActionBar().setTitle(item.getTitle());
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment;
        switch (item.getItemId()) {
            case R.id.nav_personal_info:
                SPUtil.putInt(SPConstants.SELECTED_MENU_ITEM, 1);
                fragment = PersonalInfoFragment.newInstance();
                break;
            case R.id.nav_professional_experience:
                SPUtil.putInt(SPConstants.SELECTED_MENU_ITEM, 2);
                fragment = ProfessionalExperienceFragment.newInstance();
                break;
            case R.id.nav_education:
                SPUtil.putInt(SPConstants.SELECTED_MENU_ITEM, 3);
                fragment = EducationFragment.newInstance();
                break;
            case R.id.nav_language:
                SPUtil.putInt(SPConstants.SELECTED_MENU_ITEM, 4);
                fragment = LanguageFragment.newInstance();
                break;
            case R.id.nav_professional_knowledge:
                SPUtil.putInt(SPConstants.SELECTED_MENU_ITEM, 5);
                fragment = ProfessionalKnowledgeFragment.newInstance();
                break;
            case R.id.nav_hobbies:
                SPUtil.putInt(SPConstants.SELECTED_MENU_ITEM, 7);
                fragment = HobbiesFragment.newInstance();
                break;
            default:
                SPUtil.putInt(SPConstants.SELECTED_MENU_ITEM, 1);
                fragment = PersonalInfoFragment.newInstance();
                break;
        }
        manager.beginTransaction().replace(R.id.main_fragment, fragment).commit();

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
