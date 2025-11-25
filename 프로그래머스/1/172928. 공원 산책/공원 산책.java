class Solution {
    public int[] solution(String[] park, String[] routes) {

        int sRow = -1;
        int sCol = -1;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    sRow = i;
                    sCol = j;
                    break;
                }
            }
        }

        for (String route: routes) {
            String[] r = route.split(" ");
            String op = r[0];
            int num = Integer.parseInt(r[1]);

            int row = sRow;
            int col = sCol;

            boolean canMove = true;

            for (int k = 1; k <= num; k++) {
                int nr = sRow;
                int nc = sCol;

                switch (op) {
                    case "N": nr = sRow - k; break;
                    case "S": nr = sRow + k; break;
                    case "W": nc = sCol - k; break;
                    case "E": nc = sCol + k; break;
                }
                
                if (nr < 0 || nr >= park.length || nc < 0 || nc >= park[0].length()) {
                    canMove = false;
                    break;
                }

                if (park[nr].charAt(nc) == 'X') {
                    canMove = false;
                    break;
                }

                row = nr;
                col = nc;
            }

            if (canMove) {
                sRow = row;
                sCol = col;
            }
        }

        return new int[]{sRow, sCol};
    }
}