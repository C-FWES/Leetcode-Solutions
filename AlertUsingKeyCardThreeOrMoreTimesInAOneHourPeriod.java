import java.util.*;

public class AlertUsingKeyCardThreeOrMoreTimesInAOneHourPeriod {
    public static void main(String[] args) {
        String[] keyNames = new String[]{"d","d","d","d","d","d","d"};
        String[] keyTime = new String[]{"20:41","19:53","20:13","02:49","18:56","16:48","08:37"};
        List<String> alerts = alertNames(keyNames, keyTime);
        for (String alert : alerts) {
            System.out.println(alert);
        }
    }

    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> alerts = new ArrayList<>();
        Map<String, List<Integer>> nameAndTimeMap = new HashMap<>();
        for (int i = 0; i < keyTime.length; i++) {
            String keyUser = keyName[i];
            List<Integer> timeList = nameAndTimeMap.get(keyUser);
            if (timeList == null) {
                timeList = new ArrayList<>();
                nameAndTimeMap.put(keyUser, timeList);
            }
            int time = (keyTime[i].charAt(0) - '0') * 1000 + (keyTime[i].charAt(1) - '0') * 100
                    + (keyTime[i].charAt(3) - '0') * 10 + keyTime[i].charAt(4) - '0';
            timeList.add(time);
        }
        for (Map.Entry<String, List<Integer>> nameAndTime : nameAndTimeMap.entrySet()) {
            List<Integer> times = nameAndTime.getValue();
            if (times.size() < 3) {
                continue;
            }
            Collections.sort(times);
            for (int i = 2; i < times.size(); i++) {
                if (times.get(i) - times.get(i-2) <= 100) {
                    alerts.add(nameAndTime.getKey());
                    break;
                }
            }
        }
        Collections.sort(alerts);
        return alerts;
    }
}
