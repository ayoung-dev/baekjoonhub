#include <iostream>
#include <cstdlib>
using namespace std;

int main() {

	int num[1000], n, max = 0;

	float sum = 0;

	cin >> n;

	for (int i = 0;i < n;i++) {
		cin >> num[i];
		sum += num[i];

		if (max < num[i])
			max = num[i];
	}

	sum = sum / max * 100 / n;

	cout << sum;

	return 0;

}