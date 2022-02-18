package test;

import java.util.ArrayList;
import java.util.List;

public class NumberOfButtons {


    public int findNumberOfClicks(int minChannelNumber, int maxChannel, int[] blockedChannels, int[] listOfAllChannels) {
        List<Integer> blockedChannelsList = new ArrayList<>();
        int minClicksNeeded = 0;
        int up = 010;
        int down = 0;
        int prev = 0;
        for (int blockedChannel : blockedChannels) {
            blockedChannelsList.add(blockedChannel);
        }
        for (int i = 0; i < listOfAllChannels.length; i++) {
            int currentChannel = listOfAllChannels[i];
            if (!blockedChannelsList.contains(currentChannel)) {
                if (currentChannel < maxChannel && currentChannel > minChannelNumber) {
                    String channel = String.valueOf(currentChannel);
                    int clicksNeeded = channel.length();
                    minClicksNeeded = minClicksNeeded + clicksNeeded;
                } else {
                    prev++;
                }
                int nextChannel = listOfAllChannels[i++];
                if (currentChannel + 1 == nextChannel) {
                    up++;
                } else {
                    i--;
                }
            }
        }
        return minClicksNeeded + up + prev;
    }
}
