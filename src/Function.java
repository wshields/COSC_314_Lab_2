public class Function {

    private int rows;
    private int columns;
    private int[][] functionImages;


    // Constructor for function
    public Function(int m, int n, int[][] f) {
        this.rows = m + 1;
        this.columns = n + 1;
        this.functionImages = f;
    }

    public void testFunction() {
        this.oneToOne(this.functionImages);
        this.onTo(this.functionImages);
    }

    /*
        Tests if a function is one-to-one by iterating through each column. If a column has more than one one it is not one-to-to
        Ends by printing a string with the results
     */
    private void oneToOne(int[][] f) {
        boolean oneToOne = false;
        for(int i = 0; i < this.columns; i++) {
            int oneCount = 0;
            for(int j = 0; j < this.rows; j++) {
                if(f[j][i] == 1) {
                    oneCount++;
                }
            }

            if(oneCount == 1) {
                oneToOne = true;
            } else if(oneCount > 1) {
                oneToOne = false;
                break;
            }
        }
        if (oneToOne) {
            System.out.println("Function is one-to-one");
        } else {
            System.out.println("Function is NOT one-to-one");
        }
    }

    /*
        Tests if the function is on to
        Very similar to the oneToOne function except it is checking for one or more ones compared to zero instead of just 1 vs greater than 1
    */
    private void onTo(int[][] f) {
        boolean onTo = false;
        for(int i = 0; i < this.columns; i++) {
            int oneCount = 0;
            for(int j = 0; j < this.rows; j++) {
                if(f[j][i] == 1) {
                    oneCount++;
                }
            }

            if(oneCount >= 1) {
                onTo = true;
            } else {
                onTo = false;
                break;
            }
        }
        if (onTo) {
            System.out.println("Function is on to");
        } else {
            System.out.println("Function is NOT on to");
        }
    }

}
