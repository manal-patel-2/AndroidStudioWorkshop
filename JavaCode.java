// Declarations:
// Below are declarations for objects that we shall use to make the app.
// A basic declaration in java is in the format of 
// ClassType variableName;
    TextView numberText;
    Button increaseButton;
    String currentNumberInString;



// An int is not the same as Classes and Objects becuase it is a primitive data type.
// For you now you can just think of an int as a whole number.
    int currentNumber = 0;



// These are the initialization for the objects.
// What this basically does is set our variable equal to view objects we created in the UI.
// The findViewById(...) function basically finds the view object we created and returns it
// so we can assign that object to our variable 
    number = findViewById(R.id.numberText);
    increase = findViewById(R.id.increaseButton);



// This next code basically converts our currentNumber into a text version of itself.
    currentNumberInString = "" + currentNumber;



// This line of code sets our number to appear in the text view.
    number.setText(currentNumberInString);



// This next line of code works with higher level concepts that we do not need to know for this app.
// All you know need to know is that it takes our increaseButton sets the action to be performed when clicked
// to what is inside public void OnClick(){...}
    increase.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Increases the currentNumber by 1
            currentNumber = currentNumber + 1;

            // changes the text form of our currentNumber
            currentNumberInString = "" + currentNumber;
        
            // This next line of code desplays our new text form of currentNumber to the screen.
            number.setText(currentNumberInString);
        }
    });
