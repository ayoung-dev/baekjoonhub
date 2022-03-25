#include <iostream>
#include <cstdlib>
#include<iomanip>
using namespace std;

int main() {

	int num[1000], c, n;
	
	cin >> c;

	for (int i = 0; i < c; i++) {

		float sum = 0;
		float avr = 0;
		float count = 0;
		float per = 0;

		cin >> n;

		for (int i = 0; i < n; i++) {

			cin >> num[i];
			sum += num[i];

		}

		avr = sum / n;

		for(int i = 0; i < n; i++) {
			
			if(avr < num[i])
				count ++;
		}

		per = (count / n) * 100;

		cout << fixed << setprecision(3) << per << "%" << endl;
	}

	

	return 0;

}