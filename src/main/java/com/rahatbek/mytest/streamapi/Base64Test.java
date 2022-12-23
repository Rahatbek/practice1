package com.rahatbek.mytest.streamapi;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Encode
        String b64 = Base64.getEncoder().encodeToString("input".getBytes("utf-8")); //aW5wdXQ==
        System.out.println(b64);

        // Decode
//        String str = new String(Base64.getDecoder().decode("aW5wdXQ=="), "utf-8"); //input
//        System.out.println(str);
    }
}
