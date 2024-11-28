package com.example.adventkalender;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button button1; // Automatically injected for each button if IDs match
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button13;
    @FXML
    private Button button14;
    @FXML
    private Button button15;
    @FXML
    private Button button16;
    @FXML
    private Button button17;
    @FXML
    private Button button18;
    @FXML
    private Button button19;
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;
    @FXML
    private Button button23;
    @FXML
    private Button button24;

    // Add other button variables up to button24...

    // Map of door messages
    private final String[] messages = {
            "Welcome to the 1st of December! 🎅 Let's start the countdown to Christmas!",
            "It's December 2nd! 🎄 Have a warm cup of cocoa today.",
            "Day 3: You're doing great! ❄️ Spread some joy around.",
            "Happy December 4th! 🌟 Write your wish list for Santa today.",
            "Day 5: Remember to enjoy the little things. 🕯️ Light a candle!",
            "December 6th: Happy St. Nicholas Day! 🎁 Check your shoes!",
            "Day 7: A week closer to Christmas! ☃️ Time to build a snowman?",
            "Day 8: 🎶 Listen to your favorite Christmas songs today!",
            "Day 9: Decorate your home with lights and cheer! ✨",
            "December 10th: ❄️ Enjoy a peaceful winter walk today.",
            "Day 11: 🍪 Bake some cookies and share them with your loved ones.",
            "December 12th: 🎄 Trim the tree or add some ornaments!",
            "Day 13: Light up the night with some fairy lights! 🌟",
            "December 14th: 🎁 Wrap some gifts and make someone smile.",
            "Day 15: ❄️ Make a snow angel or watch a festive movie!",
            "December 16th: 🎶 Sing along to your favorite carols.",
            "Day 17: 🕯️ Light an Advent candle and enjoy the moment.",
            "December 18th: 🎄 Prepare a cozy evening with friends or family.",
            "Day 19: ☃️ Take a moment to relax and enjoy the season.",
            "Day 20: 🎁 Give someone a heartfelt compliment today!",
            "December 21st: 🌟 The shortest day of the year—enjoy the long night!",
            "Day 22: 🎶 Watch a Christmas classic like 'Home Alone' or 'Elf'.",
            "December 23rd: 🎁 Finish wrapping those last-minute gifts!",
            "Merry Christmas! 🎅 You've reached December 24th! Celebrate and cherish the day!"
    };

    @FXML
    public void openDoor(javafx.event.ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();
        int doorNumber = Integer.parseInt(buttonText); // Get door number

        // Show the message for the selected door
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Advent Calendar");
        alert.setHeaderText(null);
        alert.setContentText(messages[doorNumber - 1]);
        alert.showAndWait();

        // Disable button after opening
        clickedButton.setDisable(true);
    }



}