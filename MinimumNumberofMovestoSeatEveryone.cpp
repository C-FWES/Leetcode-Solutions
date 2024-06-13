class Solution {
public:
    int minMovesToSeat(vector<int>& seats, vector<int>& students) {
        // the most minimum move is to find an exact match
        // after that, we have to check proximity
        // take consideration that if two students are the same distance from one chair, then the distance of each of them from other available seat should be checked
        int count = 0;
        sort(seats.begin(), seats.end());
        sort(students.begin(), students.end());
        for (int i = 0; i < seats.size(); ++i) {
            count += abs(seats[i] - students[i]);
        }
        return count;
    }
};
