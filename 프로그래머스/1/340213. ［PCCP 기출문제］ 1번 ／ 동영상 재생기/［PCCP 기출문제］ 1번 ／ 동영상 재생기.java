class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        // 전부 초 단위로 변환
        int video_len_s = second(video_len);
        int pos_s = second(pos);
        int op_start_s = second(op_start);
        int op_end_s = second(op_end);
        
        // 현재 위치가 오프닝 시간대 안인지 검사
        if(pos_s >= op_start_s && pos_s <= op_end_s) {
            pos_s = op_end_s;
        }
        
        // 입력 명령 검사 시작
        for(String c : commands) {
        	// prev가 들어왔다면 prev 메소드 호출
            if(c.equals("prev")) {
                pos_s = prev(pos_s);
            } else {
            	// prev가 아니면 next이므로 next 메소드 호출
                pos_s = next(pos_s, video_len_s);
            }
        	
            // 기능을 실행한 뒤 결과 시간이 다시 한 번 오프닝 시간대 안인지 검사
            // 이걸 for문 밖에 둬서 일부 테스트 케이스가 실패함 
            if(pos_s >= op_start_s && pos_s <= op_end_s) {
                pos_s = op_end_s;
            }
        }
        
        // 출력을 위해 다시 분:초 포맷으로 변경
        String minute = String.format("%02d", (int) Math.floor((double) pos_s / 60));
        String second = String.format("%02d", pos_s % 60);
        
        return minute+":"+second;
        
    }
    
    private static int prev(int pos) {
        if ((pos - 10) <= 0) {
            return 0;
        } else {
            return pos - 10;
        }
    }
    
    private static int next(int pos, int video_len) {
        if ((pos + 10) >= video_len) {
            return video_len;
        } else {
            return pos + 10;
        }
    }
    
    private static int second(String time) {
        String[] time_ms = time.split(":");
        return (Integer.parseInt(time_ms[0]) * 60) +  Integer.parseInt(time_ms[1]);
    }
}
