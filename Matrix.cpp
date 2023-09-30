#include <iostream>
using namespace std;

int main()
{
    int n, m;
    cout << "Enter number of rows : ";
    cin >> n;
    cout << "Enter number of columns : ";
    cin >> m;
    int a = n;
    int b = m;
    int c = n;
    int d = m;
    int arr[n][m];
    int sort[a][b];
    int MM[c][d];

    // Matrices Input
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cout << "Enter element"
                 << "(" << i + 1 << ")"
                 << "(" << j + 1 << ")"
                 << ": ";
            cin >> arr[i][j];
            sort[i][j] = arr[i][j];
        }
    }
    cout << endl;

    // row-wise sorting
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            for (int k = 0; k < m - j - 1; k++)
            {
                if (sort[i][k] > sort[i][k + 1])
                {
                    swap(sort[i][k], sort[i][k + 1]);
                }
            }
        }
    }

    // Original Matrix Output
    cout << "Original Matrix >>> " << endl;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }

    // Sorted Matrix Output
    cout << "Sorted Matrix >>>" << endl;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cout << sort[i][j] << " ";
        }
        cout << endl;
    }

    // Adduct Matrix Output
    cout << "Adduct Matrix >>>" << endl;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cout << sort[i][j] + arr[i][j] << " ";
        }
        cout << endl;
    }

    // Matrix Multiplication
    cout << "Multiplied Matrix >>> " << endl;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            int value;
            for (int k = 0; k < n; k++)
            {
                value = +arr[i][k] * sort[k][j];
            }
            MM[i][j] = value;
        }
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cout << MM[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}
