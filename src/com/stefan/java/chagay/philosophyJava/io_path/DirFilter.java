package com.stefan.java.chagay.philosophyJava.io_path;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Pattern "strategy"
 *
 * метод list() вызывает accept() для каждого файла для того чтобы определить,
 * какие включить в выходной список, в зависимости от вовращаемого значения accept()
 */
public class DirFilter implements FilenameFilter {
    Pattern pattern;
    DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    /**
     * use obj regular of expression "matcher" to see to corresponds name file expression regex
     * @param dir
     * @param name
     * @return boolean
     */
    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
