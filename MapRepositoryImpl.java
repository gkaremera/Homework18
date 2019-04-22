package edu.dmacc.codedsm.hw18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class MapRepositoryImpl implements MapRepository {
    private Map<Integer, Result> storage = new HashMap<>();
    private PrintStream output;
    {
        try {
            output = new PrintStream("fizzbuzz_rersult.text");
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void save(Result result) {

        storage.put(1,result);
        output.print(result);
    }
}
