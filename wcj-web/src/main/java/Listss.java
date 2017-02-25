import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wcj on 2016/12/11.
 */


public class Listss {
    public static void main(String[] args) {
        List<Integer> aList = Lists.newArrayList(1,2,3);
        List<String> bList =Lists.newArrayList(Lists.transform(aList, new Function<Integer, String>() {
            @Override
            public String apply(Integer input) {
                return input.toString();
            }
        }));
        System.out.println(bList);
    }

}