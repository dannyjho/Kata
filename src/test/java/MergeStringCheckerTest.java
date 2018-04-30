import org.junit.Test;
import static org.junit.Assert.*;
public class MergeStringCheckerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", MergedStringChecker.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", MergedStringChecker.isMerge("codewars", "cdwr", "oeas"));
        assertTrue("Going bananas!", MergedStringChecker.isMerge("bananas", "a", "banans"));
        assertTrue("Going bananas!", MergedStringChecker.isMerge("bananas", "a", "bannas"));
        assertTrue("Going bananas!", MergedStringChecker.isMerge("bananas", "baaa", "nns"));
        assertTrue("p4,?`?G.&gt;j' is a merge of 'p?G.&gt;j' and '4,?`", MergedStringChecker.isMerge("p4,?`?G.&gt;j", "p?G.&gt;j", "4,?`"));
        assertTrue("'Can we merge it? Yes, we can!' is a merge of 'Ca eerg t es, w c!' and 'nw mei?Yean' ", MergedStringChecker.isMerge("Can we merge it? Yes, we can!", "Ca eerg t es, w c!", "nw mei?Yean"));
    }
}
