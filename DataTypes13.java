//write a program to print the characters using given ASCII values:67,79,82,69,50,87,69,66
 class PrintCharacters {
    public static void main(String[] args) {
        // Array of ASCII values
        int[] asciiValues = {67, 79, 82, 69, 50, 87, 69, 66};

        // Loop through the array and print each corresponding character
        for (int i = 0; i < asciiValues.length; i++) {
            // Convert the ASCII value to a character and print
            System.out.print((char) asciiValues[i]);
        }
    }
}

