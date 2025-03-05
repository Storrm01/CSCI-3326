#include <iostream>
using namespace std;

class pet{
    // By default all members are private

    // use public keyword
    public:

    // Attributes - gloabal variables inside the class
    string name;
    int age;
};

int main(){
    pet dog1;
    dog1.name = "Bingo";
    dog1.age = 3;

    pet * dog2 = new pet();
    dog2 -> name = "Spot";
    dog2 -> age = 5;

    cout << "Stack Address: " << &dog2 << endl;
    cout << "Heap Address: " << dog2 << endl;

    return 0;
}