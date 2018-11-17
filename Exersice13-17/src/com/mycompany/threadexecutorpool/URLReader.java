package com.mycompany.threadexecutorpool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLReader {
    String inputLine;
	URL oracle = new URL("https://www.sportal.bg/");
    BufferedReader in = new BufferedReader(
            new InputStreamReader(oracle.openStream()));

    while ((inputLine = in.readLine()) != null) {
        printLink(inputLine);
        //System.out.println(inputLine);
    }
    in.close();


private static void printLink(String innerHTML){
    Pattern p = Pattern.compile("href=\"(http.*?)\"");
    Matcher m = p.matcher(innerHTML);

    while (m.find()) {
        System.out.println(m.group(1));
    }

}
}
