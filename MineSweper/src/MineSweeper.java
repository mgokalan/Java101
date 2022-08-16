import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    int mine;
    int selectedRow;
    int selectedColumn;
    boolean isFinish;

    public static boolean isValidIndex(int i, int j, String tempArray[][]) {
        return (i >= 0 && i < tempArray.length && j >= 0 && j < tempArray[i].length);
    }

    public int[] userInput(int row, int column) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.print("Please enter the row: ");
        selectedRow = input.nextInt() - 1;
        System.out.print("Please enter the column: ");
        selectedColumn = input.nextInt() - 1;
        while (selectedRow < 0 || selectedRow >= row || selectedColumn < 0 || selectedColumn >= column) {
            System.out.println("You have entered number out of the game!");
            System.out.print("Please enter the row: ");
            selectedRow = input.nextInt() - 1;
            System.out.print("Please enter the column: ");
            selectedColumn = input.nextInt() - 1;
        }
        int[] statement = new int[2];
        statement[0] = selectedRow;
        statement[1] = selectedColumn;
        return statement;
    }

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.mine = Math.round(this.row * this.column / 4);
        this.selectedRow = selectedRow;
        this.selectedColumn = selectedColumn;


        String[][] array = new String[this.row][this.column];
        String[][] array2 = new String[this.row][this.column];

        while (this.mine > 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != "*" && array[i][j] != "-") {
                        array[i][j] = "-";
                    }
                    if (array[i][j] == "-" && Math.random() >= 0.8 && this.mine > 0) {
                        array[i][j] = "*";
                        this.mine--;
                    }
                }
            }
        }

        String tempArray[][] = array;

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray[i].length; j++) {
                if (tempArray[i][j] == "-") {
                    int count = 0;
                    if (isValidIndex(i, j - 1, tempArray) && tempArray[i][j - 1] == "*") {
                        count += 1;
                    }
                    if (isValidIndex(i, j + 1, tempArray) && tempArray[i][j + 1] == "*") {
                        count += 1;
                    }
                    if (isValidIndex(i - 1, j - 1, tempArray) && tempArray[i - 1][j - 1] == "*") {
                        count += 1;
                    }
                    if (isValidIndex(i - 1, j, tempArray) && tempArray[i - 1][j] == "*") {
                        count += 1;
                    }
                    if (isValidIndex(i - 1, j + 1, tempArray) && tempArray[i - 1][j + 1] == "*") {
                        count += 1;
                    }
                    if (isValidIndex(i + 1, j - 1, tempArray) && tempArray[i + 1][j - 1] == "*") {
                        count += 1;
                    }
                    if (isValidIndex(i + 1, j, tempArray) && tempArray[i + 1][j] == "*") {
                        count += 1;
                    }
                    if (isValidIndex(i + 1, j + 1, tempArray) && tempArray[i + 1][j + 1] == "*") {
                        count += 1;
                    }
                    if (count == 0) {
                        tempArray[i][j] = "0";
                    } else {
                        tempArray[i][j] = String.valueOf(count);
                    }
                }
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = "-";
            }
        }

        System.out.println("Here is your game");
        for (String[] u : array2) {
            for (String elem : u) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        int[] userInput = userInput(row, column);
        this.selectedRow = userInput[0];
        this.selectedColumn = userInput[1];

        while (tempArray[this.selectedRow][this.selectedColumn] != "*") {
            array2[this.selectedRow][this.selectedColumn] = tempArray[this.selectedRow][this.selectedColumn];
            for (String[] u : array2) {
                for (String elem : u) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
            this.isFinish = true;
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    if (tempArray[i][j] != "*") {
                        if (tempArray[i][j] != array2[i][j]) {
                            isFinish = false;
                        }
                    }
                }
            }
            if (isFinish) {
                System.out.println("--------------------");
                System.out.println("CONGRATULATIONS YOU WON");
                break;
            }
            int[] userInput2 = userInput(row, column);
            this.selectedRow = userInput2[0];
            this.selectedColumn = userInput2[1];
        }
        if (tempArray[this.selectedRow][this.selectedColumn] == "*") {
            System.out.println("--------------------");
            System.out.println("GAME OVER");
            System.out.println("This was your game");
            for (String[] u : tempArray) {
                for (String elem : u) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
    }
}


