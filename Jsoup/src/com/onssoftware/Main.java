package com.onssoftware;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Connection connect = Jsoup.connect("https://www.google.com");
        Document document1 = connect.get();
        System.out.println();
    }
}
