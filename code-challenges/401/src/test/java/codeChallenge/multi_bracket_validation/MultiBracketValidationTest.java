package codeChallenge.multi_bracket_validation;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void test_emptyString(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = true;
        assertEquals(o.multiBracketValidation(""),result);
    }
    @Test
    public void test_curlyBracket(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = true;
        assertEquals(o.multiBracketValidation("{}"),result);
    }
    @Test
    public void test_curlyBracket_withIn_Square(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = true;
        assertEquals(o.multiBracketValidation("{[]}"),result);
    }
    @Test
    public void test_curlyBracket_squareBracket_curly(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = true;
        assertEquals(o.multiBracketValidation("{}[]{}"),result);
    }
    @Test
    public void test_roundBracket_squareBracket_squareB_ExtraChar_curly(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = true;
        assertEquals(o.multiBracketValidation("()[[TEXT123]]"),result);
    }
    @Test
    public void test_roundBracket_curlyBracket_extraChar_squareB_ExtraChar_curly(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = true;
        assertEquals(o.multiBracketValidation("(){hjadfjh}[[TEXT123]]"),result);
    }
    @Test
    public void test_missingRoundBracket(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = false;
        assertEquals(o.multiBracketValidation("[({}]"),result);
    }
    @Test
    public void test_TwoRoundBracket(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = false;
        assertEquals(o.multiBracketValidation("(]("),result);
    }
    @Test
    public void test_TwoRoundBracket_unEven(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = false;
        assertEquals(o.multiBracketValidation("{(})"),result);
    }
    @Test
    public void test_singleBracket(){
        MultiBracketValidation o = new MultiBracketValidation();
        boolean result = false;
        assertEquals(o.multiBracketValidation("{"),result);
    }
}