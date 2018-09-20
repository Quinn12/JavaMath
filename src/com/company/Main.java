package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double total = 0;
        double tip =0;
        double tax =0;
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Enter a list of prices, and end list with 0.");
        double item;
	    do {
            item = sc.nextDouble();
            total = total + item;
            System.out.println(total);

        }while(item != 0);

	    if(item == 0)
	    {
	       tip = ((total * 1.25)*1.175) - total;
	       tax = (total * 1.25) - total;
	       nf.setGroupingUsed(true);
	       nf.setMaximumFractionDigits(2);
	       nf.setMinimumFractionDigits(2);
            System.out.println("Amount cost: $" + nf.format(total));
            System.out.println("Tip cost: $" + nf.format(tip));
            System.out.println("Tax cost: $" + nf.format(tax));
            System.out.println("Total cost: $" + nf.format ((total * 1.25)*1.175));
        }

    }
}
