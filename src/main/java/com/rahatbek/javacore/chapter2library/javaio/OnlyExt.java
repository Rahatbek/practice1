package com.rahatbek.javacore.chapter2library.javaio;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class DirListOnly {
    public static void main(String[] args) {
        String dirName = "java";
        File f1 = new File(dirName);
        FilenameFilter only = new OnlyExt("txt");
        String s[] = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}