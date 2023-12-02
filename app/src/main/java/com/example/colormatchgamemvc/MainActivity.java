package com.example.colormatchgamemvc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.colormatchgamemvc.colormatchgame.ColorMatchGameController;
import com.example.colormatchgamemvc.colormatchgame.ColorMatchGameModel;
import com.example.colormatchgamemvc.colormatchgame.ColorMatchGameView;

public class MainActivity extends AppCompatActivity {

    private ColorMatchGameModel colorMatchGameModel;
    private ColorMatchGameView colorMatchGameView;
    private ColorMatchGameController colorMatchGameController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate Model, View, and Controller
        colorMatchGameModel = new ColorMatchGameModel();
        colorMatchGameView = new ColorMatchGameView(this);
        colorMatchGameController = new ColorMatchGameController(colorMatchGameModel, colorMatchGameView);
    }
}
