package com.algoexpert.veryhard.calendarmatching;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        List<Solution.StringMeeting> calendar1 = new ArrayList<Solution.StringMeeting>();
        calendar1.add(new Solution.StringMeeting("9:00", "10:30"));
        calendar1.add(new Solution.StringMeeting("12:00", "13:00"));
        calendar1.add(new Solution.StringMeeting("16:00", "18:00"));

        Solution.StringMeeting dailyBounds1 = new Solution.StringMeeting("9:00", "20:00");

        List<Solution.StringMeeting> calendar2 = new ArrayList<Solution.StringMeeting>();
        calendar2.add(new Solution.StringMeeting("10:00", "11:30"));
        calendar2.add(new Solution.StringMeeting("12:30", "14:30"));
        calendar2.add(new Solution.StringMeeting("14:30", "15:00"));
        calendar2.add(new Solution.StringMeeting("16:00", "17:00"));

        Solution.StringMeeting dailyBounds2 = new Solution.StringMeeting("10:00", "18:30");

        int meetingDuration = 30;

        List<Solution.StringMeeting> expected = new ArrayList<Solution.StringMeeting>();
        expected.add(new Solution.StringMeeting("11:30", "12:00"));
        expected.add(new Solution.StringMeeting("15:00", "16:00"));
        expected.add(new Solution.StringMeeting("18:00", "18:30"));

        List<Solution.StringMeeting> actual =
                Solution.calendarMatching(calendar1, dailyBounds1, calendar2, dailyBounds2, meetingDuration);
        Assert.assertTrue(arraysEqual(expected, actual));

    }

    public boolean arraysEqual(List<Solution.StringMeeting> arr1, List<Solution.StringMeeting> arr2) {
        if (arr1.size() != arr2.size()) return false;

        for (int i = 0; i < arr1.size(); i++) {
            if (!arr1.get(i).start.equals(arr2.get(i).start)
                    || !arr1.get(i).end.equals(arr2.get(i).end)) {
                return false;
            }
        }
        return true;
    }
}
