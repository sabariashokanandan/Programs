import java.io.*;
import java.util.*;
class HashMapSample {
    public static void main(String args[])
    {
        sampleHashTable();
    }

    public static void sampleHashTable()
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
  
        hm.put(1, "Geeks");
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");
  
        System.out.println("Initial Map " + hm);
  
        hm.put(2, "For");
  
        System.out.println("Updated Map " + hm);
    }
}