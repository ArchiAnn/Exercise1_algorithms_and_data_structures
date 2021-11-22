package de.htw.MyApp.console.impl;

import de.htw.MyApp.console.IConsole;

import java.io.*;
import java.util.Scanner;

public class Console implements IConsole {

    final private Scanner scanner = new Scanner(System.in);


    @Override
    public String readString(String text) {
        write(text);
        String outputmid = "", outputmid2 = "", output = "";

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String input = null;
        try {
            input = bufferedReader.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean checker = false;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '\\' && i < input.length() - 1 && (input.charAt(i + 1) == 't' || input.charAt(i + 1) == 'b'
                        || input.charAt(i + 1) == 'n' || input.charAt(i + 1) == 'r' || input.charAt(i + 1) == 'f'
                        || input.charAt(i + 1) == '\'' || input.charAt(i + 1) == '"' || input.charAt(i + 1) == '\\') && checker == false) {

                    continue;
                } else if (i > 0 && input.charAt(i - 1) == '\\' && (input.charAt(i) == 't' || input.charAt(i) == 'b'
                        || input.charAt(i) == 'n' || input.charAt(i) == 'r' || input.charAt(i) == 'f'
                        || input.charAt(i) == '\'' || input.charAt(i) == '"' || input.charAt(i) == '\\') && checker == false) {
                    continue;
                } else if (input.charAt(i) == ' ' && checker == false) {
                    continue;
                } else {
                    outputmid += input.charAt(i);
                    checker = true;
                }

            }
            StringBuilder sb = new StringBuilder(outputmid);
            sb.reverse();

            checker = false;
            for (int i = 0; i < sb.length(); i++) {
                if ((sb.charAt(i) == 't' || sb.charAt(i) == 'b'
                        || sb.charAt(i) == 'n' || sb.charAt(i) == 'r' || sb.charAt(i) == 'f'
                        || sb.charAt(i) == '\'' || sb.charAt(i) == '"' || sb.charAt(i) == '\\')
                        && sb.charAt(i + 1) == '\\' && i < sb.length() - 1 && checker == false) {
                    continue;
                } else if (i > 0 && sb.charAt(i) == '\\' && (sb.charAt(i - 1) == 't' || sb.charAt(i - 1) == 'b'
                        || sb.charAt(i - 1) == 'n' || sb.charAt(i - 1) == 'r' || sb.charAt(i - 1) == 'f'
                        || sb.charAt(i - 1) == '\'' || sb.charAt(i - 1) == '"' || sb.charAt(i - 1) == '\\') && checker == false) {
                    continue;
                } else if (sb.charAt(i) == ' ' && checker == false) {
                    continue;
                } else {
                    outputmid2 += sb.charAt(i);
                    checker = true;
                }
            }
            StringBuilder sbEnd = new StringBuilder(outputmid2);
            sbEnd.reverse();
            output = sbEnd.toString();
            return output;


    }

    @Override
    public int readInteger(String text) {
        write(text);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        else {
            Console newConsole = new Console();
            return newConsole.readInteger(text);
        }
    }


    @Override
    public void write(String s) {
        System.out.print(s);
    }
}
