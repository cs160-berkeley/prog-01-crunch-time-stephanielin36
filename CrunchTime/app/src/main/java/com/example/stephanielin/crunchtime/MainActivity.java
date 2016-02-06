package com.example.stephanielin.crunchtime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.text.TextWatcher;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //Update min/rep when goal calories is entered
        final EditText editJogging = (EditText) findViewById(R.id.edit_jogging_time);
        final EditText editCalories = (EditText) findViewById(R.id.editCalories);
        final EditText editPushups = (EditText) findViewById(R.id.edit_pushups);
        final EditText editSitups = (EditText) findViewById(R.id.edit_situps);
        final EditText editJumping = (EditText) findViewById(R.id.edit_jumping);
        final EditText editSquats = (EditText) findViewById(R.id.edit_squats);
        final EditText editLegLifts = (EditText) findViewById(R.id.edit_leg_lift);
        final EditText editPlank = (EditText) findViewById(R.id.edit_plank);
        final EditText editPullup = (EditText) findViewById(R.id.edit_pullups);
        final EditText editCycling = (EditText) findViewById(R.id.edit_cycling_time);
        final EditText editWalking = (EditText) findViewById(R.id.edit_walking_time);
        final EditText editSwimming = (EditText) findViewById(R.id.edit_swimming_time);
        final EditText editStairs = (EditText) findViewById(R.id.edit_stairs_time);

        editJogging.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editJogging.getText().toString().length() > 0) {
                        int joggingTime = Integer.valueOf(((EditText) findViewById(R.id.edit_jogging_time)).getText().toString());
                        int calories = 100 * joggingTime / 12;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editPushups.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editPushups.getText().toString().length() > 0) {
                        int pushupReps = Integer.valueOf(((EditText) findViewById(R.id.edit_pushups)).getText().toString());
                        int calories = 100 * pushupReps / 350;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editSitups.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if(editSitups.getText().toString().length() > 0) {
                        int situpReps = Integer.valueOf(((EditText) findViewById(R.id.edit_situps)).getText().toString());
                        int calories = 100 * situpReps / 200;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350 * calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int jumpingTime = 10 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225 * calories / 100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25 * calories / 100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25 * calories / 100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100 * calories / 100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editJumping.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editJumping.getText().toString().length() > 0) {
                        int jumpingTime = Integer.valueOf(((EditText) findViewById(R.id.edit_jumping)).getText().toString());
                        int calories = 100 * jumpingTime / 10;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editSquats.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editSquats.getText().toString().length() > 0) {
                        int squatReps = Integer.valueOf(((EditText) findViewById(R.id.edit_squats)).getText().toString());
                        int calories = 100 * squatReps / 225;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editLegLifts.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editLegLifts.getText().toString().length() > 0) {
                        int legTime = Integer.valueOf(((EditText) findViewById(R.id.edit_leg_lift)).getText().toString());
                        int calories = 100 * legTime / 25;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editPlank.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editPlank.getText().toString().length() > 0) {
                        int plankTime = Integer.valueOf(((EditText) findViewById(R.id.edit_plank)).getText().toString());
                        int calories = 100 * plankTime / 25;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editPullup.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editPullup.getText().toString().length() > 0) {
                        int pullupReps = Integer.valueOf(((EditText) findViewById(R.id.edit_pullups)).getText().toString());
                        int calories = 100 * pullupReps / 100;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editCycling.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editCycling.getText().toString().length() > 0) {
                        int cyclingTime = Integer.valueOf(((EditText) findViewById(R.id.edit_cycling_time)).getText().toString());
                        int calories = 100 * cyclingTime / 12;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editWalking.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editWalking.getText().toString().length() > 0) {
                        int walkingTime = Integer.valueOf(((EditText) findViewById(R.id.edit_walking_time)).getText().toString());
                        int calories = 100 * walkingTime / 20;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editSwimming.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editSwimming.getText().toString().length() > 0) {
                        int swimmingTime = Integer.valueOf(((EditText) findViewById(R.id.edit_swimming_time)).getText().toString());
                        int calories = 100 * swimmingTime / 13;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });
        editStairs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editStairs.getText().toString().length() > 0) {
                        int stairsTime = Integer.valueOf(((EditText) findViewById(R.id.edit_stairs_time)).getText().toString());
                        int calories = 100 * stairsTime / 15;
                        ((EditText) findViewById(R.id.editCalories)).setText(String.valueOf(calories));
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350*calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200*calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                    }
                }
            }
        });
        editCalories.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editCalories.getText().toString().length() > 0) {
                        int calories = Integer.valueOf(((EditText) findViewById(R.id.editCalories)).getText().toString());
                        int joggingTime = 12 * calories / 100;
                        ((EditText) findViewById(R.id.edit_jogging_time)).setText(String.valueOf(joggingTime));
                        int pushupReps = 350 * calories / 100;
                        ((EditText) findViewById(R.id.edit_pushups)).setText(String.valueOf(pushupReps));
                        int situpReps = 200 * calories / 100;
                        ((EditText) findViewById(R.id.edit_situps)).setText(String.valueOf(situpReps));
                        int jumpingTime = 10*calories/100;
                        ((EditText) findViewById(R.id.edit_jumping)).setText(String.valueOf(jumpingTime));
                        int squatReps = 225*calories/100;
                        ((EditText) findViewById(R.id.edit_squats)).setText(String.valueOf(squatReps));
                        int legTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_leg_lift)).setText(String.valueOf(legTime));
                        int plankTime = 25*calories/100;
                        ((EditText) findViewById(R.id.edit_plank)).setText(String.valueOf(plankTime));
                        int pullupReps = 100*calories/100;
                        ((EditText) findViewById(R.id.edit_pullups)).setText(String.valueOf(pullupReps));
                        int cyclingTime = 12*calories/100;
                        ((EditText) findViewById(R.id.edit_cycling_time)).setText(String.valueOf(cyclingTime));
                        int walkingTime = 20*calories/100;
                        ((EditText) findViewById(R.id.edit_walking_time)).setText(String.valueOf(walkingTime));
                        int swimmingTime = 13*calories/100;
                        ((EditText) findViewById(R.id.edit_swimming_time)).setText(String.valueOf(swimmingTime));
                        int stairsTime = 15*calories/100;
                        ((EditText) findViewById(R.id.edit_stairs_time)).setText(String.valueOf(stairsTime));
                    }
                }
            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
