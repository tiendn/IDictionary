/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monkey-private
 */
public class Dictionary implements IDictionary {

    public Hashtable<String, Word> mapWord;
    private final File indexesFile;
    private final File meansFile;
    private Vector<String> words = new Vector<>();
    private static RandomAccessFile raf;
    private static IWord word;
     
    /**
     * Constructor : initiate File data dictioanry and load file index;
     */
    public Dictionary() {
        // Init hashtable
        this.mapWord = new Hashtable<>();
        // Indexes file
        indexesFile = new File(IDictionary.pathIndexEV);
        // Meanning file
        meansFile = new File(IDictionary.pathMeaningEV);
        // Init random access file

        // Load index file 
        loadIndex();
    }
    /**
     * (non-Javadoc)
     * @see model.IDictionary#loadIndex 
     */
    @Override
    public void loadIndex() {

        long begin = System.currentTimeMillis();
        try {
            // Using StringBuilder 
            StringBuilder strBuilder = new StringBuilder();
            try (FileInputStream input = new FileInputStream(indexesFile)) {
                byte[] buffer = new byte[1024];
                while (input.read(buffer) != -1) // Loops until indexes file end.
                {
                    strBuilder.append(new String(buffer));
                }
                // Read data index
                String data = strBuilder.toString();
                StringTokenizer tokenizer = new StringTokenizer(data, "\n");
                while (tokenizer.hasMoreTokens()) {
                    String line = tokenizer.nextToken();
                    // divided string 
                    String elements[] = line.split("\t");
                    if (elements.length == 3) { // If enough word,off,length
//                        String word = mapWord.get(elements[0]);
                        int offset = base64ToBase10(elements[1]);
                        int length = base64ToBase10(elements[2]);
                        // Add to vector words.
                        words.add(elements[0]);
                        // Create a new word;
                        word = new Word(elements[0], offset, length);
                        // Add to hashtable;
                        mapWord.put(elements[0], (Word) word);
                    }
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error IO " + ioe.getMessage());;
        }
        long end = System.currentTimeMillis();
        System.out.println("Load indexes file took " + (end - begin) + " ms");
    }
    /**
     * Convert base 64 number to base 10 number;
     * @param val
     * @return Base10
     */
    public int base64ToBase10(String val) {
        int number = 0;
        int length = val.length();
        String opcode = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        for (int i = 0; i < length; i++) {
            number += opcode.indexOf(val.charAt(i)) * Math.pow(64, length - i - 1);
        }
        return number;
    }
    /**
     * (non-Java doc)
     * 
     * @see model.IDictionary#loadMeaning(java.lang.String)  
     */
    @Override
    public String loadMeaning(String word) {
        String meaning = "";
        try {
            raf = new RandomAccessFile(meansFile, "r"); // Using random access file to seek position
            IWord wordSearch = mapWord.get(word);
            for (int i = 0; i < wordSearch.getLength(); i++) {
                byte[] buff = new byte[wordSearch.getLength()];
                raf.seek(wordSearch.getOffset());
                raf.read(buff, 0, wordSearch.getLength()); // read date into buff
                meaning = new String(buff, "UTF8").replaceAll("\0+", "");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return meaning;
    }

    /**
     * (non-Javadoc)
     * @see model.IDictionary#getListWord() 
     */
    @Override
    public Vector<String> getListWord() {
        return words;

    }
}
