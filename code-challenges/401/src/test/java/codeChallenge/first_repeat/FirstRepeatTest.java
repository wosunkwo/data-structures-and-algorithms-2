package codeChallenge.first_repeat;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstRepeatTest {
    @Test
    public void test_empty_FirstRepeat(){
        FirstRepeat o = new FirstRepeat();
        String output  = "";
        assertEquals(o.RepeatWord(""),output);
    }
    @Test
    public void test_ShortBook_FirstRepeat(){
        FirstRepeat o = new FirstRepeat();
        String book = "Once upon a time, there was a brave princess who...";
        String output  = "a";
        assertEquals(o.RepeatWord(book),output);
    }
    @Test
    public void test_LongBook_FirstRepeat(){
        FirstRepeat o = new FirstRepeat();
        String book = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String output  = "it";
        assertEquals(o.RepeatWord(book),output);
    }
    @Test
    public void test_MediumBook_FirstRepeat(){
        FirstRepeat o = new FirstRepeat();
        String book = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String output  = "summer";
        assertEquals(o.RepeatWord(book),output);
    }

    @Test
    public void test_CrazyBook_FirstRepeat(){
        FirstRepeat o = new FirstRepeat();
        String book = "!! was a queer, sultry summe, they123 summer they electrocuted the Rosenbergs, $@#$@#$@ and I they123 know what I was doing in New York...";
        String output  = "they123";
        assertEquals(o.RepeatWord(book),output);
    }

}