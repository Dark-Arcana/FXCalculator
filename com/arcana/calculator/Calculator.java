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
	private int outputInt;
	private int equationInt;
	private Double equationDouble;
	
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
	
	public void setEquationText(String text) {
		equationLabel.setText(text);
	}
	
	public void setOutputText(String text) {
		outputLabel.setText(text);
	}
	
	@FXML
	public void buttonOnePressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "1";	
			} else {
				equationLeft = "1";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "1";	
			} else {
				equationRight = "1";
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
	public void buttonTwoPressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "2";	
			} else {
				equationLeft = "2";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "2";	
			} else {
				equationRight = "2";
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
	public void buttonThreePressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "3";	
			} else {
				equationLeft = "3";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "3";	
			} else {
				equationRight = "3";
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
	public void buttonFourPressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "4";	
			} else {
				equationLeft = "4";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "4";	
			} else {
				equationRight = "4";
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
	public void buttonFivePressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "5";	
			} else {
				equationLeft = "5";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "5";	
			} else {
				equationRight = "5";
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
	public void buttonSixPressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "6";	
			} else {
				equationLeft = "6";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "6";	
			} else {
				equationRight = "6";
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
	public void buttonSevenPressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "7";	
			} else {
				equationLeft = "7";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "7";	
			} else {
				equationRight = "7";
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
	public void buttonEightPressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "8";	
			} else {
				equationLeft = "8";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "8";	
			} else {
				equationRight = "8";
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
	public void buttonNinePressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null) {
				equationLeft += "9";	
			} else {
				equationLeft = "9";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null) {
				equationRight += "9";	
			} else {
				equationRight = "9";
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
	public void buttonZeroPressed(ActionEvent e) {
		
		if (!opUsed) {
			if (equationLeft != null && !equationLeft.equals("0")) {
				equationLeft += "0";	
			} else {
				equationLeft = "0";
				equationDouble = (double) Double.parseDouble(equationLeft);
				equationInt = equationDouble.intValue();
			}
			setEquationText(equationLeft);
		}
		else if (opUsed) {
			if (equationRight != null && !equationRight.equals("0")) {
				equationRight += "0";	
			} else {
				equationRight = "0";
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
	public void buttonMultiplyPressed(ActionEvent e) {
		opUsed = true;
		if (operator == null) {
			operator = "*";
		}
		
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
	public void buttonSubtractPressed(ActionEvent e) {
		opUsed = true;
		if (operator == null) {
			operator = "-";
		}
		
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
	public void buttonAddPressed(ActionEvent e) {
		opUsed = true;
		if (operator == null) {
			operator = "+";
		}
		
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
	
	@FXML
	public void closePressed(ActionEvent e) {
		Platform.exit();
	}
}
