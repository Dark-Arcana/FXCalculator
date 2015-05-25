package com.arcana.calculator;

import java.io.IOException;
import java.lang.NumberFormatException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;

public class Calculator extends Application {
	
	private String equationLeft;
	private String equationRight;
	private String operator;
	
	private boolean opUsed = false;
	
	private double output;
	private Double equationDouble;
	private int outputInt;
	private int equationInt;
	
	@FXML
	Button buttonOne, buttonTwo, buttonThree,
		   buttonFour, buttonFive, buttonSix,
		   buttonSeven, buttonEight, buttonNine,
		   buttonZero, buttonDecimal, buttonClear,
		   buttonDivide, buttonMultiply, buttonSubtract,
		   buttonAdd, buttonEnter;
	
	@FXML
	Label equationLabel, outputLabel;
	
	@FXML
	MenuItem closeMenu;
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("calculator.fxml"));
			Scene scene = new Scene(root, 300, 375);
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setEquationText(String text) {
		equationLabel.setText(text);
	}
	
	public void setOutputText(String text) {
		outputLabel.setText(text);
	}

	public void textProcessor() {
		equationDouble = (double) Double.parseDouble(equationLeft);
		equationInt = equationDouble.intValue();
		
		if (equationInt == equationDouble) {
			setEquationText(String.valueOf(equationInt) + " " + operator);
		}
		else {
			setEquationText(equationLeft + " " + operator);
		}
	}
	
	@FXML
	public void closePressed(ActionEvent e) {
		Platform.exit();
	}
	
	@FXML
	public void buttonPressed(ActionEvent e) {
		Button button = (Button) e.getSource();
		String buttonText = button.getText();
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += buttonText;	
			} else {
				equationLeft = buttonText;
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += buttonText;	
			} else {
				equationRight = buttonText;
			}
			if (equationInt == equationDouble) {
				setEquationText(String.valueOf(equationInt) + " " + operator + " " + equationRight); 
			}
			else {
				setEquationText(equationLeft + " " + operator + " " + equationRight);
			}
		}
	}
	
	@FXML
	public void buttonDecimalPressed(ActionEvent e) {
		if (!opUsed) {
			if (equationLeft == null) {
				equationLeft = "0.";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			else if (!equationLeft.contains(".")) {
				equationLeft += ".";
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight == null) {
				equationRight = "0.";
			}
			else if (!equationRight.contains(".")) {
				equationRight += ".";
			}
			if (equationInt == equationDouble) {
				setEquationText(String.valueOf(equationInt) + " " + operator + " " + equationRight); 
			}
			else {
				setEquationText(equationLeft + " " + operator + " " + equationRight);
			}
		}
	}
	
	@FXML
	public void buttonClearPressed(ActionEvent e) {
		equationLeft = null;
		equationRight = null;
		equationLabel.setText("");
	}
	
	@FXML
	public void buttonDividePressed(ActionEvent e) {
		opUsed = true;
		if (operator == null) {
			operator = "/";
		}
		
		textProcessor();
	}
	
	@FXML
	public void buttonMultiplyPressed(ActionEvent e) {
		opUsed = true;
		if (operator == null) {
			operator = "*";
		}
		
		textProcessor();
	}
	
	@FXML
	public void buttonSubtractPressed(ActionEvent e) {
		opUsed = true;
		if (operator == null) {
			operator = "-";
		}
		
		textProcessor();
	}
	
	@FXML
	public void buttonAddPressed(ActionEvent e) {
		opUsed = true;
		if (operator == null) {
			operator = "+";
		}
		
		textProcessor();
	}
	
	@FXML
	public void buttonEnterPressed(ActionEvent e) {
		
		if (equationLeft != null && equationRight != null) {
			switch(operator) {
				case "/":
					output = Double.valueOf(equationLeft) / Double.valueOf(equationRight);
					if (output == (int) output) {
						outputInt = (int) output;
						setOutputText(String.valueOf(outputInt));
					}
					else {
						setOutputText(String.valueOf(output));
					}
					equationLeft = String.valueOf(output);
					equationRight = null;
					opUsed = false;
					operator = null;
					break;
				case "*":
					output = Double.valueOf(equationLeft) * Double.valueOf(equationRight);
					if (output == (int) output) {
						outputInt = (int) output;
						setOutputText(String.valueOf(outputInt));
					}
					else {
						setOutputText(String.valueOf(output));
					}
					equationLeft = String.valueOf(output);
					equationRight = null;
					opUsed = false;
					operator = null;
					break;
				case "-":
					output = Double.valueOf(equationLeft) - Double.valueOf(equationRight);
					if (output == (int) output) {
						outputInt = (int) output;
						setOutputText(String.valueOf(outputInt));
					}
					else {
						setOutputText(String.valueOf(output));
					}
					equationLeft = String.valueOf(output);
					equationRight = null;
					opUsed = false;
					operator = null;
					break;
				case "+":
					output = Double.valueOf(equationLeft) + Double.valueOf(equationRight);
					if (output == (int) output) {
						outputInt = (int) output;
						setOutputText(String.valueOf(outputInt));
					}
					else {
						setOutputText(String.valueOf(output));
					}
					equationLeft = String.valueOf(output);
					equationRight = null;
					opUsed = false;
					operator = null;
					break;
				default:
					break;
			}
		}
	}
}
