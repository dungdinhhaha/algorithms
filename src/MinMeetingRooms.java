import java.util.Arrays;

 class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MinMeetingRooms {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        int n = intervals.length;
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];
        for (int i = 0; i < n; i++) {
            startTimes[i] = intervals[i].start;
            endTimes[i] = intervals[i].end;
        }
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int roomsNeeded = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            if (startTimes[i] < endTimes[endIndex]) {

                roomsNeeded++;
            } else {
                endIndex++;
            }
        }

        return roomsNeeded;
    }

    public static void main(String[] args) {
        Interval[] intervals = {new Interval(30, 40), new Interval(0, 20), new Interval(60, 150)};
        MinMeetingRooms solution = new MinMeetingRooms();
        System.out.println(solution.minMeetingRooms(intervals)); // Output should be 2
    }
}
