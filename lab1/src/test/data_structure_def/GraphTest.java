package data_structure_def;

import org.junit.*;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class GraphTest {
    @BeforeClass
    public static void set_graph(){
        File file=new File("src/test.txt");
        graph.graph_build_file(file);
    }
    private static Graph graph = new Graph();

    @Test
    public void queryBridgeWords1() {
        String word1 = "new";
        String word2 = "and";
        String words = graph.queryBridgeWords(word1,word2);
        String test="The bridge words from \"" + word1 + "\" to \"" + word2 + "\" is: " + words;
        assertEquals("The bridge words from \"new\" to \"and\" is: life",test);
    }
    @Test
    public void queryBridgeWords2() {
        String word1 = "New";
        String word2 = "and";
        String words = graph.queryBridgeWords(word1,word2);
        assertEquals("No \"New\" in the graph!",words);
    }
    @Test
    public void queryBridgeWords3() {
        String word1 = "neww";
        String word2 = "andd";
        String words = graph.queryBridgeWords(word1,word2);
        assertEquals("No \"neww\" and \"andd\" in the graph!",words);
    }
    @Test
    public void queryBridgeWords4() {
        String word1 = "New";
        String word2 = "andd";
        String words = graph.queryBridgeWords(word1,word2);
        assertEquals("No \"New\" and \"andd\" in the graph!",words);
    }
}