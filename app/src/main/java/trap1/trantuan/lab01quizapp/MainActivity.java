package trap1.trantuan.lab01quizapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //use Alt+Enter to auto-import Button
        Button clickButton = findViewById(R.id.button);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText content = findViewById(R.id.Answer1);
                String output = content.getText().toString();
                System.out.println("Hello " + output);
                setContentView(R.layout.quizpage1);
            }
        }
    );
}
    public void onClick2(View view){
        int score = 0;
        String[] Answers = {"12","212","Hands","Brain","Katrina"};
        int[] Answerboxlist = {R.id.Answer1,R.id.Answer2,R.id.Answer3,R.id.Answer4,R.id.Answer5};
        for (int i = 0; i < Answerboxlist.length; i++) {
            EditText inputAnswer = findViewById(Answerboxlist[i]);
            String Answer = inputAnswer.getText().toString();
            if (Answer.toLowerCase().equals(Answers[i].toLowerCase()))
                score++;
        }
        System.out.println("You got " + score + " correct!");
    }
}

