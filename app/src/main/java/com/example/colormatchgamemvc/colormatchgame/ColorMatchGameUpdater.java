package com.example.colormatchgamemvc.colormatchgame;

import android.graphics.Color;

public class ColorMatchGameUpdater {
    private ColorMatchGameView view;
    private int backgroundTracker;

    public ColorMatchGameUpdater(ColorMatchGameView view) {
        this.view = view;
        this.backgroundTracker = 0;
    }

    public void updateBackgroundColor() {
        switch (backgroundTracker) {
            case 0:
                view.setBackgroundColor(Color.argb(255, 255, 255, 0)); // yellow
                break;
            case 1:
                view.setBackgroundColor(Color.argb(255, 253, 255, 0));
                break;
            case 2:
                view.setBackgroundColor(Color.argb(255, 255, 250, 205));
                break;
            case 3:
                view.setBackgroundColor(Color.argb(255, 255, 255, 224));
                break;
            case 4:
                view.setBackgroundColor(Color.argb(255, 255, 165, 0)); // orange
                break;
            case 5:
                view.setBackgroundColor(Color.argb(255, 247, 135, 2));
                break;
            case 6:
                view.setBackgroundColor(Color.argb(255, 255, 165, 44));
                break;
            case 7:
                view.setBackgroundColor(Color.argb(255, 255, 209, 6));
                break;
            case 8:
                view.setBackgroundColor(Color.argb(255, 191, 255, 0)); // yellow green
                break;
            case 9:
                view.setBackgroundColor(Color.argb(255, 57, 255, 20));
                break;
            case 10:
                view.setBackgroundColor(Color.argb(255, 0, 255, 0));
                break;
            case 11:
                view.setBackgroundColor(Color.argb(255, 50, 205, 50));
                break;
            case 12:
                view.setBackgroundColor(Color.argb(255, 255, 170, 51)); // yellow orange
                break;
            case 13:
                view.setBackgroundColor(Color.argb(255, 255, 89, 11));
                break;
            case 14:
                view.setBackgroundColor(Color.argb(255, 255, 168, 54));
                break;
            case 15:
                view.setBackgroundColor(Color.argb(255, 252, 174, 30));
                backgroundTracker = 0;
                break;
        }
        backgroundTracker++;
    }
}
