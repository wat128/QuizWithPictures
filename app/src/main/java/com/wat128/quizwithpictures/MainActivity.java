package com.wat128.quizwithpictures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView countLabel;
    private ImageView questionImage;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 0;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            // {"画像名", "正解", "選択肢１", "選択肢２", "選択肢３"}
            {"image_circle", "円", "三角形", "正方形", "五角形"},
            {"image_triangle", "三角形", "円", "正方形", "五角形"},
            {"image_square", "正方形", "三角形", "五角形", "六角形"},
            {"image_pentagon", "五角形", "三角形", "正方形", "円"},
            {"image_hexagon", "六角形", "三角形", "五角形", "正方形"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countLabel = findViewById(R.id.countLabel);
        questionImage = findViewById(R.id.questionImage);
        answerBtn1 = findViewById(R.id.answerBtn1);
        answerBtn2 = findViewById(R.id.answerBtn2);
        answerBtn3 = findViewById(R.id.answerBtn3);
        answerBtn4 = findViewById(R.id.answerBtn4);

        for(int i = 0; i < quizData.length; ++i){
            ArrayList<String> tmpArray = new ArrayList<>();

            tmpArray.add(quizData[i][0]);   // 画像名
            tmpArray.add(quizData[i][1]);   // 正解
            tmpArray.add(quizData[i][2]);   // 選択肢１
            tmpArray.add(quizData[i][3]);   // 選択肢２
            tmpArray.add(quizData[i][4]);   // 選択肢３

            quizArray.add(tmpArray);
        }
    }
}
