package com.vlad.doomsday;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import Evomath.Matrix;
import Prometheus.Models.*;

public class ModelSelection extends Fragment {

    private Model model;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_model_selection, container, false);

        Matrix X = new Matrix(new double[][] {
                {1},
                {2},
                {3}
        });

        Matrix Y = new Matrix(new double[][] {
                {12.5},
                {13.3},
                {13.94}
        });

        Button trainModelButton = view.findViewById(R.id.train_model_button);
        trainModelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model = new LinearRegressionModel();
                model.fit(X, Y);
            }
        });

        return view;
    }
}