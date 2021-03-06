package org.example;

import javax.security.auth.Subject;
import java.io.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        App Student = new App();

        int lines = 0;
        int j = 0;

        int count = 0;
        int x = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("JC_Results.txt"));
            //length the array must be
            while (reader.readLine() != null) lines++;
            reader.close();

            System.out.println(lines);

            String[] Student_Number = new String[lines];
            double[] finish = new double[lines];
            int[] Subject_Code = new int[8];
            int[] Mark = new int[8];
            String h = new String();
            File file = new File("JC_Results.txt");
            Scanner scan = new Scanner(file);


            String[] lineg = new String[lines];
            for (int i = 0; i < lines; i++) {
                //single student record
                lineg[i] = scan.nextLine();
                h = lineg[i];
                Scanner s = new Scanner(lineg[i]);
                s.useDelimiter(",");
                Student_Number[i] = s.next();

                for (int y = 0; y < h.length(); y++) {

                    if (y < 8) {
                        Subject_Code[y] = s.nextInt();
                        //  System.out.println("Subject" + Subject_Code[y]);
                        Mark[y] = s.nextInt();
                        //   System.out.println("Mark" + Mark[y]);

                    }


                }
                while (lines == x) {
                    System.out.println(Arrays.toString(Student.selectFiveGrades(Subject_Code, Mark)));
                    x++;

                }


                finish[i] = Student.calculateAverage(Student.selectFiveGrades(Subject_Code, Mark));
                System.out.println(finish[i]);
                s.close();
            }

            output(Student_Number, finish);
scan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public int[] selectFiveGrades(int[] codes, int[] grades) {

        String[] subject = new String[codes.length];
        int[] Total = new int[5];
        int first = 0, second = 0, third = 0;
        //      System.out.println("Codes" + Arrays.toString(codes));
        //    System.out.println("Grades" + Arrays.toString(grades));

        for (int k = 0; k < Total.length; k++) {
            Total[k] = 0;
        }
        for (int i = 0; i < codes.length; i++) {


            if (codes[i] == 1) {
                subject[i] = "Irish";
            }
            if (codes[i] == 2) {
                subject[i] = "English";
            }
            if (codes[i] == 3) {
                subject[i] = "Mathematics";
            }
            if (codes[i] == 4) {
                subject[i] = "History";
            }
            if (codes[i] == 5) {
                subject[i] = "Geography";

            }
            if (codes[i] == 6) {
                subject[i] = "Classical Studies";
            }
            if (codes[i] == 7) {
                subject[i] = "Ancient Greek";
            }
            if (codes[i] == 8) {
                subject[i] = "Classical Studies";
            }
            if (codes[i] == 9) {
                subject[i] = "Hebrew Studies";
            }
            if (codes[i] == 10) {
                subject[i] = "French";
            }
            if (codes[i] == 11) {
                subject[i] = "Germany";
            }
            if (codes[i] == 12) {
                subject[i] = "Spain";
            }
            if (codes[i] == 13) {
                subject[i] = "Italian";
            }
            if (codes[i] == 27) {
                subject[i] = "Engineering";
            }
            if (codes[i] == 40) {
                subject[i] = "Typewriting";
            }
            if (codes[i] == 41) {
                subject[i] = "Art, Craft, Design";
            }
            if (codes[i] == 42) {
                subject[i] = "Business Studies";
            }
            if (codes[i] == 46) {
                subject[i] = "Music (JC)";
            }
            if (codes[i] == 47) {
                subject[i] = "Materials Technology (Wood)";
            }
            if (codes[i] == 48) {
                subject[i] = "Technical Graphics";
            }
            if (codes[i] == 52) {
                subject[i] = "Home Economics (JC)";
            }
            if (codes[i] == 54) {
                subject[i] = "Metalwork";
            }
            if (codes[i] == 57) {
                subject[i] = "Science (JC - Revised Syllabus)";
            }
            if (codes[i] == 65) {
                subject[i] = "Technology";
            }
            if (codes[i] == 81) {
                subject[i] = "Environmental & Social Studies";
            }
            if (codes[i] == 82) {
                subject[i] = "Irish 2";
            }
            if (codes[i] == 83) {
                subject[i] = "Irish 1";
            }
            if (codes[i] == 100) {
                subject[i] = "Keyboarding";
            }
            if (codes[i] == 106) {
                subject[i] = "Classics";
            }
            if (codes[i] == 125) {
                subject[i] = "Applied Technology";
            }
            if (codes[i] == 126) {
                subject[i] = "Wood Technology";
            }
            if (codes[i] == 137) {
                subject[i] = "Graphics";
            }

            if (codes[i] == 200) {
                subject[i] = "Project Mathematics";
            }

            if (codes[i] == 217) {
                subject[i] = "Religious Education (non-exam)";
            }
            if (codes[i] == 218) {
                subject[i] = "Civic, Social & Political Education (CSPE)";
            }
            if (codes[i] == 220) {
                subject[i] = "Religious Education (JC Exam)";
            }
            if (codes[i] == 221) {
                subject[i] = "Social, Personal and Health Education (SPHE)";
            }
            if (codes[i] == 224) {
                subject[i] = "Physical Education (JC)";
            }
            if (codes[i] == 565) {
                subject[i] = "Jewish Studies";
            }
            if (codes[i] == 569) {
                subject[i] = "Visual Arts";
            }

            System.out.println("codes= " + codes[i] + " subject " + subject[i] + " grades= " + grades[i]);


            if (subject[i] == "Irish") {
                //    System.out.println("Firts Total "+Total[0]);
                Total[0] = grades[i];
                //  System.out.println("grades"+subject[i]);
                //  System.out.println("grades"+ grades[i]);
                //  System.out.println("hello");

            }
            if (subject[i] == "English") {
                Total[1] = grades[i];
                // System.out.println("grades"+subject[i]);
                //  System.out.println("hello");
            }
            if (subject[i] == "Mathematics") {
                Total[2] = grades[i];
                //     System.out.println("hello");
                //   System.out.println("grades"+subject);

            }

            // System.out.println("Totals"+Total[0]+Total[1]+Total[2]);
            if ((subject[i] == "Mathematics") || (subject[i] == "English") || (subject[i] == "Irish") || (subject[i] == "Civic, Social & Political Education (CSPE)")) {
                grades[i] = 0;

            }
            if (!(subject[i] == "Mathematics") || (subject[i] == "English") || (subject[i] == "Irish") || (subject[i] == "Civic, Social & Political Education (CSPE)")) {
                if (grades[i] > first) {

                    second = first;
                    first = grades[i];
                }

            /* If arr[i] is in between first and
            second then update second  */
                else if (grades[i] > second) {

                    second = grades[i];
                }


            }


        }

        Total[3] = first;
        Total[4] = second;

        // System.out.println("first"+first+second);
        // System.out.println("before"+Arrays.toString(Total));
        return Total;

    }


    private double calculateAverage(int[] selectedGrades) {


        double[] doubles = new double[selectedGrades.length];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = selectedGrades[i];
        }
        System.out.println(Arrays.toString(doubles));
        double average = (doubles[0] + doubles[1] + doubles[2] + doubles[3] + doubles[4]) / 5;

        return average;

    }


    public static void output(String [] StudentNumber ,double [] average) {
        System.out.println("Student Number ------------------------------Average");
        for(int i =0; i < StudentNumber.length;i++){
            System.out.println(StudentNumber[i] +" \t\t\t\t\t\t\t\t\t\t\t"+average[i]);
        }
        System.out.println("----------------------------------------------------");
    }
}

/*
            while (scan.hasNext()) {

               Student_Number[i] = scan.next();
            if(i < lines-1){
                i++;
            }
                while( j <= 7 ){

                   Subject_Code [j] = scan.next();
                    System.out.println(Subject_Code[j]);

                   while (j == 8){

                    Mark[j] = scan.next();
j++;
                   }

                       Mark [j] = scan.next();

                    System.out.println("Mark"+Mark[j]);
                   j++;

               }





 */

