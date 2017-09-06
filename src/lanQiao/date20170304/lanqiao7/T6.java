package lanQiao.date20170304.lanqiao7;

public class T6 {
    public static void main(String[] args) {
	int[] arr = new int[9];
	boolean flag = false;
	long count = 0;
	for (arr[0] = 1; arr[0] <= 9; arr[0]++) {
	    for (arr[1] = 1; arr[1] <= 9; arr[1]++) {
		for (int i = 0; i < 1; i++) {
		    if (arr[1] == arr[i]) {
			flag = true;
			break;
		    }
		}
		if (flag) {
		    flag = false;
		    continue;
		}
		for (arr[2] = 1; arr[2] <= 9; arr[2]++) {
		    for (int j = 0; j < 2; j++) {
			if (arr[2] == arr[j]) {
			    flag = true;
			    break;
			}
		    }
		    if (flag) {
			flag = false;
			continue;
		    }
		    for (arr[3] = 1; arr[3] <= 9; arr[3]++) {
			for (int k = 0; k < 3; k++) {
			    if (arr[3] == arr[k]) {
				flag = true;
				break;
			    }
			}
			if (flag) {
			    flag = false;
			    continue;
			}
			for (arr[4] = 1; arr[4] <= 9; arr[4]++) {
			    for (int l = 0; l < 4; l++) {
				if (arr[4] == arr[l]) {
				    flag = true;
				    break;
				}
			    }
			    if (flag) {
				flag = false;
				continue;
			    }
			    for (arr[5] = 1; arr[5] <= 9; arr[5]++) {
				for (int m = 0; m < 5; m++) {
				    if (arr[5] == arr[m]) {
					flag = true;
					break;
				    }
				}
				if (flag) {
				    flag = false;
				    continue;
				}
				for (arr[6] = 1; arr[6] <= 9; arr[6]++) {
				    for (int n = 0; n < 6; n++) {
					if (arr[6] == arr[n]) {
					    flag = true;
					    break;
					}
				    }
				    if (flag) {
					flag = false;
					continue;
				    }
				    for (arr[7] = 1; arr[7] <= 9; arr[7]++) {
					for (int o = 0; o < 7; o++) {
					    if (arr[7] == arr[o]) {
						flag = true;
						break;
					    }
					}
					if (flag) {
					    flag = false;
					    continue;
					}
					for (arr[8] = 1; arr[8] <= 9; arr[8]++) {
					    for (int p = 0; p < 8; p++) {
						if (arr[8] == arr[p]) {
						    flag = true;
						    break;
						}
					    }
					    if (flag) {
						flag = false;
						continue;
					    }
					    if (10 == arr[0] + arr[1] * 1.0 / arr[2] * 1.0
						    + (arr[3] * 100.0 + arr[4] * 10.0 + arr[5] * 1.0)
							    / (arr[6] * 100.0 + arr[7] * 10.0 + arr[8] * 1.0)) {
						count++;
						System.out.println(count);
						for (int r = 0; r < arr.length; r++) {
						    System.out.print(arr[r] + " ");
						}
						System.out.println();
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
}
