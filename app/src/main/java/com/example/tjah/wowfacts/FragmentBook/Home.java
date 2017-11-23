package com.example.tjah.wowfacts.FragmentBook;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.tjah.wowfacts.ColorWheel;
import com.example.tjah.wowfacts.FactBook.homeFactBook;
import com.example.tjah.wowfacts.R;

public class Home extends Fragment  {


    //declare our new variables
    private com.example.tjah.wowfacts.FactBook.homeFactBook homeFactBook = new homeFactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private RelativeLayout relativeLayout;
    private TextView factTextView;
    private Button showFactButton;

    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View rootView = inflater.inflate(R.layout.tech_fragment, container ,false);

        factTextView = (TextView) rootView.findViewById(R.id.factTextView);
        showFactButton = (Button) rootView.findViewById(R.id.showFactbutton);
        relativeLayout = (RelativeLayout) rootView.findViewById(R.id.contentLayout);
        showFactButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String fact = homeFactBook.getfact();
                int color  = colorWheel.getColor();
                //    relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

                factTextView.setText(fact);

                return true;
            }

        });

return rootView;


    }




    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Home");
    }





}
