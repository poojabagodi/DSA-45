// Problem Statement: There is one meeting room in a firm. You are given two arrays, start and end each of size N.For an index ‘i’, start[i] denotes the starting time of the ith meeting while end[i]  will denote the ending time of the ith meeting. Find the maximum number of meetings that can be accommodated if only one meeting can happen in the room at a  particular time. Print the order in which these meetings will be performed.

// Example:

// Input:  N = 6,  start[] = {1,3,0,5,8,5}, end[] =  {2,4,5,7,9,9}

// Output: 1 2 4 5



package DAY9;
import java.util.*;
class meeting{
        int start;
        int end;
        int pos;
        meeting(int s, int e, int p){
            this.start = s;
            this.end = e;
            this.pos = p;
        }
    }

class meetingComparator implements  Comparator<meeting>{
    @Override
    public int compare(meeting m1, meeting m2) {
        if(m1.end<m2.end){
            return -1;
        }
        else if(m1.end>m2.end){
            return 1;
        }
        else if(m1.pos<m2.pos){
            return-1;

        }
        return 1;

    }
} 


class  NmeetinginoneRoom{
    static void maxMeeting(int[] start,int[] end,int n){
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i=0;i<n;i++){
            meet.add(new meeting(start[i],end[i],i+1));
           
        }
         meetingComparator mc=new meetingComparator();
            Collections.sort(meet,mc);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meet.get(0).pos);
        int limit=meet.get(0).end;
        for(int i=1;i<start.length;i++){
            if(meet.get(i).start>limit){
                ans.add(meet.get(i).pos);
                limit=meet.get(i).end;
            }

        }

        System.out.println("The order in which the meetings will be performed is ");
        for(int i = 0;i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        maxMeeting(start, end, n);
    }
}