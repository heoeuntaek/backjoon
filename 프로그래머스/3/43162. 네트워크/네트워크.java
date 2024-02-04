import java.util.*;

class Solution {
public static ArrayList<Integer>al[];
public static boolean []visited;
public static Stack<Integer>st;
    
    public int solution(int n, int[][] computers) {
        
        al = new ArrayList[n];
         visited = new boolean[n];
        for(int i=0;i<n;i++){
            visited[i] = false;
            al[i] = new ArrayList<>(); 
        }
        st = new Stack<>();
        for(int i=0;i<n;i++){  //열
            for(int j=0; j<n; j++){  //행
                if(i==j)continue;
                if(computers[i][j]==1){
                    al[i].add(j);
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
    
        
        
        int answer = count;
        return answer;
        
    }
    public void dfs(int startNode){
    st.push(startNode);
    visited[startNode] = true;
    while(!st.isEmpty()){
        int pop = st.pop();
    for(int adjNode :al[pop]){
        if(!visited[adjNode]){
            st.push(adjNode);
            visited[adjNode] = true;
        }
    }
    }

    }
    
    }


