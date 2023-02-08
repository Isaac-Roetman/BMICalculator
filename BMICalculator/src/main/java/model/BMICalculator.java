/**
 * @author Isaac Roetman - ijroetman
 * CIS175 - Spring 2023
 * Feb 7, 2023
 */
package model;

/**
 * @author Isaac Roetman
 *
 */
public class BMICalculator {
private int age;
private int height;
private double weight;
private double BMI;

public BMICalculator() { //default constructor
	super();
}
public BMICalculator(int age) {
	super();
	this.age = age;
}

public BMICalculator(int height, double weight) { //constructor with parameters
	super();
	this.height = height;
	this.weight = weight;
	setBMI(height,weight); //calls the BMI method with the form variables
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public void setBMI(int height, double weight) {
	this.BMI = (weight / (height*height))*703;
}
public double getBMI() {
	return BMI;
}
@Override
public String toString() {
	return "BMI Calculator [Age = " + age + "  Height = " + height +"in  weight = "+ weight +"lbs  BMI = " + BMI + "]";
}
}
