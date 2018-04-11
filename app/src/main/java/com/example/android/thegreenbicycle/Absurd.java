package com.example.android.thegreenbicycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays a final score, based on completed, correct answers.
 */

public class Absurd extends AppCompatActivity {

    private RadioButton Question1RadioButton;
    private RadioButton Question2SecondRadioButton;
    private RadioButton radioButtonQuestion5;
    private RadioButton radioButtonQuestion6;
    private EditText editTextQuestion3;
    private CheckBox Question4FirstCheckBox;
    private CheckBox Question4SecondCheckBox;
    private CheckBox Question4ThirdCheckBox;
    private CheckBox Question4FourthCheckBox;
    private RadioGroup question6RadioGroup;
    private RadioGroup question5RadioGroup;
    private RadioGroup question2RadioGroup;
    private RadioGroup question1RadioGroup;

    /**
    Setting the initial value of the score total to 0.
 */
    int scoreTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absurd);
        Question1RadioButton = findViewById(R.id.questionOneFalse);
        Question2SecondRadioButton = findViewById(R.id.questionTwoRhinoceroses);
        editTextQuestion3 = findViewById(R.id.questionThreeAnswer);
        radioButtonQuestion5 = findViewById(R.id.questionFiveAnswerThree);
        radioButtonQuestion6 = findViewById(R.id.questionSixTrue);
        Question4FirstCheckBox = findViewById(R.id.questionFourComfortablePants);
        Question4SecondCheckBox = findViewById(R.id.questionFourUncomfortablePants);
        Question4ThirdCheckBox = findViewById(R.id.questionFourCockroach);
        Question4FourthCheckBox = findViewById(R.id.questionFourUngeziefer);
        question6RadioGroup = findViewById(R.id.radioUbu);
        question5RadioGroup = findViewById(R.id.radioVonnegut);
        question2RadioGroup = findViewById(R.id.radioIonesco);
        question1RadioGroup = findViewById(R.id.radioGogol);
    }

/**
    What happens when the user clicks on buttons throughout the quiz.
 */
    public void submitButton1(View view) {

        //Checking the correct answer is marked for question #1. If so, add 1 to score total.
        boolean question1Answer = Question1RadioButton.isChecked();

        if (question1Answer) {
            scoreTotal = scoreTotal + 1;
        }

    }
    public void submitButton2(View view){
        //Checking the correct answer is marked for question #2. If so, add 1 to score total.
        boolean question2Answer = Question2SecondRadioButton.isChecked();

        if (question2Answer) {
            scoreTotal = scoreTotal + 1;
        }

    }
    public void submitButton3(View view){
        String theLetterE = editTextQuestion3.getText().toString();
        if (theLetterE.equalsIgnoreCase(getString(R.string.theLetterE))) {
            scoreTotal = scoreTotal + 1;
        }

    }
    public void submitButton5(View view){
        //Checking the correct answer is marked for question #5. If so, add 1 to score total.
        boolean question5Answer = radioButtonQuestion5.isChecked();

        if (question5Answer) {
            scoreTotal = scoreTotal + 1;
        }

    }
    public void submitButton6(View view){
        //Checking the correct answer is marked for question #6. If so, add 1 to score total.
        boolean question6Answer = radioButtonQuestion6.isChecked();

        if (question6Answer) {
            scoreTotal = scoreTotal + 1;
        }

    }
    public void submitButton4(View view){
        //Checking the correct answer is marked for question #4. If so, add 1 to score total.
        boolean question4_first_checkbox = Question4FirstCheckBox.isChecked();

        boolean question4_second_checkbox = Question4SecondCheckBox.isChecked();

        boolean question4_third_checkbox = Question4ThirdCheckBox.isChecked();

        boolean question4_fourth_checkbox = Question4FourthCheckBox.isChecked();

        if (question4_third_checkbox && question4_fourth_checkbox) {
            scoreTotal = scoreTotal + 1;

            //Subtracting a point from the score total if B or D are selected
            if (question4_first_checkbox || question4_second_checkbox) {
                scoreTotal = scoreTotal - 1;


            }
        }
    }

    /**
     * Gets the final score of the quiz, displays score in toast and clears out selections from the quiz.
     */
    public void clickBeckett(View view) {
        //A toast is displayed at the bottom of the screen to let the user know how many answers were correct
        Toast toast = Toast.makeText(this, getString(R.string.youGot) + scoreTotal + getString(R.string.scoreWording), Toast.LENGTH_LONG);
        toast.show();

        //Resetting the selections in the quiz when the Reset button is clicked
        question1RadioGroup.clearCheck();

        question2RadioGroup.clearCheck();

        EditText question3EditText = findViewById(R.id.questionThreeAnswer);
        question3EditText.getText().clear();

        CheckBox question4FirstCheckBox = findViewById(R.id.questionFourComfortablePants);
        if (question4FirstCheckBox.isChecked()) {
            question4FirstCheckBox.setChecked(false);
        }
        CheckBox question4SecondCheckBox = findViewById(R.id.questionFourUncomfortablePants);
        if (question4SecondCheckBox.isChecked()) {
            question4SecondCheckBox.setChecked(false);
        }

        CheckBox question4ThirdCheckBox = findViewById(R.id.questionFourCockroach);
        if (question4ThirdCheckBox.isChecked()) {
            question4ThirdCheckBox.setChecked(false);
        }

        CheckBox question4FourthCheckBox = findViewById(R.id.questionFourUngeziefer);
        if (question4FourthCheckBox.isChecked()) {
            question4FourthCheckBox.setChecked(false);
        }

        question5RadioGroup.clearCheck();

        question6RadioGroup.clearCheck();

        scoreTotal = 0;
    }
}
