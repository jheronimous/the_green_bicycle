package com.example.android.thegreenbicycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * This app displays a final score, based on completed, correct answers.
 */

public class Absurd extends AppCompatActivity {
/**
    Setting the initial value of the score total to 0.
 */
    int scoreTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absurd);
    }
/**
    What happens when the user clicks on buttons throughout the quiz.
 */
    public void submitButton1(View view) {

        //Checking the correct answer is marked for question #1. If so, add 1 to score total.
        RadioButton Question1RadioButton = findViewById(R.id.question1_false);
        boolean question1Answer = Question1RadioButton.isChecked();

        if (question1Answer) {
            scoreTotal = scoreTotal + 1;
        }
    }
    public void submitButton2(View view){
        //Checking the correct answer is marked for question #2. If so, add 1 to score total.
        RadioButton question2SecondRadioButton = findViewById(R.id.question2_rhinoceroses);
        boolean question2Answer = question2SecondRadioButton.isChecked();

        if (question2Answer) {
            scoreTotal = scoreTotal + 1;
    }
    }
    public void submitButton3(View view){
        //Checking the correct answer is marked for question #3. If so, add 1 to score total.
        EditText editTextQuestion3 = findViewById(R.id.question3_answer);
        if (editTextQuestion3.getText().toString().equals("e")) {
            scoreTotal = scoreTotal + 1;
        }
    }
    public void submitButton5(View view){
        //Checking the correct answer is marked for question #5. If so, add 1 to score total.
        RadioButton radioButtonQuestion5 = findViewById(R.id.question5_answer3);
        boolean question5Answer = radioButtonQuestion5.isChecked();

        if (question5Answer) {
            scoreTotal = scoreTotal + 1;

        }
    }
    public void submitButton6(View view){
        //Checking the correct answer is marked for question #6. If so, add 1 to score total.
        RadioButton radioButtonQuestion6 = findViewById(R.id.question6_true);
        boolean question6Answer = radioButtonQuestion6.isChecked();

        if (question6Answer) {
            scoreTotal = scoreTotal + 1;


        }
    }
    public void submitButton4(View view){
        //Checking the correct answer is marked for question #4. If so, add 1 to score total.
        CheckBox Question4FirstCheckBox = findViewById(R.id.question4_comfortable_pants);
        boolean question4_first_checkbox = Question4FirstCheckBox.isChecked();

        CheckBox Question4SecondCheckBox = findViewById(R.id.question4_uncomfortable_pants);
        boolean question4_second_checkbox = Question4SecondCheckBox.isChecked();

        CheckBox Question4ThirdCheckBox = findViewById(R.id.question4_cockroach);
        boolean question4_third_checkbox = Question4ThirdCheckBox.isChecked();

        CheckBox Question4FourthCheckBox = findViewById(R.id.question4_ungeziefer);
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
        Toast toast = Toast.makeText(this, "You got " + scoreTotal + " out of 6, Congratulations!", Toast.LENGTH_LONG);
        toast.show();

        //Resetting the selections in the quiz when the Reset button is clicked
        RadioGroup question1RadioGroup = findViewById(R.id.radioGogol);
        question1RadioGroup.clearCheck();

        RadioGroup question2RadioGroup = findViewById(R.id.radioIonesco);
        question2RadioGroup.clearCheck();

        EditText question3EditText = findViewById(R.id.question3_answer);
        question3EditText.getText().clear();

        CheckBox question4FirstCheckBox = findViewById(R.id.question4_comfortable_pants);
        if (question4FirstCheckBox.isChecked()) {
            question4FirstCheckBox.setChecked(false);
        }
        CheckBox question4SecondCheckBox = findViewById(R.id.question4_uncomfortable_pants);
        if (question4SecondCheckBox.isChecked()) {
            question4SecondCheckBox.setChecked(false);
        }

        CheckBox question4ThirdCheckBox = findViewById(R.id.question4_cockroach);
        if (question4ThirdCheckBox.isChecked()) {
            question4ThirdCheckBox.setChecked(false);
        }

        CheckBox question4FourthCheckBox = findViewById(R.id.question4_ungeziefer);
        if (question4FourthCheckBox.isChecked()) {
            question4FourthCheckBox.setChecked(false);
        }

        RadioGroup question5RadioGroup = findViewById(R.id.radioVonnegut);
        question5RadioGroup.clearCheck();

        RadioGroup question6RadioGroup = findViewById(R.id.radioUbu);
        question6RadioGroup.clearCheck();

        scoreTotal = 0;
    }
}
