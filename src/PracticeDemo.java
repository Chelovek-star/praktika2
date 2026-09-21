public class PracticeDemo {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, 8};
        int min = arr[0], max = arr[0], sum = 0;

        for (int x : arr) {
            if (x < min) min = x;
            if (x > max) max = x;
            sum += x;
        }
        double avg = (double) sum / arr.length;
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int val : matrix[i]) {
                rowSum += val;
            }
            System.out.println("Сумма строки " + i + ": " + rowSum);
        }
        if (matrix.length > 0) {
            for (int c = 0; c < matrix[0].length; c++) {
                int colSum = 0;
                for (int r = 0; r < matrix.length; r++) {
                    colSum += matrix[r][c];
                }
                System.out.println("Сумма столбца " + c + ": " + colSum);
            }
        }
        String csvLine = "java,python,c++,java";
        String[] fields = csvLine.split(",");

        int javaCount = 0;
        for (String field : fields) {
            if (field.equalsIgnoreCase("java")) {
                javaCount++;
            }
        }

        StringBuilder report = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            report.append("Поле ").append(i).append(": ").append(fields[i]).append(System.lineSeparator());
        }

        System.out.println("Найдено совпадений: " + javaCount);
        System.out.println(report.toString());
    }
}