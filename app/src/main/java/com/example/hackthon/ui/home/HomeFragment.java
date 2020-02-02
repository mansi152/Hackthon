package com.example.hackthon.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hackthon.Login;
import com.example.hackthon.Navigationhack;
import com.example.hackthon.R;

public class HomeFragment extends Fragment implements Toolbar.OnMenuItemClickListener {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        // final TextView textView = root.findViewById(R.id.text_home);
        Toolbar tool = (Toolbar) getActivity().findViewById(R.id.toolbar);
        tool.inflateMenu(R.menu.activity_navigationhack_drawer);
        tool.setOnMenuItemClickListener(this);
        return root;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.healthhistory:

                Toast.makeText(getActivity(), "Please long press the key", Toast.LENGTH_LONG ).show();
                return true;

        }
        return false;
    }

    //homeViewModel.getText().observe(this, new Observer<String>() {

            //public void onChanged(@Nullable String s) {
              //  textView.setText(s);
         //   }
      //  });

}