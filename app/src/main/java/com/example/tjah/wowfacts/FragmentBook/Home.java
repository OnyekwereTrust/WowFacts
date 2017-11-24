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
import com.example.tjah.wowfacts.Facts;
import com.example.tjah.wowfacts.R;

//import com.example.tjah.wowfacts.FactBook.techFactBook;

public class Home extends Fragment  {



    //declare our new variables
 //   private com.example.tjah.wowfacts.FactBook.homeFactBook homeFactBook = new homeFactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private RelativeLayout relativeLayout;
    private TextView factTextView;
    private Button showNextFactButton;
    private Button showPrevFactButton;

    private TextView mFactTextView;


    private int mCurrentIndex = 0;

// update question method
    private void updateQuestion() {
        int question = mFactBank[mCurrentIndex].getFactId();
        mFactTextView.setText(question);
    }


// an array of random facts
    private Facts[] mFactBank = new Facts[]{
            new Facts(R.string.fact1),
            new Facts(R.string.fact2),
            new Facts(R.string.fact3),
            new Facts(R.string.fact4),
            new Facts(R.string.fact5),
            new Facts(R.string.fact6),
            new Facts(R.string.fact7),
            new Facts(R.string.fact8),
            new Facts(R.string.fact9),
            new Facts(R.string.fact10),
            new Facts(R.string.fact11),
            new Facts(R.string.fact12),
            new Facts(R.string.fact13),
            new Facts(R.string.fact14),
            new Facts(R.string.fact15),
            new Facts(R.string.fact16),
            new Facts(R.string.fact17),
            new Facts(R.string.fact18),
            new Facts(R.string.fact19),
            new Facts(R.string.fact20),
            new Facts(R.string.fact21),
            new Facts(R.string.fact22),
            new Facts(R.string.fact23),
            new Facts(R.string.fact24),
            new Facts(R.string.fact25),
            new Facts(R.string.fact16),
            new Facts(R.string.fact28),
            new Facts(R.string.fact29),
            new Facts(R.string.fact30),
            new Facts(R.string.fact31),
            new Facts(R.string.fact32),
            new Facts(R.string.fact33),
            new Facts(R.string.fact34),

    };


    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.home_activity, container ,false);
        mFactTextView = rootView.findViewById(R.id.homeFactTextView);
        showNextFactButton = rootView.findViewById(R.id.homeShowNextFactbutton);
        relativeLayout =  rootView.findViewById(R.id.HomeLayout);
        showNextFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //assigning the views from the layout file to the corresponding variable
                mCurrentIndex = (mCurrentIndex + 1) % mFactBank.length;
                updateQuestion();

            }
        });

        showPrevFactButton = rootView.findViewById(R.id.homeShowPrevFactbutton);
        showPrevFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex = (mCurrentIndex - 1) % mFactBank.length;
                updateQuestion();

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
