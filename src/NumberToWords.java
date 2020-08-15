public class NumberToWords {

    public static void numberToWords(int number) {                           // . Creating the method numberToWords.

        if (number >= 0) {                                                   // . Creating a if statement to check if the n is positive or not.

            int reversedNumber = reverse(number);                            // . Creating a var reversedNumber to store the number in input reversed thanks to the method reverse.

            for(int i = 0; i < getDigitCount(number); i++){                  // . Creating a for loop to do as many cycles as the number of digits of the number in input, thanks to the method getDigitCount

                int container = reversedNumber % 10;                         // . Storing the last digit of the number in input reversed , inside a var "container".

                    switch (container) {                                     // . Using a switch statement for the value obtained inside the var "container".
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                        default:
                            System.out.println("Zero");
                            break;
                    }

                    reversedNumber /= 10;                                    // . Remove the last digit from the reversedNumber and the loop is going to perform until the var i has reached the digits of the number in input.


                }

                    }else {                                                  // . The alternative output if the value is not positive.
                    System.out.println("Invalid Value");
                }


            }



        public static int reverse ( int number){                             // . Creating a method reverse to reverse the number in input

            int lastLetter;                                                  // . lastLetter will be the var for storing each cicle the last var ( is going to be override)
            int reversedNumber = 0;                                          // . reversedNumber is our output var.
            while (number != 0) {                                            // . Creating a while loop for retrieving every digit of the number in input.
                lastLetter = number % 10;                                    // . Using the modulo operator / by 10 to get the last number and storing the value in the lastLetter var.
                reversedNumber = (reversedNumber * 10) + (lastLetter);       // . Multiply each cicle the reversedNumber by 10 and then adding the lastLetter value (| (first cicle)| input 234 -- 4 -> 0*10 + 4 = 4 | (next cicle) | 23 -- 3 -> 4*10 + 3 = 43 ..
                number = number / 10;                                        // . Divide the number (input) by 10 so to remove the last digit. 234 -- 23  -- 2
                                                                             // . Ending the loop only when the number var (input) turns to 0 after n cicles.
            }
            return reversedNumber;
        }

        public static int getDigitCount ( int number){                       // . Creating a method getDigitCount to calculate the numbers of digits in a number.

            if (number >= 0) {                                               // . Checking if the number is positive.
                int index = 0;                                               // . Creating a var index for counting the n of cycles that is equivalent to the number of digits.

                do {                                                         // . Creating a while loop that is going to cycle until the number in input turns 0
                    index++;                                                 // . Every cycle we increment the index var that is counting the digits
                    number /= 10;                                            // . Ending every cycle by dividing the number in input by 10 ( so removing the last digit)
                } while (number != 0);

                return index;                                                // . Returning the index value tha holds the number of cycles = n of digits.
            } else {
                return -1;                                                   // . Returning -1 only if the value isn't a positive number.
            }
        }


    }


