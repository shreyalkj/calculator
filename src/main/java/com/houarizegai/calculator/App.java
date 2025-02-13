package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;

public class App {

    public static void main(String[] args) {
        new CalculatorUI();
    }
}
using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter first number: ");
        double num1 = Convert.ToDouble(Console.ReadLine());

        Console.Write("Enter second number: ");
        double num2 = Convert.ToDouble(Console.ReadLine());

        double sum = num1 + num2;

        Console.WriteLine($"The sum is: {sum}");
    }
}
