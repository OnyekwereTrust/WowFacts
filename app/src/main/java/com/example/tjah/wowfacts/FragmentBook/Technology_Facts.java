package com.example.tjah.wowfacts.FragmentBook;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.tjah.wowfacts.ColorWheel;
import com.example.tjah.wowfacts.FactBook.techFactBook;
import com.example.tjah.wowfacts.R;

public class Technology_Facts extends Fragment  {


    //declare our new variables
    private com.example.tjah.wowfacts.FactBook.techFactBook techFactBook = new techFactBook();
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
        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //assigning the views from the layout file to the corresponding variable

                String fact = techFactBook.getfact();
                int color  = colorWheel.getColor();
            //    relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

                factTextView.setText(fact);
            }
        });
return rootView;


    }




    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Technology_Facts");
    }





}
